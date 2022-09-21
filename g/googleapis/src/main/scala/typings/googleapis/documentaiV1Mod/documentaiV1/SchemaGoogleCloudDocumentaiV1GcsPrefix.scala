package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1GcsPrefix extends StObject {
  
  /**
    * The URI prefix.
    */
  var gcsUriPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1GcsPrefix {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1GcsPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1GcsPrefix]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1GcsPrefix](x: Self) {
    
    inline def setGcsUriPrefix(value: String): Self = StObject.set(x, "gcsUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setGcsUriPrefixNull: Self = StObject.set(x, "gcsUriPrefix", null)
    
    inline def setGcsUriPrefixUndefined: Self = StObject.set(x, "gcsUriPrefix", js.undefined)
  }
}
