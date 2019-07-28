package typings.kafkajs.kafkajsMod.AssignerProtocolNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberMetadataOptions extends js.Object {
  var topics: js.Array[String]
  var userData: js.UndefOr[Buffer] = js.undefined
  var version: Double
}

object MemberMetadataOptions {
  @scala.inline
  def apply(topics: js.Array[String], version: Double, userData: Buffer = null): MemberMetadataOptions = {
    val __obj = js.Dynamic.literal(topics = topics, version = version)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[MemberMetadataOptions]
  }
}

