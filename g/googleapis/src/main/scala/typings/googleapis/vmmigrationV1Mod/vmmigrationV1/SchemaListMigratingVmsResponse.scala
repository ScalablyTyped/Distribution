package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMigratingVmsResponse extends StObject {
  
  /**
    * Output only. The list of Migrating VMs response.
    */
  var migratingVms: js.UndefOr[js.Array[SchemaMigratingVm]] = js.undefined
  
  /**
    * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListMigratingVmsResponse {
  
  inline def apply(): SchemaListMigratingVmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMigratingVmsResponse]
  }
  
  extension [Self <: SchemaListMigratingVmsResponse](x: Self) {
    
    inline def setMigratingVms(value: js.Array[SchemaMigratingVm]): Self = StObject.set(x, "migratingVms", value.asInstanceOf[js.Any])
    
    inline def setMigratingVmsUndefined: Self = StObject.set(x, "migratingVms", js.undefined)
    
    inline def setMigratingVmsVarargs(value: SchemaMigratingVm*): Self = StObject.set(x, "migratingVms", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
