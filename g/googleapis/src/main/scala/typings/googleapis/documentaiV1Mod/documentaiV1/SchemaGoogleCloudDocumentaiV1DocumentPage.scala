package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentPage extends StObject {
  
  /**
    * A list of visually detected text blocks on the page. A block has a set of lines (collected into paragraphs) that have a common line-spacing and orientation.
    */
  var blocks: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageBlock]] = js.undefined
  
  /**
    * A list of detected barcodes.
    */
  var detectedBarcodes: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedBarcode]] = js.undefined
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * Physical dimension of the page.
    */
  var dimension: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageDimension] = js.undefined
  
  /**
    * A list of visually detected form fields on the page.
    */
  var formFields: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageFormField]] = js.undefined
  
  /**
    * Rendered image for this page. This image is preprocessed to remove any skew, rotation, and distortions such that the annotation bounding boxes can be upright and axis-aligned.
    */
  var image: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageImage] = js.undefined
  
  /**
    * Layout for the page.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageLayout] = js.undefined
  
  /**
    * A list of visually detected text lines on the page. A collection of tokens that a human would perceive as a line.
    */
  var lines: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageLine]] = js.undefined
  
  /**
    * 1-based index for current Page in a parent Document. Useful when a page is taken out of a Document for individual processing.
    */
  var pageNumber: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of visually detected text paragraphs on the page. A collection of lines that a human would perceive as a paragraph.
    */
  var paragraphs: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageParagraph]] = js.undefined
  
  /**
    * The history of this page.
    */
  var provenance: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentProvenance] = js.undefined
  
  /**
    * A list of visually detected symbols on the page.
    */
  var symbols: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageSymbol]] = js.undefined
  
  /**
    * A list of visually detected tables on the page.
    */
  var tables: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageTable]] = js.undefined
  
  /**
    * A list of visually detected tokens on the page.
    */
  var tokens: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageToken]] = js.undefined
  
  /**
    * Transformation matrices that were applied to the original document image to produce Page.image.
    */
  var transforms: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageMatrix]] = js.undefined
  
  /**
    * A list of detected non-text visual elements e.g. checkbox, signature etc. on the page.
    */
  var visualElements: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageVisualElement]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentPage {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentPage]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentPage](x: Self) {
    
    inline def setBlocks(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    inline def setBlocksVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageBlock*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setDetectedBarcodes(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedBarcode]): Self = StObject.set(x, "detectedBarcodes", value.asInstanceOf[js.Any])
    
    inline def setDetectedBarcodesUndefined: Self = StObject.set(x, "detectedBarcodes", js.undefined)
    
    inline def setDetectedBarcodesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageDetectedBarcode*): Self = StObject.set(x, "detectedBarcodes", js.Array(value*))
    
    inline def setDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
    
    inline def setDimension(value: SchemaGoogleCloudDocumentaiV1DocumentPageDimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setFormFields(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageFormField]): Self = StObject.set(x, "formFields", value.asInstanceOf[js.Any])
    
    inline def setFormFieldsUndefined: Self = StObject.set(x, "formFields", js.undefined)
    
    inline def setFormFieldsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageFormField*): Self = StObject.set(x, "formFields", js.Array(value*))
    
    inline def setImage(value: SchemaGoogleCloudDocumentaiV1DocumentPageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLines(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageLine*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberNull: Self = StObject.set(x, "pageNumber", null)
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setParagraphs(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageParagraph]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setParagraphsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageParagraph*): Self = StObject.set(x, "paragraphs", js.Array(value*))
    
    inline def setProvenance(value: SchemaGoogleCloudDocumentaiV1DocumentProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setSymbols(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageSymbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    inline def setSymbolsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageSymbol*): Self = StObject.set(x, "symbols", js.Array(value*))
    
    inline def setTables(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageTable]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageTable*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setTokens(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setTransforms(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageMatrix]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    
    inline def setTransformsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageMatrix*): Self = StObject.set(x, "transforms", js.Array(value*))
    
    inline def setVisualElements(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageVisualElement]): Self = StObject.set(x, "visualElements", value.asInstanceOf[js.Any])
    
    inline def setVisualElementsUndefined: Self = StObject.set(x, "visualElements", js.undefined)
    
    inline def setVisualElementsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageVisualElement*): Self = StObject.set(x, "visualElements", js.Array(value*))
  }
}
