package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSAlert extends js.Object {
  var `action-loc-key`: java.lang.String
  var body: java.lang.String
  var `launch-image`: java.lang.String
  var `loc-args`: js.Array[java.lang.String]
  var `loc-key`: java.lang.String
  var title: java.lang.String
  var `title-loc-args`: js.Array[java.lang.String]
  var `title-loc-key`: java.lang.String
}

object APNSAlert {
  @scala.inline
  def apply(
    `action-loc-key`: java.lang.String,
    body: java.lang.String,
    `launch-image`: java.lang.String,
    `loc-args`: js.Array[java.lang.String],
    `loc-key`: java.lang.String,
    title: java.lang.String,
    `title-loc-args`: js.Array[java.lang.String],
    `title-loc-key`: java.lang.String
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

