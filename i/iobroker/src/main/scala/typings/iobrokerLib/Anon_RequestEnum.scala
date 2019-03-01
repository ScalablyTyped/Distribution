package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestEnum extends js.Object {
  var requestEnum: java.lang.String
  var result: stdLib.Record[java.lang.String, _]
}

object Anon_RequestEnum {
  @scala.inline
  def apply(requestEnum: java.lang.String, result: stdLib.Record[java.lang.String, _]): Anon_RequestEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestEnum")(requestEnum)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_RequestEnum]
  }
}

