package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Color extends StObject {
  
  /**
    * The amount of blue in the color as a value in the interval [0, 1].
    */
  var blue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount of green in the color as a value in the interval [0, 1].
    */
  var green: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount of red in the color as a value in the interval [0, 1].
    */
  var red: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Color {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Color]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Color](x: Self) {
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueNull: Self = StObject.set(x, "blue", null)
    
    inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenNull: Self = StObject.set(x, "green", null)
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedNull: Self = StObject.set(x, "red", null)
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
