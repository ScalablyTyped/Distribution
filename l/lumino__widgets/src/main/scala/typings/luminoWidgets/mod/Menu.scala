package typings.luminoWidgets.mod

import typings.luminoWidgets.typesMenuMod.Menu.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "Menu")
@js.native
open class Menu protected ()
  extends typings.luminoWidgets.typesMenuMod.Menu {
  /**
    * Construct a new menu.
    *
    * @param options - The options for initializing the menu.
    */
  def this(options: IOptions) = this()
}
/* static members */
object Menu {
  
  @JSImport("@lumino/widgets", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default implementation of `IRenderer`.
    *
    * #### Notes
    * Subclasses are free to reimplement rendering methods as needed.
    */
  @JSImport("@lumino/widgets", "Menu.Renderer")
  @js.native
  open class Renderer ()
    extends typings.luminoWidgets.typesMenuMod.Menu.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "Menu.defaultRenderer")
  @js.native
  val defaultRenderer: typings.luminoWidgets.typesMenuMod.Menu.Renderer = js.native
  
  /**
    * Save window data used for menu positioning in transient cache.
    *
    * In order to avoid layout trashing it is recommended to invoke this
    * method immediately prior to opening the menu and any DOM modifications
    * (like closing previously visible menu, or adding a class to menu widget).
    *
    * The transient cache will be released upon `open()` call.
    */
  inline def saveWindowData(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveWindowData")().asInstanceOf[Unit]
}
