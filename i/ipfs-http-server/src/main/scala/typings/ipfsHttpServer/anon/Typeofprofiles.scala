package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofprofiles extends js.Object {
  
  @JSName("apply")
  val apply: Typeofapply = js.native
  
  val list: TypeoflistHandler3 = js.native
}
object Typeofprofiles {
  
  @scala.inline
  def apply(apply: Typeofapply, list: TypeoflistHandler3): Typeofprofiles = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprofiles]
  }
  
  @scala.inline
  implicit class TypeofprofilesOps[Self <: Typeofprofiles] (val x: Self) extends AnyVal {
    
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
    def setApply(value: Typeofapply): Self = this.set("apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: TypeoflistHandler3): Self = this.set("list", value.asInstanceOf[js.Any])
  }
}
