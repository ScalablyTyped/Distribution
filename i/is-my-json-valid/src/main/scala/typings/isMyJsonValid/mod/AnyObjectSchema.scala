package typings.isMyJsonValid.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyObjectSchema
  extends StObject
     with ObjectSchema[Record[String, AnySchema], String]
     with _AnySchema
object AnyObjectSchema {
  
  @scala.inline
  def apply(properties: Record[String, AnySchema], required: js.Array[String]): AnyObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[AnyObjectSchema]
  }
}
