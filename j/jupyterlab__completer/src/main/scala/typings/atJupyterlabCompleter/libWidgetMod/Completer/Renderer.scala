package typings.atJupyterlabCompleter.libWidgetMod.Completer

import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IRenderer`.
  */
@JSImport("@jupyterlab/completer/lib/widget", "Completer.Renderer")
@js.native
class Renderer () extends IRenderer {
  /**
    * Create an item node (an `li` element) for a text completer menu.
    */
  /* CompleteClass */
  override def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[String]): HTMLLIElement = js.native
}

