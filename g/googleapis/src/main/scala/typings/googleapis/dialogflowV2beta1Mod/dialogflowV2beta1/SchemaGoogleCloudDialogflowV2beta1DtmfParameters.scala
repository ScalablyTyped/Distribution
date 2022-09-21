package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1DtmfParameters extends StObject {
  
  /**
    * Indicates whether DTMF input can be handled in the next request.
    */
  var acceptsDtmfInput: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1DtmfParameters {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1DtmfParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1DtmfParameters]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1DtmfParameters](x: Self) {
    
    inline def setAcceptsDtmfInput(value: Boolean): Self = StObject.set(x, "acceptsDtmfInput", value.asInstanceOf[js.Any])
    
    inline def setAcceptsDtmfInputNull: Self = StObject.set(x, "acceptsDtmfInput", null)
    
    inline def setAcceptsDtmfInputUndefined: Self = StObject.set(x, "acceptsDtmfInput", js.undefined)
  }
}
