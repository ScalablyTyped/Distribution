package typings.hapiHawk.anon

import typings.cryptoJs.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpad extends js.Object {
  
  /**
    * ANSI X.923 padding strategy.
    */
  val AnsiX923: Padding = js.native
  
  /**
    * ISO 10126 padding strategy.
    */
  val Iso10126: Padding = js.native
  
  /**
    * ISO/IEC 9797-1 Padding Method 2.
    */
  val Iso97971: Padding = js.native
  
  /**
    * A noop padding strategy.
    */
  val NoPadding: Padding = js.native
  
  /**
    * PKCS #5/7 padding strategy.
    */
  val Pkcs7: Padding = js.native
  
  /**
    * Zero padding strategy.
    */
  val ZeroPadding: Padding = js.native
}
object Typeofpad {
  
  @scala.inline
  def apply(
    AnsiX923: Padding,
    Iso10126: Padding,
    Iso97971: Padding,
    NoPadding: Padding,
    Pkcs7: Padding,
    ZeroPadding: Padding
  ): Typeofpad = {
    val __obj = js.Dynamic.literal(AnsiX923 = AnsiX923.asInstanceOf[js.Any], Iso10126 = Iso10126.asInstanceOf[js.Any], Iso97971 = Iso97971.asInstanceOf[js.Any], NoPadding = NoPadding.asInstanceOf[js.Any], Pkcs7 = Pkcs7.asInstanceOf[js.Any], ZeroPadding = ZeroPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpad]
  }
  
  @scala.inline
  implicit class TypeofpadOps[Self <: Typeofpad] (val x: Self) extends AnyVal {
    
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
    def setAnsiX923(value: Padding): Self = this.set("AnsiX923", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso10126(value: Padding): Self = this.set("Iso10126", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso97971(value: Padding): Self = this.set("Iso97971", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoPadding(value: Padding): Self = this.set("NoPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkcs7(value: Padding): Self = this.set("Pkcs7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroPadding(value: Padding): Self = this.set("ZeroPadding", value.asInstanceOf[js.Any])
  }
}
