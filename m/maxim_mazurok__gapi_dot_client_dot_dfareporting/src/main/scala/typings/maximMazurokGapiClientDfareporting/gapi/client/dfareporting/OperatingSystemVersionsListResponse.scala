package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystemVersionsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemVersionsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Operating system version collection. */
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.native
}
object OperatingSystemVersionsListResponse {
  
  @scala.inline
  def apply(): OperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemVersionsListResponse]
  }
  
  @scala.inline
  implicit class OperatingSystemVersionsListResponseMutableBuilder[Self <: OperatingSystemVersionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersions(value: js.Array[OperatingSystemVersion]): Self = StObject.set(x, "operatingSystemVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemVersionsUndefined: Self = StObject.set(x, "operatingSystemVersions", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersionsVarargs(value: OperatingSystemVersion*): Self = StObject.set(x, "operatingSystemVersions", js.Array(value :_*))
  }
}
