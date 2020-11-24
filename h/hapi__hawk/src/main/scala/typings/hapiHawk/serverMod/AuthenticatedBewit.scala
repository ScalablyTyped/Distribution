package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticatedBewit extends AuthenticatedMessage {
  
  var bewit: Bewit = js.native
}
object AuthenticatedBewit {
  
  @scala.inline
  def apply(bewit: Bewit, credentials: Credentials): AuthenticatedBewit = {
    val __obj = js.Dynamic.literal(bewit = bewit.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatedBewit]
  }
  
  @scala.inline
  implicit class AuthenticatedBewitOps[Self <: AuthenticatedBewit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBewit(value: Bewit): Self = this.set("bewit", value.asInstanceOf[js.Any])
  }
}
