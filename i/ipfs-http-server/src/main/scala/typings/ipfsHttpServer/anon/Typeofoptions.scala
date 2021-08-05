package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions extends StObject {
  
  val validate: Typeofvalidate
}
object Typeofoptions {
  
  inline def apply(validate: Typeofvalidate): Typeofoptions = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions]
  }
  
  extension [Self <: Typeofoptions](x: Self) {
    
    inline def setValidate(value: Typeofvalidate): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
