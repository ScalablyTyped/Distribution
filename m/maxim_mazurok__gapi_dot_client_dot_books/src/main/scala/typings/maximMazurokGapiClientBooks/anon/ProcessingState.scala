package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingState extends StObject {
  
  var processingState: js.UndefOr[String] = js.undefined
}
object ProcessingState {
  
  inline def apply(): ProcessingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingState]
  }
  
  extension [Self <: ProcessingState](x: Self) {
    
    inline def setProcessingState(value: String): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
    
    inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
  }
}
