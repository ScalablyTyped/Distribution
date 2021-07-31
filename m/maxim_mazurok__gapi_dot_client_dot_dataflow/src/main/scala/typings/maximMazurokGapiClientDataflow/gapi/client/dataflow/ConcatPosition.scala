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
  
  @scala.inline
  def apply(): ConcatPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcatPosition]
  }
  
  @scala.inline
  implicit class ConcatPositionMutableBuilder[Self <: ConcatPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
