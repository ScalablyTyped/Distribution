package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Callback function to call when data binding is complete.
    */
  var callback: js.UndefOr[js.Function] = js.native
  /**
    * Object on which to invoke the callback function.
    */
  var callee: js.UndefOr[js.Any] = js.native
  /**
    * The Uri of the .dbf portion of the Shapefile.
    */
  var databaseSource: js.UndefOr[String] = js.native
  /**
    * The unique identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Callback function to call when the import process has been completed
    * paramType="object" the ShapeDataSource instance
    */
  var importCompleted: js.UndefOr[js.Function] = js.native
  /**
    * The Uri of the .shp portion of the Shapefile.
    */
  var shapefileSource: js.UndefOr[String] = js.native
  /**
    * Callback function to call to allow the bounds of the shape data source to be transformed.
    * paramType="object" the bounds of the shape datasource to be transformed in place. The object will look like { top: value, left: value, width: value, height: value }
    */
  var transformBounds: js.UndefOr[js.Function] = js.native
  /**
    * Callback function to call to allow points in the shape records to be transformed.
    * paramType="object" the point to be transformed in place. The object will look like { x: value, y: value2 }
    */
  var transformPoint: js.UndefOr[js.Function] = js.native
  /**
    * Callback function to call to allow shape records to be transformed.
    * paramType="object" the shape record to be transformed.
    */
  var transformRecord: js.UndefOr[js.Function] = js.native
}

object ShapeDataSourceSettings {
  @scala.inline
  def apply(): ShapeDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeDataSourceSettings]
  }
  @scala.inline
  implicit class ShapeDataSourceSettingsOps[Self <: ShapeDataSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCallee(value: js.Any): Self = this.set("callee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallee: Self = this.set("callee", js.undefined)
    @scala.inline
    def setDatabaseSource(value: String): Self = this.set("databaseSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseSource: Self = this.set("databaseSource", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImportCompleted(value: js.Function): Self = this.set("importCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportCompleted: Self = this.set("importCompleted", js.undefined)
    @scala.inline
    def setShapefileSource(value: String): Self = this.set("shapefileSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapefileSource: Self = this.set("shapefileSource", js.undefined)
    @scala.inline
    def setTransformBounds(value: js.Function): Self = this.set("transformBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformBounds: Self = this.set("transformBounds", js.undefined)
    @scala.inline
    def setTransformPoint(value: js.Function): Self = this.set("transformPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformPoint: Self = this.set("transformPoint", js.undefined)
    @scala.inline
    def setTransformRecord(value: js.Function): Self = this.set("transformRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformRecord: Self = this.set("transformRecord", js.undefined)
  }
  
}

