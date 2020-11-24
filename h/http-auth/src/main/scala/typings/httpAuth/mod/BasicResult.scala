package typings.httpAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicResult[T /* <: Boolean */] extends js.Object {
  
  var pass: js.UndefOr[T] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object BasicResult {
  
  @scala.inline
  def apply[T /* <: Boolean */](): BasicResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicResult[T]]
  }
  
  @scala.inline
  implicit class BasicResultOps[Self <: BasicResult[_], T /* <: Boolean */] (val x: Self with BasicResult[T]) extends AnyVal {
    
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
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
