package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- jsonwebtokenLib.jsonwebtokenMod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "NotBeforeError")
@js.native
class NotBeforeError protected () extends JsonWebTokenError {
  def this(message: java.lang.String, date: stdLib.Date) = this()
  var date: stdLib.Date = js.native
}

