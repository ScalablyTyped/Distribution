package typings.inquirer

import typings.inquirer.inquirerStrings.separator
import typings.inquirer.mod.ChoiceBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object separatorMod {
  
  /**
    * Represents a choice-item separator.
    */
  @JSImport("inquirer/lib/objects/separator", JSImport.Namespace)
  @js.native
  /**
    * Initializes a new instance of the `Separator` class.
    *
    * @param line
    * The text of the separator.
    */
  class ^ () extends Separator {
    def this(line: String) = this()
  }
  
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
  @JSImport("inquirer/lib/objects/separator", "exclude")
  @js.native
  def exclude(item: js.Any): Boolean = js.native
  
  /**
    * Represents a choice-item separator.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.inquirer.mod.SeparatorOptions because var conflicts: `type`. Inlined line */ @js.native
  trait Separator extends ChoiceBase {
    
    /**
      * @inheritdoc
      */
    var line: js.UndefOr[String] = js.native
    
    /**
      * @inheritdoc
      */
    @JSName("type")
    val type_Separator: separator = js.native
  }
  object Separator {
    
    @scala.inline
    def apply(`type`: separator): Separator = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Separator]
    }
    
    @scala.inline
    implicit class SeparatorMutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
