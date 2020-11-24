package typings.jimpCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoders extends js.Object {
  
  var encoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any = js.native
}
object Encoders {
  
  @scala.inline
  def apply(
    encoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any
  ): Encoders = {
    val __obj = js.Dynamic.literal(encoders = encoders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoders]
  }
  
  @scala.inline
  implicit class EncodersOps[Self <: Encoders] (val x: Self) extends AnyVal {
    
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
    def setEncoders(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any
    ): Self = this.set("encoders", value.asInstanceOf[js.Any])
  }
}
