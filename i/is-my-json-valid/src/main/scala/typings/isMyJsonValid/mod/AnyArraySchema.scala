package typings.isMyJsonValid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyArraySchema
  extends StObject
     with ArraySchema[AnySchema]
     with _AnySchema
object AnyArraySchema {
  
  inline def apply(items: AnySchema): AnyArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[AnyArraySchema]
  }
}
