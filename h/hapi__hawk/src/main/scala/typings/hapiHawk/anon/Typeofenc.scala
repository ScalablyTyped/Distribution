package typings.hapiHawk.anon

import typings.cryptoJs.mod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofenc extends js.Object {
  
  /**
    * Base64 encoding strategy.
    */
  val Base64: Encoder = js.native
  
  /**
    * Hex encoding strategy.
    */
  val Hex: Encoder = js.native
  
  /**
    * Latin1 encoding strategy.
    */
  val Latin1: Encoder = js.native
  
  /**
    * UTF-16 BE encoding strategy.
    */
  val Utf16: Encoder = js.native
  
  val Utf16BE: Encoder = js.native
  
  /**
    * UTF-16 LE encoding strategy.
    */
  val Utf16LE: Encoder = js.native
  
  /**
    * UTF-8 encoding strategy.
    */
  val Utf8: Encoder = js.native
}
object Typeofenc {
  
  @scala.inline
  def apply(
    Base64: Encoder,
    Hex: Encoder,
    Latin1: Encoder,
    Utf16: Encoder,
    Utf16BE: Encoder,
    Utf16LE: Encoder,
    Utf8: Encoder
  ): Typeofenc = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Latin1 = Latin1.asInstanceOf[js.Any], Utf16 = Utf16.asInstanceOf[js.Any], Utf16BE = Utf16BE.asInstanceOf[js.Any], Utf16LE = Utf16LE.asInstanceOf[js.Any], Utf8 = Utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofenc]
  }
  
  @scala.inline
  implicit class TypeofencOps[Self <: Typeofenc] (val x: Self) extends AnyVal {
    
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
    def setBase64(value: Encoder): Self = this.set("Base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: Encoder): Self = this.set("Hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatin1(value: Encoder): Self = this.set("Latin1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf16(value: Encoder): Self = this.set("Utf16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf16BE(value: Encoder): Self = this.set("Utf16BE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf16LE(value: Encoder): Self = this.set("Utf16LE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf8(value: Encoder): Self = this.set("Utf8", value.asInstanceOf[js.Any])
  }
}
