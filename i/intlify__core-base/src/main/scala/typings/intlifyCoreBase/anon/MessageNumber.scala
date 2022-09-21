package typings.intlifyCoreBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageNumber extends StObject {
  
  var datetime: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  ] = js.undefined
  
  var message: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any
  ] = js.undefined
  
  var number: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer N */ js.Any
  ] = js.undefined
}
object MessageNumber {
  
  inline def apply(): MessageNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageNumber]
  }
  
  extension [Self <: MessageNumber](x: Self) {
    
    inline def setDatetime(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    inline def setMessage(value: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNumber(value: /* import warning: importer.ImportType#apply Failed type conversion: infer N */ js.Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
