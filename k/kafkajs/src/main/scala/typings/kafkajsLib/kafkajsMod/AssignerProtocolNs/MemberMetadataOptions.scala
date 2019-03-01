package typings
package kafkajsLib.kafkajsMod.AssignerProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberMetadataOptions extends js.Object {
  var topics: js.Array[java.lang.String]
  var userData: js.UndefOr[nodeLib.Buffer] = js.undefined
  var version: scala.Double
}

object MemberMetadataOptions {
  @scala.inline
  def apply(topics: js.Array[java.lang.String], version: scala.Double, userData: nodeLib.Buffer = null): MemberMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("topics")(topics)
    __obj.updateDynamic("version")(version)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[MemberMetadataOptions]
  }
}

