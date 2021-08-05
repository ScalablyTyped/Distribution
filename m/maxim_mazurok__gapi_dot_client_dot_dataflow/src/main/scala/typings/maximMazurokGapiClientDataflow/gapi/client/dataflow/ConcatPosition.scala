package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatPosition extends StObject {
  
  /** Index of the inner source. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** Position within the inner source. */
  var position: js.UndefOr[Position] = js.undefined
}
object ConcatPosition {
  
  inline def apply(): ConcatPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcatPosition]
  }
  
  extension [Self <: ConcatPosition](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
