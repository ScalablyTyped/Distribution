package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionRejectOptions extends js.Object {
  var extraHeaders: js.Array[String]
  var reason_phrase: String
  var status_code: Double
}

object SessionRejectOptions {
  @scala.inline
  def apply(extraHeaders: js.Array[String], reason_phrase: String, status_code: Double): SessionRejectOptions = {
    val __obj = js.Dynamic.literal(extraHeaders = extraHeaders, reason_phrase = reason_phrase, status_code = status_code)
  
    __obj.asInstanceOf[SessionRejectOptions]
  }
}

