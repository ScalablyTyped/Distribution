package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFinding extends js.Object {
  /**
    * Zero-based ending index of the found text, exclusively.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The type of information stored in this text range (e.g. HumanName,
    * BirthDate, Address, etc.)
    */
  var infoType: js.UndefOr[String] = js.native
  /**
    * Zero-based starting index of the found text, inclusively.
    */
  var start: js.UndefOr[String] = js.native
}

object SchemaFinding {
  @scala.inline
  def apply(end: String = null, infoType: String = null, start: String = null): SchemaFinding = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFinding]
  }
}

