package typings.grommet.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: Record[String, Any]
  
  var infos: Record[String, Any]
  
  var valid: Boolean
}
object Errors {
  
  inline def apply(errors: Record[String, Any], infos: Record[String, Any], valid: Boolean): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: Record[String, Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setInfos(value: Record[String, Any]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
