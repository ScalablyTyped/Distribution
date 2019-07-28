package typings.kiiDashCloudDashSdk.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSAlert extends js.Object {
  var `action-loc-key`: String
  var body: String
  var `launch-image`: String
  var `loc-args`: js.Array[String]
  var `loc-key`: String
  var title: String
  var `title-loc-args`: js.Array[String]
  var `title-loc-key`: String
}

object APNSAlert {
  @scala.inline
  def apply(
    `action-loc-key`: String,
    body: String,
    `launch-image`: String,
    `loc-args`: js.Array[String],
    `loc-key`: String,
    title: String,
    `title-loc-args`: js.Array[String],
    `title-loc-key`: String
  ): APNSAlert = {
    val __obj = js.Dynamic.literal(body = body, title = title)
    __obj.updateDynamic("action-loc-key")(`action-loc-key`)
    __obj.updateDynamic("launch-image")(`launch-image`)
    __obj.updateDynamic("loc-args")(`loc-args`)
    __obj.updateDynamic("loc-key")(`loc-key`)
    __obj.updateDynamic("title-loc-args")(`title-loc-args`)
    __obj.updateDynamic("title-loc-key")(`title-loc-key`)
    __obj.asInstanceOf[APNSAlert]
  }
}

