package typings.inquirer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginatorMod {
  
  /**
    * Provides the functionality to draw paginated content using a `ScreenManager`.
    */
  @JSImport("inquirer/lib/utils/paginator", JSImport.Namespace)
  @js.native
  class ^ protected () extends Paginator {
    /**
      * Initializes a new instance of the `Paginator` class.
      *
      * @param screenManager
      * A screen-manager for drawing the paginated content.
      */
    def this(screenManager: typings.inquirer.screenManagerMod.^) = this()
  }
  
  /**
    * Provides the functionality to draw paginated content using a `ScreenManager`.
    */
  @js.native
  trait Paginator extends StObject {
    
    /**
      * Gets or sets the index of the last focused line.
      */
    var lastIndex: Double = js.native
    
    /**
      * Paginates the specified `content`.
      *
      * @param content
      * The content to paginate.
      *
      * @param selectedIndex
      * The number of the selected line.
      *
      * @returns
      * The paginated content.
      */
    def paginate(content: String, selectedIndex: Double): String = js.native
    
    /**
      * Gets or sets the index of the currently focused line.
      */
    var pointer: Double = js.native
    
    /**
      * Gets or sets an object for drawing the paginated content.
      */
    var screen: typings.inquirer.screenManagerMod.^ = js.native
  }
  object Paginator {
    
    @scala.inline
    def apply(
      lastIndex: Double,
      paginate: (String, Double) => String,
      pointer: Double,
      screen: typings.inquirer.screenManagerMod.^
    ): Paginator = {
      val __obj = js.Dynamic.literal(lastIndex = lastIndex.asInstanceOf[js.Any], paginate = js.Any.fromFunction2(paginate), pointer = pointer.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paginator]
    }
    
    @scala.inline
    implicit class PaginatorMutableBuilder[Self <: Paginator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginate(value: (String, Double) => String): Self = StObject.set(x, "paginate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointer(value: Double): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen(value: typings.inquirer.screenManagerMod.^): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    }
  }
}
