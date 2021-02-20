package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.ArrayParam<jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam> & {  critical :boolean | undefined} */
@js.native
trait ArrayParamUriParamcritica extends StObject {
  
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
  implicit class ArrayParamUriParamcriticaMutableBuilder[Self <: ArrayParamUriParamcritica] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: js.Array[UriParam]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayVarargs(value: UriParam*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
  }
}
