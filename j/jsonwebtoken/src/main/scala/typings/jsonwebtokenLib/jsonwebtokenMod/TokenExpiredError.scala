package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- jsonwebtokenLib.jsonwebtokenMod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "TokenExpiredError")
@js.native
class TokenExpiredError protected () extends JsonWebTokenError {
  def this(message: java.lang.String, expiredAt: stdLib.Date) = this()
  var expiredAt: stdLib.Date = js.native
}

