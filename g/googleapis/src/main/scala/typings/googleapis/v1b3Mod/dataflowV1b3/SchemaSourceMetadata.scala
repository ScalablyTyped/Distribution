package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceMetadata extends StObject {
  
  /**
    * An estimate of the total size (in bytes) of the data that would be read from this source. This estimate is in terms of external storage size, before any decompression or other processing done by the reader.
    */
  var estimatedSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies that the size of this source is known to be infinite (this is a streaming source).
    */
  var infinite: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this source is known to produce key/value pairs with the (encoded) keys in lexicographically sorted order.
    */
  var producesSortedKeys: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSourceMetadata {
  
  inline def apply(): SchemaSourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceMetadata]
  }
  
  extension [Self <: SchemaSourceMetadata](x: Self) {
    
    inline def setEstimatedSizeBytes(value: String): Self = StObject.set(x, "estimatedSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedSizeBytesNull: Self = StObject.set(x, "estimatedSizeBytes", null)
    
    inline def setEstimatedSizeBytesUndefined: Self = StObject.set(x, "estimatedSizeBytes", js.undefined)
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInfiniteNull: Self = StObject.set(x, "infinite", null)
    
    inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    inline def setProducesSortedKeys(value: Boolean): Self = StObject.set(x, "producesSortedKeys", value.asInstanceOf[js.Any])
    
    inline def setProducesSortedKeysNull: Self = StObject.set(x, "producesSortedKeys", null)
    
    inline def setProducesSortedKeysUndefined: Self = StObject.set(x, "producesSortedKeys", js.undefined)
  }
}
