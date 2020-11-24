package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends js.Object {
  
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any = js.native
  
  def success(theGroup: KiiGroup, theOwner: KiiUser): js.Any = js.native
}
object `11` {
  
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: (KiiGroup, KiiUser) => js.Any): `11` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11Ops`[Self <: `11`] (val x: Self) extends AnyVal {
    
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
    def setFailure(value: (KiiGroup, String) => js.Any): Self = this.set("failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: (KiiGroup, KiiUser) => js.Any): Self = this.set("success", js.Any.fromFunction2(value))
  }
}
