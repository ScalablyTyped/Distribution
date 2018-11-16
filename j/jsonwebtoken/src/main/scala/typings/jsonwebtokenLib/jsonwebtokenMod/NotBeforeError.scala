package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken", "NotBeforeError")
@js.native
class NotBeforeError protected () extends JsonWebTokenError {
  def this(message: java.lang.String, date: stdLib.Date) = this()
  var date: stdLib.Date = js.native
}

