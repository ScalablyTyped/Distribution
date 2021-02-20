package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListZonesResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * All GTM Zones of a GTM Container.
    */
  var zone: js.UndefOr[js.Array[SchemaZone]] = js.native
}
object SchemaListZonesResponse {
  
  @scala.inline
  def apply(): SchemaListZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListZonesResponse]
  }
  
  @scala.inline
  implicit class SchemaListZonesResponseMutableBuilder[Self <: SchemaListZonesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setZone(value: js.Array[SchemaZone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    
    @scala.inline
    def setZoneVarargs(value: SchemaZone*): Self = StObject.set(x, "zone", js.Array(value :_*))
  }
}
