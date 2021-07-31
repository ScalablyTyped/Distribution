package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single response from an update.
  */
trait SchemaResponse extends StObject {
  
  /**
    * The result of creating an image.
    */
  var createImage: js.UndefOr[SchemaCreateImageResponse] = js.undefined
  
  /**
    * The result of creating a line.
    */
  var createLine: js.UndefOr[SchemaCreateLineResponse] = js.undefined
  
  /**
    * The result of creating a shape.
    */
  var createShape: js.UndefOr[SchemaCreateShapeResponse] = js.undefined
  
  /**
    * The result of creating a Google Sheets chart.
    */
  var createSheetsChart: js.UndefOr[SchemaCreateSheetsChartResponse] = js.undefined
  
  /**
    * The result of creating a slide.
    */
  var createSlide: js.UndefOr[SchemaCreateSlideResponse] = js.undefined
  
  /**
    * The result of creating a table.
    */
  var createTable: js.UndefOr[SchemaCreateTableResponse] = js.undefined
  
  /**
    * The result of creating a video.
    */
  var createVideo: js.UndefOr[SchemaCreateVideoResponse] = js.undefined
  
  /**
    * The result of duplicating an object.
    */
  var duplicateObject: js.UndefOr[SchemaDuplicateObjectResponse] = js.undefined
  
  /**
    * The result of grouping objects.
    */
  var groupObjects: js.UndefOr[SchemaGroupObjectsResponse] = js.undefined
  
  /**
    * The result of replacing all shapes matching some criteria with an image.
    */
  var replaceAllShapesWithImage: js.UndefOr[SchemaReplaceAllShapesWithImageResponse] = js.undefined
  
  /**
    * The result of replacing all shapes matching some criteria with a Google
    * Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[SchemaReplaceAllShapesWithSheetsChartResponse] = js.undefined
  
  /**
    * The result of replacing text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextResponse] = js.undefined
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
    def setCreateImage(value: SchemaCreateImageResponse): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
    
    @scala.inline
    def setCreateLine(value: SchemaCreateLineResponse): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
    
    @scala.inline
    def setCreateShape(value: SchemaCreateShapeResponse): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
    
    @scala.inline
    def setCreateSheetsChart(value: SchemaCreateSheetsChartResponse): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
    
    @scala.inline
    def setCreateSlide(value: SchemaCreateSlideResponse): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
    
    @scala.inline
    def setCreateTable(value: SchemaCreateTableResponse): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
    
    @scala.inline
    def setCreateVideo(value: SchemaCreateVideoResponse): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
    
    @scala.inline
    def setDuplicateObject(value: SchemaDuplicateObjectResponse): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
    
    @scala.inline
    def setGroupObjects(value: SchemaGroupObjectsResponse): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithImage(value: SchemaReplaceAllShapesWithImageResponse): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithSheetsChart(value: SchemaReplaceAllShapesWithSheetsChartResponse): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: SchemaReplaceAllTextResponse): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
  }
}
