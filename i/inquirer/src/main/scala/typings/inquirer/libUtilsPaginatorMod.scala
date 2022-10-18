package typings.inquirer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPaginatorMod {
  
  /**
    * Provides the functionality to draw paginated content using a {@link ScreenManager `ScreenManager`}.
    */
  @JSImport("inquirer/lib/utils/paginator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Paginator {
    /**
      * Initializes a new instance of the {@link Paginator `Paginator`} class.
      *
      * @param screenManager
      * A screen-manager for drawing the paginated content.
      */
    def this(screenManager: typings.inquirer.libUtilsScreenManagerMod.default) = this()
    def this(screenManager: typings.inquirer.libUtilsScreenManagerMod.default, options: PaginatorOptions) = this()
  }
  
  /**
    * Provides the functionality to draw paginated content using a {@link ScreenManager `ScreenManager`}.
    */
  @js.native
  trait Paginator extends StObject {
    
    /**
      * Gets or sets the index of the last focused line.
      */
    /* protected */ var lastIndex: Double = js.native
    
    /**
      * Paginates the specified {@link content `content`}.
      *
      * @param content
      * The content to paginate.
      *
      * @param selectedIndex
      * The number of the selected line.
      *
      * @param pageSize
      * The number of lines to display at a time.
      *
      * @returns
      * The paginated content.
      */
    def paginate(content: String, selectedIndex: Double): String = js.native
    def paginate(content: String, selectedIndex: Double, pageSize: Double): String = js.native
    
    /**
      * Gets or sets the index of the currently focused line.
      */
    /* protected */ var pointer: Double = js.native
    
    /**
      * Gets or sets an object for drawing the paginated content.
      */
    /* protected */ var screen: typings.inquirer.libUtilsScreenManagerMod.default = js.native
  }
  
  trait PaginatorOptions extends StObject {
    
    /**
      * Whether or not to loop the content.
      */
    var isInfinite: Boolean
  }
  object PaginatorOptions {
    
    inline def apply(isInfinite: Boolean): PaginatorOptions = {
      val __obj = js.Dynamic.literal(isInfinite = isInfinite.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginatorOptions]
    }
    
    extension [Self <: PaginatorOptions](x: Self) {
      
      inline def setIsInfinite(value: Boolean): Self = StObject.set(x, "isInfinite", value.asInstanceOf[js.Any])
    }
  }
}
