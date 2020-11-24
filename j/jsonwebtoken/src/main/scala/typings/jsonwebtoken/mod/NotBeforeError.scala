package typings.jsonwebtoken.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsonwebtoken.mod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "NotBeforeError")
@js.native
class NotBeforeError protected () extends JsonWebTokenError {
  def this(message: String, date: Date) = this()
  
  var date: Date = js.native
}
