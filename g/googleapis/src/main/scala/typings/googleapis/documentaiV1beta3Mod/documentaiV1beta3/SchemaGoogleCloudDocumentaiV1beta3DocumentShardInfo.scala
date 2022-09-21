package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentShardInfo extends StObject {
  
  /**
    * Total number of shards.
    */
  var shardCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The 0-based index of this shard.
    */
  var shardIndex: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The index of the first character in Document.text in the overall document global text.
    */
  var textOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentShardInfo {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentShardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentShardInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentShardInfo](x: Self) {
    
    inline def setShardCount(value: String): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
    
    inline def setShardCountNull: Self = StObject.set(x, "shardCount", null)
    
    inline def setShardCountUndefined: Self = StObject.set(x, "shardCount", js.undefined)
    
    inline def setShardIndex(value: String): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
    
    inline def setShardIndexNull: Self = StObject.set(x, "shardIndex", null)
    
    inline def setShardIndexUndefined: Self = StObject.set(x, "shardIndex", js.undefined)
    
    inline def setTextOffset(value: String): Self = StObject.set(x, "textOffset", value.asInstanceOf[js.Any])
    
    inline def setTextOffsetNull: Self = StObject.set(x, "textOffset", null)
    
    inline def setTextOffsetUndefined: Self = StObject.set(x, "textOffset", js.undefined)
  }
}
