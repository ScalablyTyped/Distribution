package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Execute extends js.Object {
  var execute: scala.Boolean
  var http: scala.Boolean
  var sendto: scala.Boolean
}

object Anon_Execute {
  @scala.inline
  def apply(execute: scala.Boolean, http: scala.Boolean, sendto: scala.Boolean): Anon_Execute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("http")(http)
    __obj.updateDynamic("sendto")(sendto)
    __obj.asInstanceOf[Anon_Execute]
  }
}

