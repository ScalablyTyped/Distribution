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
    val __obj = js.Dynamic.literal(`action-loc-key` = `action-loc-key`, `launch-image` = `launch-image`, `loc-args` = `loc-args`, `loc-key` = `loc-key`, `title-loc-args` = `title-loc-args`, `title-loc-key` = `title-loc-key`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[APNSAlert]
  }
}

