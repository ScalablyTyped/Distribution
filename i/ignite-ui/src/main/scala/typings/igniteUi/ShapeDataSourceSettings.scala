package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Callback function to call when data binding is complete.
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Object on which to invoke the callback function.
    */
  var callee: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The Uri of the .dbf portion of the Shapefile.
    */
  var databaseSource: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Callback function to call when the import process has been completed
    * paramType="object" the ShapeDataSource instance
    */
  var importCompleted: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The Uri of the .shp portion of the Shapefile.
    */
  var shapefileSource: js.UndefOr[String] = js.undefined
  
  /**
    * Callback function to call to allow the bounds of the shape data source to be transformed.
    * paramType="object" the bounds of the shape datasource to be transformed in place. The object will look like { top: value, left: value, width: value, height: value }
    */
  var transformBounds: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Callback function to call to allow points in the shape records to be transformed.
    * paramType="object" the point to be transformed in place. The object will look like { x: value, y: value2 }
    */
  var transformPoint: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Callback function to call to allow shape records to be transformed.
    * paramType="object" the shape record to be transformed.
    */
  var transformRecord: js.UndefOr[js.Function] = js.undefined
}
object ShapeDataSourceSettings {
  
  @scala.inline
  def apply(): ShapeDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeDataSourceSettings]
  }
  
  @scala.inline
  implicit class ShapeDataSourceSettingsMutableBuilder[Self <: ShapeDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCallee(value: js.Any): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    @scala.inline
    def setDatabaseSource(value: String): Self = StObject.set(x, "databaseSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseSourceUndefined: Self = StObject.set(x, "databaseSource", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImportCompleted(value: js.Function): Self = StObject.set(x, "importCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportCompletedUndefined: Self = StObject.set(x, "importCompleted", js.undefined)
    
    @scala.inline
    def setShapefileSource(value: String): Self = StObject.set(x, "shapefileSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapefileSourceUndefined: Self = StObject.set(x, "shapefileSource", js.undefined)
    
    @scala.inline
    def setTransformBounds(value: js.Function): Self = StObject.set(x, "transformBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformBoundsUndefined: Self = StObject.set(x, "transformBounds", js.undefined)
    
    @scala.inline
    def setTransformPoint(value: js.Function): Self = StObject.set(x, "transformPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformPointUndefined: Self = StObject.set(x, "transformPoint", js.undefined)
    
    @scala.inline
    def setTransformRecord(value: js.Function): Self = StObject.set(x, "transformRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformRecordUndefined: Self = StObject.set(x, "transformRecord", js.undefined)
  }
}
