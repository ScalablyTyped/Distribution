package typings.inquirer

import typings.inquirer.inquirerStrings.separator
import typings.inquirer.libObjectsChoicesMod.default
import typings.inquirer.mod.AllChoiceMap
import typings.inquirer.mod.Answers
import typings.inquirer.mod.ChoiceCollection
import typings.inquirer.mod.DistinctChoice
import typings.inquirer.mod.inquirer.ui.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Choices extends StObject {
    
    /**
      * The choices of the prompt.
      */
    var choices: default[Answers]
  }
  object Choices {
    
    inline def apply(choices: default[Answers]): Choices = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choices]
    }
    
    extension [Self <: Choices](x: Self) {
      
      inline def setChoices(value: default[Answers]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default[T /* <: Answers */] extends StObject {
    
    /**
      * The default value of the question.
      */
    var default: Any
    
    /**
      * The choices of the question.
      */
    var choices: ChoiceCollection[T]
    
    /**
      * The message to show to the user.
      */
    var message: String
    
    /**
      * The type of the question.
      */
    var `type`: String
  }
  object Default {
    
    inline def apply[T /* <: Answers */](choices: ChoiceCollection[T], default: Any, message: String, `type`: String): Default[T] = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    extension [Self <: Default[?], T /* <: Answers */](x: Self & Default[T]) {
      
      inline def setChoices(value: ChoiceCollection[T]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesVarargs(value: (DistinctChoice[T, AllChoiceMap[T]])*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsFinal extends StObject {
    
    var isFinal: js.UndefOr[Boolean] = js.undefined
  }
  object IsFinal {
    
    inline def apply(): IsFinal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsFinal]
    }
    
    extension [Self <: IsFinal](x: Self) {
      
      inline def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
      
      inline def setIsFinalUndefined: Self = StObject.set(x, "isFinal", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: separator
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("separator")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ui[T /* <: Answers */] extends StObject {
    
    var ui: Prompt[T]
  }
  object Ui {
    
    inline def apply[T /* <: Answers */](ui: Prompt[T]): Ui[T] = {
      val __obj = js.Dynamic.literal(ui = ui.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ui[T]]
    }
    
    extension [Self <: Ui[?], T /* <: Answers */](x: Self & Ui[T]) {
      
      inline def setUi(value: Prompt[T]): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    }
  }
}
