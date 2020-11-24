package typings.jimpCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constants extends js.Object {
  
  var constants: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any = js.native
}
object Constants {
  
  @scala.inline
  def apply(
    constants: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any
  ): Constants = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
  
  @scala.inline
  implicit class ConstantsOps[Self <: Constants] (val x: Self) extends AnyVal {
    
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
    def setConstants(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any
    ): Self = this.set("constants", value.asInstanceOf[js.Any])
  }
}
