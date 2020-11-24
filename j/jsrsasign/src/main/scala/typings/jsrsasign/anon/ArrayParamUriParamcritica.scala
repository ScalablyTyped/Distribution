package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.ArrayParam<jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam> & {  critical :boolean | undefined} */
@js.native
trait ArrayParamUriParamcritica extends js.Object {
  
  var array: js.Array[UriParam] = js.native
  
  var critical: js.UndefOr[Boolean] = js.native
}
object ArrayParamUriParamcritica {
  
  @scala.inline
  def apply(array: js.Array[UriParam]): ArrayParamUriParamcritica = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayParamUriParamcritica]
  }
  
  @scala.inline
  implicit class ArrayParamUriParamcriticaOps[Self <: ArrayParamUriParamcritica] (val x: Self) extends AnyVal {
    
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
    def setArrayVarargs(value: UriParam*): Self = this.set("array", js.Array(value :_*))
    
    @scala.inline
    def setArray(value: js.Array[UriParam]): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritical(value: Boolean): Self = this.set("critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCritical: Self = this.set("critical", js.undefined)
  }
}
