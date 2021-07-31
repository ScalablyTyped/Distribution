package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uri extends StObject {
  
  var array: js.UndefOr[js.Array[ASN1Object]] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
}
object Uri {
  
  @scala.inline
  def apply(): Uri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uri]
  }
  
  @scala.inline
  implicit class UriMutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: js.Array[ASN1Object]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setArrayVarargs(value: ASN1Object*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
