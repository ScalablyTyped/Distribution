package typings.isMyJsonValid.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyAllOptionalObjectSchema
  extends StObject
     with AllOptionalObjectSchema[Record[String, AnySchema]]
     with _AnySchema
object AnyAllOptionalObjectSchema {
  
  inline def apply(properties: Record[String, AnySchema]): AnyAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[AnyAllOptionalObjectSchema]
  }
}
