package typings.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicParameters extends js.Object {
  
  var alg: js.UndefOr[String] = js.native
  
  var key_ops: js.UndefOr[js.Array[keyOperation]] = js.native
  
  var kid: js.UndefOr[String] = js.native
  
  var use: js.UndefOr[typings.jose.mod.use] = js.native
}
object BasicParameters {
  
  @scala.inline
  def apply(): BasicParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicParameters]
  }
  
  @scala.inline
  implicit class BasicParametersOps[Self <: BasicParameters] (val x: Self) extends AnyVal {
    
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    
    @scala.inline
    def setKey_opsVarargs(value: keyOperation*): Self = this.set("key_ops", js.Array(value :_*))
    
    @scala.inline
    def setKey_ops(value: js.Array[keyOperation]): Self = this.set("key_ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey_ops: Self = this.set("key_ops", js.undefined)
    
    @scala.inline
    def setKid(value: String): Self = this.set("kid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKid: Self = this.set("kid", js.undefined)
    
    @scala.inline
    def setUse(value: use): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
}
