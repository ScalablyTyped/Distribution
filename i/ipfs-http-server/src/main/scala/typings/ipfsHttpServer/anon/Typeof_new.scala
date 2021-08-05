package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeof_new extends StObject {
  
  val options: TypeofoptionsValidate
}
object Typeof_new {
  
  inline def apply(options: TypeofoptionsValidate): Typeof_new = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeof_new]
  }
  
  extension [Self <: Typeof_new](x: Self) {
    
    inline def setOptions(value: TypeofoptionsValidate): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
