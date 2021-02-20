package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListThreatListsResponse extends StObject {
  
  /**
    * The lists available for download by the client.
    */
  var threatLists: js.UndefOr[js.Array[SchemaThreatListDescriptor]] = js.native
}
object SchemaListThreatListsResponse {
  
  @scala.inline
  def apply(): SchemaListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListThreatListsResponse]
  }
  
  @scala.inline
  implicit class SchemaListThreatListsResponseMutableBuilder[Self <: SchemaListThreatListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreatLists(value: js.Array[SchemaThreatListDescriptor]): Self = StObject.set(x, "threatLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatListsUndefined: Self = StObject.set(x, "threatLists", js.undefined)
    
    @scala.inline
    def setThreatListsVarargs(value: SchemaThreatListDescriptor*): Self = StObject.set(x, "threatLists", js.Array(value :_*))
  }
}
