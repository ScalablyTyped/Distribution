package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single response from an update.
  */
@js.native
trait SchemaResponse extends StObject {
  
  /**
    * The result of creating a named range.
    */
  var createNamedRange: js.UndefOr[SchemaCreateNamedRangeResponse] = js.native
  
  /**
    * The result of inserting an inline image.
    */
  var insertInlineImage: js.UndefOr[SchemaInsertInlineImageResponse] = js.native
  
  /**
    * The result of inserting an inline Google Sheets chart.
    */
  var insertInlineSheetsChart: js.UndefOr[SchemaInsertInlineSheetsChartResponse] = js.native
  
  /**
    * The result of replacing text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextResponse] = js.native
}
object SchemaResponse {
  
  @scala.inline
  def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  
  @scala.inline
  implicit class SchemaResponseMutableBuilder[Self <: SchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateNamedRange(value: SchemaCreateNamedRangeResponse): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
    
    @scala.inline
    def setInsertInlineImage(value: SchemaInsertInlineImageResponse): Self = StObject.set(x, "insertInlineImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertInlineImageUndefined: Self = StObject.set(x, "insertInlineImage", js.undefined)
    
    @scala.inline
    def setInsertInlineSheetsChart(value: SchemaInsertInlineSheetsChartResponse): Self = StObject.set(x, "insertInlineSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertInlineSheetsChartUndefined: Self = StObject.set(x, "insertInlineSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: SchemaReplaceAllTextResponse): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
  }
}
