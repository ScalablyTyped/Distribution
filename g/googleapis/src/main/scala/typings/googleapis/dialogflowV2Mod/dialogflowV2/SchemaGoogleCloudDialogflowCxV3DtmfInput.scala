package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3DtmfInput extends StObject {
  
  /**
    * The dtmf digits.
    */
  var digits: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The finish digit (if any).
    */
  var finishDigit: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3DtmfInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3DtmfInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3DtmfInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3DtmfInput](x: Self) {
    
    inline def setDigits(value: String): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsNull: Self = StObject.set(x, "digits", null)
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setFinishDigit(value: String): Self = StObject.set(x, "finishDigit", value.asInstanceOf[js.Any])
    
    inline def setFinishDigitNull: Self = StObject.set(x, "finishDigit", null)
    
    inline def setFinishDigitUndefined: Self = StObject.set(x, "finishDigit", js.undefined)
  }
}
