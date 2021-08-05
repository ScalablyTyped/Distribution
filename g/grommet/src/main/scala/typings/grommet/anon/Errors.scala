package typings.grommet.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: Record[String, js.Any]
  
  var infos: Record[String, js.Any]
}
object Errors {
  
  inline def apply(errors: Record[String, js.Any], infos: Record[String, js.Any]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: Record[String, js.Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setInfos(value: Record[String, js.Any]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
  }
}
