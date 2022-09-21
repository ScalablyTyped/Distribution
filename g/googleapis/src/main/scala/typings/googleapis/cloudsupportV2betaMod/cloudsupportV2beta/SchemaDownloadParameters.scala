package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDownloadParameters extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var allowGzipCompression: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var ignoreRange: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDownloadParameters {
  
  inline def apply(): SchemaDownloadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadParameters]
  }
  
  extension [Self <: SchemaDownloadParameters](x: Self) {
    
    inline def setAllowGzipCompression(value: Boolean): Self = StObject.set(x, "allowGzipCompression", value.asInstanceOf[js.Any])
    
    inline def setAllowGzipCompressionNull: Self = StObject.set(x, "allowGzipCompression", null)
    
    inline def setAllowGzipCompressionUndefined: Self = StObject.set(x, "allowGzipCompression", js.undefined)
    
    inline def setIgnoreRange(value: Boolean): Self = StObject.set(x, "ignoreRange", value.asInstanceOf[js.Any])
    
    inline def setIgnoreRangeNull: Self = StObject.set(x, "ignoreRange", null)
    
    inline def setIgnoreRangeUndefined: Self = StObject.set(x, "ignoreRange", js.undefined)
  }
}
