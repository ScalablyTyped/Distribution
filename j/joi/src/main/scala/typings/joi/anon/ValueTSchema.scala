package typings.joi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueTSchema[TSchema] extends StObject {
  
  var value: TSchema
}
object ValueTSchema {
  
  inline def apply[TSchema](value: TSchema): ValueTSchema[TSchema] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTSchema[TSchema]]
  }
  
  extension [Self <: ValueTSchema[?], TSchema](x: Self & ValueTSchema[TSchema]) {
    
    inline def setValue(value: TSchema): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
