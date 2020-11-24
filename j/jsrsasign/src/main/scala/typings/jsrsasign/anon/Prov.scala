package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prov extends js.Object {
  
  var alg: js.UndefOr[String] = js.native
  
  var prov: js.UndefOr[String] = js.native
}
object Prov {
  
  @scala.inline
  def apply(): Prov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prov]
  }
  
  @scala.inline
  implicit class ProvOps[Self <: Prov] (val x: Self) extends AnyVal {
    
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
    def setProv(value: String): Self = this.set("prov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProv: Self = this.set("prov", js.undefined)
  }
}
