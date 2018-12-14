package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShapeDataSourceSettings
  extends /**
	 * Option for ShapeDataSourceSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var databaseSource: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The unique identifier.
  	 */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Callback function to call when the import process has been completed
  	 * paramType="object" the ShapeDataSource instance
  	 */
  var importCompleted: js.UndefOr[js.Function] = js.undefined
  /**
  	 * The Uri of the .shp portion of the Shapefile.
  	 */
  var shapefileSource: js.UndefOr[java.lang.String] = js.undefined
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

