package typings.grommet.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errors extends js.Object {
  
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
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrors(value: Record[String, _]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfos(value: Record[String, _]): Self = this.set("infos", value.asInstanceOf[js.Any])
  }
}
