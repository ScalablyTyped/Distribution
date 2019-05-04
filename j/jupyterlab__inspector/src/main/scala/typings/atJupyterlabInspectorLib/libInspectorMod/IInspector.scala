package typings
package atJupyterlabInspectorLib.libInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInspector extends js.Object {
  /**
    * The source of events the inspector listens for.
    */
  var source: atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectable | scala.Null
  /**
    * Create an inspector child item and return a disposable to remove it.
    *
    * @param item - The inspector child item being added to the inspector.
    *
    * @returns A disposable that removes the child item from the inspector.
    */
  def add(item: atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectorItem): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable
}

object IInspector {
  @scala.inline
  def apply(
    add: atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectorItem => atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable,
    source: atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectable = null
  ): IInspector = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[IInspector]
  }
}

