package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFormatDetails extends StObject {
  
  var `document-format`: js.UndefOr[MimeMediaType] = js.undefined
  
  var `document-format-device-id`: js.UndefOr[String] = js.undefined
  
  var `document-format-version`: js.UndefOr[String] = js.undefined
  
  var `document-natural-language`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `document-source-application-name`: js.UndefOr[String] = js.undefined
  
  var `document-source-application-version`: js.UndefOr[String] = js.undefined
  
  var `document-source-os-name`: js.UndefOr[String] = js.undefined
  
  var `document-source-os-version`: js.UndefOr[String] = js.undefined
}
object DocumentFormatDetails {
  
  inline def apply(): DocumentFormatDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFormatDetails]
  }
  
  extension [Self <: DocumentFormatDetails](x: Self) {
    
    inline def `setDocument-format`(value: MimeMediaType): Self = StObject.set(x, "document-format", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-device-id`(value: String): Self = StObject.set(x, "document-format-device-id", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-device-idUndefined`: Self = StObject.set(x, "document-format-device-id", js.undefined)
    
    inline def `setDocument-format-version`(value: String): Self = StObject.set(x, "document-format-version", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-versionUndefined`: Self = StObject.set(x, "document-format-version", js.undefined)
    
    inline def `setDocument-formatUndefined`: Self = StObject.set(x, "document-format", js.undefined)
    
    inline def `setDocument-natural-language`(value: js.Array[String]): Self = StObject.set(x, "document-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setDocument-natural-languageUndefined`: Self = StObject.set(x, "document-natural-language", js.undefined)
    
    inline def `setDocument-natural-languageVarargs`(value: String*): Self = StObject.set(x, "document-natural-language", js.Array(value*))
    
    inline def `setDocument-source-application-name`(value: String): Self = StObject.set(x, "document-source-application-name", value.asInstanceOf[js.Any])
    
    inline def `setDocument-source-application-nameUndefined`: Self = StObject.set(x, "document-source-application-name", js.undefined)
    
    inline def `setDocument-source-application-version`(value: String): Self = StObject.set(x, "document-source-application-version", value.asInstanceOf[js.Any])
    
    inline def `setDocument-source-application-versionUndefined`: Self = StObject.set(x, "document-source-application-version", js.undefined)
    
    inline def `setDocument-source-os-name`(value: String): Self = StObject.set(x, "document-source-os-name", value.asInstanceOf[js.Any])
    
    inline def `setDocument-source-os-nameUndefined`: Self = StObject.set(x, "document-source-os-name", js.undefined)
    
    inline def `setDocument-source-os-version`(value: String): Self = StObject.set(x, "document-source-os-version", value.asInstanceOf[js.Any])
    
    inline def `setDocument-source-os-versionUndefined`: Self = StObject.set(x, "document-source-os-version", js.undefined)
  }
}
