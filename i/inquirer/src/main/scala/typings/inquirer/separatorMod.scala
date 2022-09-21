package typings.inquirer

import typings.inquirer.mod.default.Separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object separatorMod {
  
  /**
    * Represents a choice-item separator.
    */
  @JSImport("inquirer/lib/objects/separator", JSImport.Default)
  @js.native
  /**
    * Initializes a new instance of the {@link Separator `Separator`} class.
    *
    * @param line
    * The text of the separator.
    */
  open class default () extends Separator {
    def this(line: String) = this()
  }
  object default {
    
    @JSImport("inquirer/lib/objects/separator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks whether the specified {@link item `item`} is not a separator.
      *
      * @param item
      * The item to check.
      *
      * @returns
      * A value indicating whether the item is not a separator.
      */
    /* static member */
    inline def exclude(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
