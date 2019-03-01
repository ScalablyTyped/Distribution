package typings
package jpmLib.sdkUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataURL extends js.Object {
  var base64: java.lang.String
  var data: java.lang.String
  var mimeType: java.lang.String
  var parameters: js.Object
}

object DataURL {
  @scala.inline
  def apply(
    base64: java.lang.String,
    data: java.lang.String,
    mimeType: java.lang.String,
    parameters: js.Object,
    toString: js.Function0[java.lang.String]
  ): DataURL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base64")(base64)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[DataURL]
  }
}

