package typings.materialUiLab.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@material-ui/lab.@material-ui/lab/Alert/Alert.Color, react.react.ReactNode>> */
trait PartialRecordColorReactNo extends StObject {
  
  var error: js.UndefOr[ReactNode] = js.undefined
  
  var info: js.UndefOr[ReactNode] = js.undefined
  
  var success: js.UndefOr[ReactNode] = js.undefined
  
  var warning: js.UndefOr[ReactNode] = js.undefined
}
object PartialRecordColorReactNo {
  
  inline def apply(): PartialRecordColorReactNo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordColorReactNo]
  }
  
  extension [Self <: PartialRecordColorReactNo](x: Self) {
    
    inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: ReactNode): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setSuccess(value: ReactNode): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: ReactNode): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
