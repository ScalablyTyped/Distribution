package typings.hapiHawk.anon

import typings.cryptoJs.mod.Format_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofformat extends js.Object {
  
  val Hex: Format_ = js.native
  
  /**
    * OpenSSL formatting strategy.
    */
  val OpenSSL: Format_ = js.native
}
object Typeofformat {
  
  @scala.inline
  def apply(Hex: Format_, OpenSSL: Format_): Typeofformat = {
    val __obj = js.Dynamic.literal(Hex = Hex.asInstanceOf[js.Any], OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofformat]
  }
  
  @scala.inline
  implicit class TypeofformatOps[Self <: Typeofformat] (val x: Self) extends AnyVal {
    
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
    def setHex(value: Format_): Self = this.set("Hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenSSL(value: Format_): Self = this.set("OpenSSL", value.asInstanceOf[js.Any])
  }
}
