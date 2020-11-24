package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ecprvhex extends js.Object {
  
  var ecprvhex: String = js.native
  
  var ecpubhex: String = js.native
}
object Ecprvhex {
  
  @scala.inline
  def apply(ecprvhex: String, ecpubhex: String): Ecprvhex = {
    val __obj = js.Dynamic.literal(ecprvhex = ecprvhex.asInstanceOf[js.Any], ecpubhex = ecpubhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ecprvhex]
  }
  
  @scala.inline
  implicit class EcprvhexOps[Self <: Ecprvhex] (val x: Self) extends AnyVal {
    
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
    def setEcprvhex(value: String): Self = this.set("ecprvhex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcpubhex(value: String): Self = this.set("ecpubhex", value.asInstanceOf[js.Any])
  }
}
