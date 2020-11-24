package typings.jimpCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decoders extends js.Object {
  
  var decoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any = js.native
}
object Decoders {
  
  @scala.inline
  def apply(
    decoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any
  ): Decoders = {
    val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decoders]
  }
  
  @scala.inline
  implicit class DecodersOps[Self <: Decoders] (val x: Self) extends AnyVal {
    
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
    def setDecoders(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any
    ): Self = this.set("decoders", value.asInstanceOf[js.Any])
  }
}
