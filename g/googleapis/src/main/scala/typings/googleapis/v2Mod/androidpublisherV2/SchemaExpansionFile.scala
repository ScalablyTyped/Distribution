package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExpansionFile extends StObject {
  
  /**
    * If set this field indicates that this APK has an Expansion File uploaded
    * to it: this APK does not reference another APK&#39;s Expansion File. The
    * field&#39;s value is the size of the uploaded Expansion File in bytes.
    */
  var fileSize: js.UndefOr[String] = js.undefined
  
  /**
    * If set this APK&#39;s Expansion File references another APK&#39;s
    * Expansion File. The file_size field will not be set.
    */
  var referencesVersion: js.UndefOr[Double] = js.undefined
}
object SchemaExpansionFile {
  
  inline def apply(): SchemaExpansionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpansionFile]
  }
  
  extension [Self <: SchemaExpansionFile](x: Self) {
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setReferencesVersion(value: Double): Self = StObject.set(x, "referencesVersion", value.asInstanceOf[js.Any])
    
    inline def setReferencesVersionUndefined: Self = StObject.set(x, "referencesVersion", js.undefined)
  }
}
