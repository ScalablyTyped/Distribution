package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformTypesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#platformTypesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Platform type collection. */
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.native
}
object PlatformTypesListResponse {
  
  @scala.inline
  def apply(): PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformTypesListResponse]
  }
  
  @scala.inline
  implicit class PlatformTypesListResponseMutableBuilder[Self <: PlatformTypesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlatformTypes(value: js.Array[PlatformType]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
    
    @scala.inline
    def setPlatformTypesVarargs(value: PlatformType*): Self = StObject.set(x, "platformTypes", js.Array(value :_*))
  }
}
