package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetrosListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#metrosListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Metro collection. */
  var metros: js.UndefOr[js.Array[Metro]] = js.native
}
object MetrosListResponse {
  
  @scala.inline
  def apply(): MetrosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetrosListResponse]
  }
  
  @scala.inline
  implicit class MetrosListResponseMutableBuilder[Self <: MetrosListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetros(value: js.Array[Metro]): Self = StObject.set(x, "metros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrosUndefined: Self = StObject.set(x, "metros", js.undefined)
    
    @scala.inline
    def setMetrosVarargs(value: Metro*): Self = StObject.set(x, "metros", js.Array(value :_*))
  }
}
