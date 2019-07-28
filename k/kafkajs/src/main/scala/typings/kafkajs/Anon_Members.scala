package typings.kafkajs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Members extends js.Object {
  var members: js.Array[Anon_MemberId]
  var topics: js.Array[_]
  var userData: js.UndefOr[Buffer] = js.undefined
}

object Anon_Members {
  @scala.inline
  def apply(members: js.Array[Anon_MemberId], topics: js.Array[_], userData: Buffer = null): Anon_Members = {
    val __obj = js.Dynamic.literal(members = members, topics = topics)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[Anon_Members]
  }
}

