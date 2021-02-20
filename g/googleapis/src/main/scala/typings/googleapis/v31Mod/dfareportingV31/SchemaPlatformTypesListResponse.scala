package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Platform Type List Response
  */
@js.native
trait SchemaPlatformTypesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#platformTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Platform type collection.
    */
  var platformTypes: js.UndefOr[js.Array[SchemaPlatformType]] = js.native
}
object SchemaPlatformTypesListResponse {
  
  @scala.inline
  def apply(): SchemaPlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformTypesListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlatformTypesListResponseMutableBuilder[Self <: SchemaPlatformTypesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlatformTypes(value: js.Array[SchemaPlatformType]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
    
    @scala.inline
    def setPlatformTypesVarargs(value: SchemaPlatformType*): Self = StObject.set(x, "platformTypes", js.Array(value :_*))
  }
}
