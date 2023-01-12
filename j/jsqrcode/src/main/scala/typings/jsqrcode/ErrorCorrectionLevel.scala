package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCorrectionLevel extends StObject {
  
  val Bits: Double
  
  val Name: String
  
  /* private */ var bits: Double
  
  /* private */ var name: String
  
  /* private */ var ordinal_Renamed_Field: Double
}
object ErrorCorrectionLevel {
  
  inline def apply(Bits: Double, Name: String, bits: Double, name: String, ordinal_Renamed_Field: Double): ErrorCorrectionLevel = {
    val __obj = js.Dynamic.literal(Bits = Bits.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ordinal_Renamed_Field = ordinal_Renamed_Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCorrectionLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorCorrectionLevel] (val x: Self) extends AnyVal {
    
    inline def setBits(value: Double): Self = StObject.set(x, "Bits", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrdinal_Renamed_Field(value: Double): Self = StObject.set(x, "ordinal_Renamed_Field", value.asInstanceOf[js.Any])
  }
}
