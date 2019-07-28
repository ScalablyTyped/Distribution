package typings.atJupyterlabInspector.libTokensMod

import typings.atJupyterlabInspector.libTokensMod.IInspectorNs.IInspectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInspector extends js.Object {
  /**
    * The source of events the inspector listens for.
    */
  var source: IInspectable | Null
}

object IInspector {
  @scala.inline
  def apply(source: IInspectable = null): IInspector = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[IInspector]
  }
}

