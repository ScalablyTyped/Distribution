package typings.inquirer

import typings.inquirer.inquirerStrings.separator
import typings.inquirer.mod.ChoiceBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  class ^ ()
    extends StObject
       with Separator {
    def this(line: String) = this()
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    var line: js.UndefOr[String] = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    @JSName("type")
    override val type_Separator: separator = js.native
  }
  @JSImport("inquirer/lib/objects/separator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def exclude(item: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Represents a choice-item separator.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.inquirer.mod.SeparatorOptions because var conflicts: `type`. Inlined line */ trait Separator
    extends StObject
       with ChoiceBase {
    
    /**
      * @inheritdoc
      */
    var line: js.UndefOr[String]
    
    /**
      * @inheritdoc
      */
    @JSName("type")
    val type_Separator: separator
  }
  object Separator {
    
    inline def apply(): Separator = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("separator")
      __obj.asInstanceOf[Separator]
    }
    
    extension [Self <: Separator](x: Self) {
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
