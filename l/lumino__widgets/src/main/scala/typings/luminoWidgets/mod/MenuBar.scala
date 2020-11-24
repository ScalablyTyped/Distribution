package typings.luminoWidgets.mod

import typings.luminoWidgets.menubarMod.MenuBar.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "MenuBar")
@js.native
/**
  * Construct a new menu bar.
  *
  * @param options - The options for initializing the menu bar.
  */
class MenuBar ()
  extends typings.luminoWidgets.menubarMod.MenuBar {
  def this(options: IOptions) = this()
}
@JSImport("@lumino/widgets", "MenuBar")
@js.native
object MenuBar extends js.Object {
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typings.luminoWidgets.menubarMod.MenuBar.Renderer = js.native
  
  /**
    * The default implementation of `IRenderer`.
    *
    * #### Notes
    * Subclasses are free to reimplement rendering methods as needed.
    */
  @js.native
  /**
    * Construct a new renderer.
    */
  class Renderer ()
    extends typings.luminoWidgets.menubarMod.MenuBar.Renderer
}
