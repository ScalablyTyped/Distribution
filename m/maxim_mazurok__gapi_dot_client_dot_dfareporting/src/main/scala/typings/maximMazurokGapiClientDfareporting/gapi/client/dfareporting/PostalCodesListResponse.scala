package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostalCodesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCodesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Postal code collection. */
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.native
}
object PostalCodesListResponse {
  
  @scala.inline
  def apply(): PostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCodesListResponse]
  }
  
  @scala.inline
  implicit class PostalCodesListResponseMutableBuilder[Self <: PostalCodesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPostalCodes(value: js.Array[PostalCode]): Self = StObject.set(x, "postalCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodesUndefined: Self = StObject.set(x, "postalCodes", js.undefined)
    
    @scala.inline
    def setPostalCodesVarargs(value: PostalCode*): Self = StObject.set(x, "postalCodes", js.Array(value :_*))
  }
}
