package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppRestrictionsSchema extends StObject {
  
  /** Deprecated. */
  var kind: js.UndefOr[String] = js.native
  
  /** The set of restrictions that make up this schema. */
  var restrictions: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.native
}
object AppRestrictionsSchema {
  
  @scala.inline
  def apply(): AppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchema]
  }
  
  @scala.inline
  implicit class AppRestrictionsSchemaMutableBuilder[Self <: AppRestrictionsSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRestrictions(value: js.Array[AppRestrictionsSchemaRestriction]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setRestrictionsVarargs(value: AppRestrictionsSchemaRestriction*): Self = StObject.set(x, "restrictions", js.Array(value :_*))
  }
}
