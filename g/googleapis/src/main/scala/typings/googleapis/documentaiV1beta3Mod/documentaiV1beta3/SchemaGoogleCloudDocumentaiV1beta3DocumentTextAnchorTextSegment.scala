package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchorTextSegment extends StObject {
  
  /**
    * TextSegment half open end UTF-8 char index in the Document.text.
    */
  var endIndex: js.UndefOr[String | Null] = js.undefined
  
  /**
    * TextSegment start UTF-8 char index in the Document.text.
    */
  var startIndex: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchorTextSegment {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchorTextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchorTextSegment]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchorTextSegment](x: Self) {
    
    inline def setEndIndex(value: String): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexNull: Self = StObject.set(x, "endIndex", null)
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setStartIndex(value: String): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexNull: Self = StObject.set(x, "startIndex", null)
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
