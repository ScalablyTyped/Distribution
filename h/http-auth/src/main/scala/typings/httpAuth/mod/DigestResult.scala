package typings.httpAuth.mod

import typings.httpAuth.httpAuthBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined http-auth.http-auth.BasicResult<T> & {  stale :true | undefined} */
@js.native
trait DigestResult[T /* <: Boolean */] extends js.Object {
  
  var pass: js.UndefOr[T] = js.native
  
  var stale: js.UndefOr[`true`] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object DigestResult {
  
  @scala.inline
  def apply[T /* <: Boolean */](): DigestResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigestResult[T]]
  }
  
  @scala.inline
  implicit class DigestResultOps[Self <: DigestResult[_], T /* <: Boolean */] (val x: Self with DigestResult[T]) extends AnyVal {
    
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
    def setPass(value: T): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    
    @scala.inline
    def setStale(value: `true`): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
