package typings.libraCore.anon

import typings.grpc.mod.Call
import typings.grpc.mod.CallCredentials
import typings.grpc.mod.Deadline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<grpc.grpc.CallOptions> */
@js.native
trait PartialCallOptions extends js.Object {
  
  var credentials: js.UndefOr[CallCredentials] = js.native
  
  var deadline: js.UndefOr[Deadline] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[Call] = js.native
  
  var propagate_flags: js.UndefOr[Double] = js.native
}
object PartialCallOptions {
  
  @scala.inline
  def apply(): PartialCallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCallOptions]
  }
  
  @scala.inline
  implicit class PartialCallOptionsOps[Self <: PartialCallOptions] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: CallCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setDeadline(value: Deadline): Self = this.set("deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setParent(value: Call): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPropagate_flags(value: Double): Self = this.set("propagate_flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagate_flags: Self = this.set("propagate_flags", js.undefined)
  }
}
