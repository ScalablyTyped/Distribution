package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentTextChange extends StObject {
  
  /**
    * The text that replaces the text identified in the `text_anchor`.
    */
  var changedText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The history of this annotation.
    */
  var provenance: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3DocumentProvenance]] = js.undefined
  
  /**
    * Provenance of the correction. Text anchor indexing into the Document.text. There can only be a single `TextAnchor.text_segments` element. If the start and end index of the text segment are the same, the text change is inserted before that index.
    */
  var textAnchor: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchor] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentTextChange {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentTextChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentTextChange]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentTextChange](x: Self) {
    
    inline def setChangedText(value: String): Self = StObject.set(x, "changedText", value.asInstanceOf[js.Any])
    
    inline def setChangedTextNull: Self = StObject.set(x, "changedText", null)
    
    inline def setChangedTextUndefined: Self = StObject.set(x, "changedText", js.undefined)
    
    inline def setProvenance(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3DocumentProvenance]): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setProvenanceVarargs(value: SchemaGoogleCloudDocumentaiV1beta3DocumentProvenance*): Self = StObject.set(x, "provenance", js.Array(value*))
    
    inline def setTextAnchor(value: SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchor): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
  }
}
