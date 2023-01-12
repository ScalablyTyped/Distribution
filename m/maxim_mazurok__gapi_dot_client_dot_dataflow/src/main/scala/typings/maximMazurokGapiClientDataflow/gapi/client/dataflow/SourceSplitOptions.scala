package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSplitOptions extends StObject {
  
  /** The source should be split into a set of bundles where the estimated size of each is approximately this many bytes. */
  var desiredBundleSizeBytes: js.UndefOr[String] = js.undefined
  
  /** DEPRECATED in favor of desired_bundle_size_bytes. */
  var desiredShardSizeBytes: js.UndefOr[String] = js.undefined
}
object SourceSplitOptions {
  
  inline def apply(): SourceSplitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceSplitOptions] (val x: Self) extends AnyVal {
    
    inline def setDesiredBundleSizeBytes(value: String): Self = StObject.set(x, "desiredBundleSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setDesiredBundleSizeBytesUndefined: Self = StObject.set(x, "desiredBundleSizeBytes", js.undefined)
    
    inline def setDesiredShardSizeBytes(value: String): Self = StObject.set(x, "desiredShardSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setDesiredShardSizeBytesUndefined: Self = StObject.set(x, "desiredShardSizeBytes", js.undefined)
  }
}
