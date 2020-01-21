package typings.jupyterlabLogconsole.widgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceDisplayed extends js.Object {
  var source: String
  var version: Double
}

object ISourceDisplayed {
  @scala.inline
  def apply(source: String, version: Double): ISourceDisplayed = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISourceDisplayed]
  }
}

