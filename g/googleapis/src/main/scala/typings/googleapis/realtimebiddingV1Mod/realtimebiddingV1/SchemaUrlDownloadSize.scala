package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlDownloadSize extends StObject {
  
  /**
    * Download size of the URL in kilobytes.
    */
  var downloadSizeKb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The normalized URL with query parameters and fragment removed.
    */
  var normalizedUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlDownloadSize {
  
  inline def apply(): SchemaUrlDownloadSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlDownloadSize]
  }
  
  extension [Self <: SchemaUrlDownloadSize](x: Self) {
    
    inline def setDownloadSizeKb(value: Double): Self = StObject.set(x, "downloadSizeKb", value.asInstanceOf[js.Any])
    
    inline def setDownloadSizeKbNull: Self = StObject.set(x, "downloadSizeKb", null)
    
    inline def setDownloadSizeKbUndefined: Self = StObject.set(x, "downloadSizeKb", js.undefined)
    
    inline def setNormalizedUrl(value: String): Self = StObject.set(x, "normalizedUrl", value.asInstanceOf[js.Any])
    
    inline def setNormalizedUrlNull: Self = StObject.set(x, "normalizedUrl", null)
    
    inline def setNormalizedUrlUndefined: Self = StObject.set(x, "normalizedUrl", js.undefined)
  }
}
