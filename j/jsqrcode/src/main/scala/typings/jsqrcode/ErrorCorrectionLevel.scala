package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorCorrectionLevel extends js.Object {
  
  val Bits: Double = js.native
  
  val Name: String = js.native
  
  var bits: Double = js.native
  
  var name: String = js.native
  
  var ordinal_Renamed_Field: Double = js.native
}
object ErrorCorrectionLevel {
  
  @scala.inline
  def apply(Bits: Double, Name: String, bits: Double, name: String, ordinal_Renamed_Field: Double): ErrorCorrectionLevel = {
    val __obj = js.Dynamic.literal(Bits = Bits.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ordinal_Renamed_Field = ordinal_Renamed_Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCorrectionLevel]
  }
  
  @scala.inline
  implicit class ErrorCorrectionLevelOps[Self <: ErrorCorrectionLevel] (val x: Self) extends AnyVal {
    
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
    def setBits(value: Double): Self = this.set("Bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinal_Renamed_Field(value: Double): Self = this.set("ordinal_Renamed_Field", value.asInstanceOf[js.Any])
  }
}
