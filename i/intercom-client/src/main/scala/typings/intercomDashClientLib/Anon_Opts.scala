package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Opts extends js.Object {
  def userHash(opts: intercomDashClientLib.intercomDashClientMod.IdentityVerificationOptions): java.lang.String
}

object Anon_Opts {
  @scala.inline
  def apply(
    userHash: intercomDashClientLib.intercomDashClientMod.IdentityVerificationOptions => java.lang.String
  ): Anon_Opts = {
    val __obj = js.Dynamic.literal(userHash = js.Any.fromFunction1(userHash))
  
    __obj.asInstanceOf[Anon_Opts]
  }
}

