package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcFourVariant extends js.Object {
  
  var ArcFourVariant: Double = js.native
  
  var ChaCha20: Double = js.native
  
  var Null: Double = js.native
  
  var Salsa20: Double = js.native
}
object ArcFourVariant {
  
  @scala.inline
  def apply(ArcFourVariant: Double, ChaCha20: Double, Null: Double, Salsa20: Double): ArcFourVariant = {
    val __obj = js.Dynamic.literal(ArcFourVariant = ArcFourVariant.asInstanceOf[js.Any], ChaCha20 = ChaCha20.asInstanceOf[js.Any], Null = Null.asInstanceOf[js.Any], Salsa20 = Salsa20.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcFourVariant]
  }
  
  @scala.inline
  implicit class ArcFourVariantOps[Self <: ArcFourVariant] (val x: Self) extends AnyVal {
    
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
    def setArcFourVariant(value: Double): Self = this.set("ArcFourVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChaCha20(value: Double): Self = this.set("ChaCha20", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNull(value: Double): Self = this.set("Null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalsa20(value: Double): Self = this.set("Salsa20", value.asInstanceOf[js.Any])
  }
}
