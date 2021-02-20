package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic Targeting Key List Response
  */
@js.native
trait SchemaDynamicTargetingKeysListResponse extends StObject {
  
  /**
    * Dynamic targeting key collection.
    */
  var dynamicTargetingKeys: js.UndefOr[js.Array[SchemaDynamicTargetingKey]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKeysListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaDynamicTargetingKeysListResponse {
  
  @scala.inline
  def apply(): SchemaDynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicTargetingKeysListResponse]
  }
  
  @scala.inline
  implicit class SchemaDynamicTargetingKeysListResponseMutableBuilder[Self <: SchemaDynamicTargetingKeysListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicTargetingKeys(value: js.Array[SchemaDynamicTargetingKey]): Self = StObject.set(x, "dynamicTargetingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTargetingKeysUndefined: Self = StObject.set(x, "dynamicTargetingKeys", js.undefined)
    
    @scala.inline
    def setDynamicTargetingKeysVarargs(value: SchemaDynamicTargetingKey*): Self = StObject.set(x, "dynamicTargetingKeys", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
