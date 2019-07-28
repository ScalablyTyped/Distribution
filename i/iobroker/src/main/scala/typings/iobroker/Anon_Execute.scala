package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Execute extends js.Object {
  var execute: Boolean
  var http: Boolean
  var sendto: Boolean
}

object Anon_Execute {
  @scala.inline
  def apply(execute: Boolean, http: Boolean, sendto: Boolean): Anon_Execute = {
    val __obj = js.Dynamic.literal(execute = execute, http = http, sendto = sendto)
  
    __obj.asInstanceOf[Anon_Execute]
  }
}

