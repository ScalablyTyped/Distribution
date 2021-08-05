package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultProcessingOptions extends StObject {
  
  var build: js.UndefOr[Boolean] = js.undefined
  
  var decompose: js.UndefOr[DecomposeOptions] = js.undefined
  
  var document: js.UndefOr[Boolean] = js.undefined
  
  var single: js.UndefOr[Boolean] = js.undefined
  
  var stream: js.UndefOr[Boolean] = js.undefined
}
object ResultProcessingOptions {
  
  inline def apply(): ResultProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultProcessingOptions]
  }
  
  extension [Self <: ResultProcessingOptions](x: Self) {
    
    inline def setBuild(value: Boolean): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setDecompose(value: DecomposeOptions): Self = StObject.set(x, "decompose", value.asInstanceOf[js.Any])
    
    inline def setDecomposeUndefined: Self = StObject.set(x, "decompose", js.undefined)
    
    inline def setDocument(value: Boolean): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
