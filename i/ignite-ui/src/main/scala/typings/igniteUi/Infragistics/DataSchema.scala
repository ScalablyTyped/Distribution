package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSchema extends js.Object {
  /**
    * A list of field definitions specifying the schema of the data source.
    * Field objects description: {fieldName, [fieldDataType], [fieldXPath]}
    */
  def fields(): js.Array[_]
  /**
    * Specifies if the object is null, undefined, or an empty string
    *
    * @param o the object to check for being empty
    */
  def isEmpty(o: js.Object): js.Object
  /**
    * Specifies if the object has custom properties or not
    *
    * @param obj the object to check for presence or lack of custom properties
    */
  def isObjEmpty(obj: js.Object): js.Object
  /**
    * Performs a transformation on the schema so that the resulting data matches the schema
    *
    * @param data the data to transform
    */
  def transform(data: js.Object): js.Object
}

object DataSchema {
  @scala.inline
  def apply(
    fields: () => js.Array[_],
    isEmpty: js.Object => js.Object,
    isObjEmpty: js.Object => js.Object,
    transform: js.Object => js.Object
  ): DataSchema = {
    val __obj = js.Dynamic.literal(fields = js.Any.fromFunction0(fields), isEmpty = js.Any.fromFunction1(isEmpty), isObjEmpty = js.Any.fromFunction1(isObjEmpty), transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[DataSchema]
  }
}

