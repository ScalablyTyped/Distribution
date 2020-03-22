package typings.jupyterlabLogconsole.widgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceDisplayed extends js.Object {
  var source: String | Null
  var version: Double | Null
}

object ISourceDisplayed {
  @scala.inline
  def apply(source: String = null, version: Int | Double = null): ISourceDisplayed = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceDisplayed]
  }
}

