package typings.inquirer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.inquirer.bottomBarMod.^
import typings.inquirer.inquirerStrings.separator
import typings.inquirer.mod.AllChoiceMap
import typings.inquirer.mod.Answers
import typings.inquirer.mod.ChoiceCollection
import typings.inquirer.mod.DistinctChoice
import typings.inquirer.mod.StreamOptions
import typings.inquirer.mod.prompts.PromptCollection
import typings.inquirer.mod.ui.BottomBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BottomBar extends StObject {
    
    /**
      * Represents the bottom-bar UI.
      */
    var BottomBar: Instantiable1[/* options */ js.UndefOr[BottomBarOptions], ^]
    
    /**
      * Represents the prompt ui.
      */
    var Prompt: Instantiable2[
        /* prompts */ PromptCollection, 
        /* options */ js.UndefOr[StreamOptions], 
        typings.inquirer.promptMod.^
      ]
  }
  object BottomBar {
    
    @scala.inline
    def apply(
      BottomBar: Instantiable1[/* options */ js.UndefOr[BottomBarOptions], ^],
      Prompt: Instantiable2[
          /* prompts */ PromptCollection, 
          /* options */ js.UndefOr[StreamOptions], 
          typings.inquirer.promptMod.^
        ]
    ): BottomBar = {
      val __obj = js.Dynamic.literal(BottomBar = BottomBar.asInstanceOf[js.Any], Prompt = Prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomBar]
    }
    
    @scala.inline
    implicit class BottomBarMutableBuilder[Self <: BottomBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomBar(value: Instantiable1[/* options */ js.UndefOr[BottomBarOptions], ^]): Self = StObject.set(x, "BottomBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrompt(
        value: Instantiable2[
              /* prompts */ PromptCollection, 
              /* options */ js.UndefOr[StreamOptions], 
              typings.inquirer.promptMod.^
            ]
      ): Self = StObject.set(x, "Prompt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Choices extends StObject {
    
    /**
      * The choices of the prompt.
      */
    var choices: typings.inquirer.choicesMod.^[Answers]
  }
  object Choices {
    
    @scala.inline
    def apply(choices: typings.inquirer.choicesMod.^[Answers]): Choices = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choices]
    }
    
    @scala.inline
    implicit class ChoicesMutableBuilder[Self <: Choices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoices(value: typings.inquirer.choicesMod.^[Answers]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default[T /* <: Answers */] extends StObject {
    
    /**
      * The default value of the question.
      */
    var default: js.Any
    
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
    
    @scala.inline
    def apply[T /* <: Answers */](choices: ChoiceCollection[T], default: js.Any, message: String, `type`: String): Default[T] = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default[?], T /* <: Answers */] (val x: Self & Default[T]) extends AnyVal {
      
      @scala.inline
      def setChoices(value: ChoiceCollection[T]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesVarargs(value: DistinctChoice[AllChoiceMap[Answers]]*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsFinal extends StObject {
    
    var isFinal: js.UndefOr[Boolean] = js.undefined
  }
  object IsFinal {
    
    @scala.inline
    def apply(): IsFinal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsFinal]
    }
    
    @scala.inline
    implicit class IsFinalMutableBuilder[Self <: IsFinal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFinalUndefined: Self = StObject.set(x, "isFinal", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: separator
  }
  object Type {
    
    @scala.inline
    def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("separator")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofSeparator extends StObject {
    
    /**
      * Checks whether the specified `item` is not a separator.
      *
      * @param item
      * The item to check.
      *
      * @returns
      * A value indicating whether the item is not a separator.
      */
    /* static member */
    def exclude(item: js.Any): Boolean
  }
  object TypeofSeparator {
    
    @scala.inline
    def apply(exclude: js.Any => Boolean): TypeofSeparator = {
      val __obj = js.Dynamic.literal(exclude = js.Any.fromFunction1(exclude))
      __obj.asInstanceOf[TypeofSeparator]
    }
    
    @scala.inline
    implicit class TypeofSeparatorMutableBuilder[Self <: TypeofSeparator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Any => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    }
  }
  
  trait Ui extends StObject {
    
    var ui: typings.inquirer.promptMod.^
  }
  object Ui {
    
    @scala.inline
    def apply(ui: typings.inquirer.promptMod.^): Ui = {
      val __obj = js.Dynamic.literal(ui = ui.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ui]
    }
    
    @scala.inline
    implicit class UiMutableBuilder[Self <: Ui] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUi(value: typings.inquirer.promptMod.^): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    }
  }
}
