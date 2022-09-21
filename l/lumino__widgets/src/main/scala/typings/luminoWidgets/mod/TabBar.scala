package typings.luminoWidgets.mod

import typings.luminoWidgets.tabbarMod.TabBar.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "TabBar")
@js.native
/**
  * Construct a new tab bar.
  *
  * @param options - The options for initializing the tab bar.
  */
open class TabBar[T] ()
  extends typings.luminoWidgets.tabbarMod.TabBar[T] {
  def this(options: IOptions[T]) = this()
}
object TabBar {
  
  /**
    * The default implementation of `IRenderer`.
    *
    * #### Notes
    * Subclasses are free to reimplement rendering methods as needed.
    */
  @JSImport("@lumino/widgets", "TabBar.Renderer")
  @js.native
  open class Renderer ()
    extends typings.luminoWidgets.tabbarMod.TabBar.Renderer
  
  /**
    * A selector which matches the add button node in the tab bar.
    */
  @JSImport("@lumino/widgets", "TabBar.addButtonSelector")
  @js.native
  val addButtonSelector: /* ".lm-TabBar-addButton" */ String = js.native
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "TabBar.defaultRenderer")
  @js.native
  val defaultRenderer: typings.luminoWidgets.tabbarMod.TabBar.Renderer = js.native
}
