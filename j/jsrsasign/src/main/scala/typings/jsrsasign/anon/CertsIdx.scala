package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertsIdx extends js.Object {
  
  var certsIdx: Double = js.native
  
  var signerInfos: js.Array[_] = js.native
}
object CertsIdx {
  
  @scala.inline
  def apply(certsIdx: Double, signerInfos: js.Array[_]): CertsIdx = {
    val __obj = js.Dynamic.literal(certsIdx = certsIdx.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertsIdx]
  }
  
  @scala.inline
  implicit class CertsIdxOps[Self <: CertsIdx] (val x: Self) extends AnyVal {
    
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
    def setCertsIdx(value: Double): Self = this.set("certsIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerInfosVarargs(value: js.Any*): Self = this.set("signerInfos", js.Array(value :_*))
    
    @scala.inline
    def setSignerInfos(value: js.Array[_]): Self = this.set("signerInfos", value.asInstanceOf[js.Any])
  }
}
