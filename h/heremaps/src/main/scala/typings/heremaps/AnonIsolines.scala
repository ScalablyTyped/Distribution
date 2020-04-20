package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsolines extends js.Object {
  var MetaInfo: AnonTimestamp
  var View: js.Array[AnonResult]
  var isolines: js.Array[_]
}

object AnonIsolines {
  @scala.inline
  def apply(MetaInfo: AnonTimestamp, View: js.Array[AnonResult], isolines: js.Array[_]): AnonIsolines = {
    val __obj = js.Dynamic.literal(MetaInfo = MetaInfo.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], isolines = isolines.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsolines]
  }
}

