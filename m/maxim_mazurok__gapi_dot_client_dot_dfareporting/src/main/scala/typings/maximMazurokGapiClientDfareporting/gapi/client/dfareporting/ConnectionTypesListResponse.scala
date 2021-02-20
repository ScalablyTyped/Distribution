package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionTypesListResponse extends StObject {
  
  /** Collection of connection types such as broadband and mobile. */
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#connectionTypesListResponse". */
  var kind: js.UndefOr[String] = js.native
}
object ConnectionTypesListResponse {
  
  @scala.inline
  def apply(): ConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionTypesListResponse]
  }
  
  @scala.inline
  implicit class ConnectionTypesListResponseMutableBuilder[Self <: ConnectionTypesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionTypes(value: js.Array[ConnectionType]): Self = StObject.set(x, "connectionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTypesUndefined: Self = StObject.set(x, "connectionTypes", js.undefined)
    
    @scala.inline
    def setConnectionTypesVarargs(value: ConnectionType*): Self = StObject.set(x, "connectionTypes", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
