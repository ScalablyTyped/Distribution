package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceSplitOptions extends StObject {
  
  /**
    * The source should be split into a set of bundles where the estimated size of each is approximately this many bytes.
    */
  var desiredBundleSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DEPRECATED in favor of desired_bundle_size_bytes.
    */
  var desiredShardSizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaSourceSplitOptions {
  
  inline def apply(): SchemaSourceSplitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitOptions]
  }
  
  extension [Self <: SchemaSourceSplitOptions](x: Self) {
    
    inline def setDesiredBundleSizeBytes(value: String): Self = StObject.set(x, "desiredBundleSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setDesiredBundleSizeBytesNull: Self = StObject.set(x, "desiredBundleSizeBytes", null)
    
    inline def setDesiredBundleSizeBytesUndefined: Self = StObject.set(x, "desiredBundleSizeBytes", js.undefined)
    
    inline def setDesiredShardSizeBytes(value: String): Self = StObject.set(x, "desiredShardSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setDesiredShardSizeBytesNull: Self = StObject.set(x, "desiredShardSizeBytes", null)
    
    inline def setDesiredShardSizeBytesUndefined: Self = StObject.set(x, "desiredShardSizeBytes", js.undefined)
  }
}
