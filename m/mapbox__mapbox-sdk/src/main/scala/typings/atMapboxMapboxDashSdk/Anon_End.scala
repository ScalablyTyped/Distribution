package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: Double
  var fonts: js.Array[String]
  var ownerId: js.UndefOr[String] = js.undefined
  var start: Double
}

object Anon_End {
  @scala.inline
  def apply(end: Double, fonts: js.Array[String], start: Double, ownerId: String = null): Anon_End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

