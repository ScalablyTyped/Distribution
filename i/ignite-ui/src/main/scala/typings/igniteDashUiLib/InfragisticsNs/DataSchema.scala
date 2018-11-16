package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.DataSchema")
@js.native
class DataSchema protected () extends js.Object {
  def this(schema: igniteDashUiLib.DataSchemaSchema) = this()
  /**
  	 * A list of field definitions specifying the schema of the data source.
  	 * Field objects description: {fieldName, [fieldDataType], [fieldXPath]}
  	 */
  def fields(): js.Array[_] = js.native
  /**
  	 * Specifies if the object is null, undefined, or an empty string
  	 *
  	 * @param o the object to check for being empty
  	 */
  def isEmpty(o: js.Object): js.Object = js.native
  /**
  	 * Specifies if the object has custom properties or not
  	 *
  	 * @param obj the object to check for presence or lack of custom properties
  	 */
  def isObjEmpty(obj: js.Object): js.Object = js.native
  /**
  	 * Performs a transformation on the schema so that the resulting data matches the schema
  	 *
  	 * @param data the data to transform
  	 */
  def transform(data: js.Object): js.Object = js.native
}

