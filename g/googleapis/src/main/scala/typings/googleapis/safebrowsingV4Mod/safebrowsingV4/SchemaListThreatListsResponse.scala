package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListThreatListsResponse extends StObject {
  
  /**
    * The lists available for download by the client.
    */
  var threatLists: js.UndefOr[js.Array[SchemaThreatListDescriptor]] = js.undefined
}
object SchemaListThreatListsResponse {
  
  inline def apply(): SchemaListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListThreatListsResponse]
  }
  
  extension [Self <: SchemaListThreatListsResponse](x: Self) {
    
    inline def setThreatLists(value: js.Array[SchemaThreatListDescriptor]): Self = StObject.set(x, "threatLists", value.asInstanceOf[js.Any])
    
    inline def setThreatListsUndefined: Self = StObject.set(x, "threatLists", js.undefined)
    
    inline def setThreatListsVarargs(value: SchemaThreatListDescriptor*): Self = StObject.set(x, "threatLists", js.Array(value :_*))
  }
}
