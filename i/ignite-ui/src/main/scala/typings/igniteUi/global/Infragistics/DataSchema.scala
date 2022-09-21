package typings.igniteUi.global.Infragistics

import typings.igniteUi.DataSchemaSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.DataSchema")
@js.native
open class DataSchema protected ()
  extends StObject
     with typings.igniteUi.Infragistics.DataSchema {
  def this(schema: DataSchemaSchema) = this()
  
  /**
    * A list of field definitions specifying the schema of the data source.
    * Field objects description: {fieldName, [fieldDataType], [fieldXPath]}
    */
  /* CompleteClass */
  override def fields(): js.Array[Any] = js.native
  
  /**
    * Specifies if the object is null, undefined, or an empty string
    *
    * @param o the object to check for being empty
    */
  /* CompleteClass */
  override def isEmpty(o: js.Object): js.Object = js.native
  
  /**
    * Specifies if the object has custom properties or not
    *
    * @param obj the object to check for presence or lack of custom properties
    */
  /* CompleteClass */
  override def isObjEmpty(obj: js.Object): js.Object = js.native
  
  /**
    * Performs a transformation on the schema so that the resulting data matches the schema
    *
    * @param data the data to transform
    */
  /* CompleteClass */
  override def transform(data: js.Object): js.Object = js.native
}
