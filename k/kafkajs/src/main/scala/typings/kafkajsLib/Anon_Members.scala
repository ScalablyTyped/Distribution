package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Members extends js.Object {
  var members: js.Array[Anon_MemberId]
  var topics: js.Array[_]
  var userData: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object Anon_Members {
  @scala.inline
  def apply(members: js.Array[Anon_MemberId], topics: js.Array[_], userData: nodeLib.Buffer = null): Anon_Members = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("topics")(topics)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[Anon_Members]
  }
}

