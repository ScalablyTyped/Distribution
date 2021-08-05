package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofoptionsValidate extends StObject {
  
  val validate: TypeofvalidateOptions1
}
object TypeofoptionsValidate {
  
  inline def apply(validate: TypeofvalidateOptions1): TypeofoptionsValidate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoptionsValidate]
  }
  
  extension [Self <: TypeofoptionsValidate](x: Self) {
    
    inline def setValidate(value: TypeofvalidateOptions1): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
