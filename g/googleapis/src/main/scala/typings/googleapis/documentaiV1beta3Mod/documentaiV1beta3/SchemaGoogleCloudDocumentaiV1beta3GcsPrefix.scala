package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3GcsPrefix extends StObject {
  
  /**
    * The URI prefix.
    */
  var gcsUriPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3GcsPrefix {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3GcsPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3GcsPrefix]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3GcsPrefix](x: Self) {
    
    inline def setGcsUriPrefix(value: String): Self = StObject.set(x, "gcsUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setGcsUriPrefixNull: Self = StObject.set(x, "gcsUriPrefix", null)
    
    inline def setGcsUriPrefixUndefined: Self = StObject.set(x, "gcsUriPrefix", js.undefined)
  }
}
