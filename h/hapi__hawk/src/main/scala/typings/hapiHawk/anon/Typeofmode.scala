package typings.hapiHawk.anon

import typings.cryptoJs.mod.BlockCipherMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmode extends js.Object {
  
  /**
    * Cipher Block Chaining mode.
    */
  val CBC: BlockCipherMode = js.native
  
  /**
    * Cipher Feedback block mode.
    */
  val CFB: BlockCipherMode = js.native
  
  /**
    * Counter block mode.
    */
  val CTR: BlockCipherMode = js.native
  
  /**
    * @preserve
    * Counter block mode compatible with  Dr Brian Gladman fileenc.c
    * derived from CryptoJS.mode.CTR
    * Jan Hruby jhruby.web@gmail.com
    */
  val CTRGladman: BlockCipherMode = js.native
  
  /**
    * Electronic Codebook block mode.
    */
  val ECB: BlockCipherMode = js.native
  
  /**
    * Output Feedback block mode.
    */
  val OFB: BlockCipherMode = js.native
}
object Typeofmode {
  
  @scala.inline
  def apply(
    CBC: BlockCipherMode,
    CFB: BlockCipherMode,
    CTR: BlockCipherMode,
    CTRGladman: BlockCipherMode,
    ECB: BlockCipherMode,
    OFB: BlockCipherMode
  ): Typeofmode = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmode]
  }
  
  @scala.inline
  implicit class TypeofmodeOps[Self <: Typeofmode] (val x: Self) extends AnyVal {
    
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
    def setCBC(value: BlockCipherMode): Self = this.set("CBC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCFB(value: BlockCipherMode): Self = this.set("CFB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCTR(value: BlockCipherMode): Self = this.set("CTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCTRGladman(value: BlockCipherMode): Self = this.set("CTRGladman", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECB(value: BlockCipherMode): Self = this.set("ECB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOFB(value: BlockCipherMode): Self = this.set("OFB", value.asInstanceOf[js.Any])
  }
}
