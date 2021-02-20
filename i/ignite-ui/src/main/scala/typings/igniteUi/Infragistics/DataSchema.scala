package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSchema extends StObject {
  
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
  
  @scala.inline
  implicit class DataSchemaMutableBuilder[Self <: DataSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: () => js.Array[_]): Self = StObject.set(x, "fields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: js.Object => js.Object): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsObjEmpty(value: js.Object => js.Object): Self = StObject.set(x, "isObjEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransform(value: js.Object => js.Object): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
  }
}
