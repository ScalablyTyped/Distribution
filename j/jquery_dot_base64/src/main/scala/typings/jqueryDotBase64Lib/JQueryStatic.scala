package typings
package jqueryDotBase64Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var base64: JQueryBase64Static
}

object JQueryStatic {
  @scala.inline
  def apply(base64: JQueryBase64Static): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base64")(base64)
    __obj.asInstanceOf[JQueryStatic]
  }
}

