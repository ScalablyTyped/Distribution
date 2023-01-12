package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRestrictionsSchema extends StObject {
  
  /** Deprecated. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The set of restrictions that make up this schema. */
  var restrictions: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.undefined
}
object AppRestrictionsSchema {
  
  inline def apply(): AppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppRestrictionsSchema] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRestrictions(value: js.Array[AppRestrictionsSchemaRestriction]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setRestrictionsVarargs(value: AppRestrictionsSchemaRestriction*): Self = StObject.set(x, "restrictions", js.Array(value*))
  }
}
