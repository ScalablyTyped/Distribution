package typings.grommet.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errors extends StObject {
  
  var errors: Record[String, _] = js.native
  
  var infos: Record[String, _] = js.native
}
object Errors {
  
  @scala.inline
  def apply(errors: Record[String, _], infos: Record[String, _]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: Record[String, _]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfos(value: Record[String, _]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
  }
}
