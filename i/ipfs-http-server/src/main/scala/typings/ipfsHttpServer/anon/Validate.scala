package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validate extends StObject {
  
  var validate: Options
}
object Validate {
  
  inline def apply(validate: Options): Validate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validate]
  }
  
  extension [Self <: Validate](x: Self) {
    
    inline def setValidate(value: Options): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
