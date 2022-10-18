package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.CheckboxChoiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObjectsChoiceMod {
  
  /**
    * Represents a choice for several question-types.
    *
    * @template T
    * The type of the answers.
    */
  @JSImport("inquirer/lib/objects/choice", JSImport.Default)
  @js.native
  open class default[T /* <: Answers */] protected ()
    extends StObject
       with Choice[T] {
    /**
      * Initializes a new instance of the {@link Choice `Choice<T>`} class.
      *
      * @param value
      * The value of the choice.
      *
      * @param answers
      * An object which contains the answers to the questions.
      */
    def this(value: Any, answers: T) = this()
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    @JSName("disabled")
    var disabled_Choice: Boolean = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    @JSName("name")
    var name_Choice: String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    @JSName("short")
    var short_Choice: String = js.native
  }
  
  /**
    * Represents a choice for several question-types.
    *
    * @template T
    * The type of the answers.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.inquirer.mod.ChoiceBase because Already inherited
  - typings.inquirer.mod.ChoiceOptions because Already inherited
  - typings.inquirer.mod.ExpandChoiceOptions because var conflicts: extra, name, short, `type`, value. Inlined key */ trait Choice[T /* <: Answers */]
    extends StObject
       with CheckboxChoiceOptions[T] {
    
    /**
      * @inheritdoc
      */
    @JSName("disabled")
    var disabled_Choice: Boolean
    
    /**
      * The key to press for selecting the choice.
      *
      * @inheritdoc
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * @inheritdoc
      */
    @JSName("name")
    var name_Choice: String
    
    /**
      * @inheritdoc
      */
    @JSName("short")
    var short_Choice: String
  }
  object Choice {
    
    inline def apply[T /* <: Answers */](disabled: Boolean, name: String, short: String): Choice[T] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice[T]]
    }
    
    extension [Self <: Choice[?], T /* <: Answers */](x: Self & Choice[T]) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
}
