package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetPosition extends StObject {
  
  /** Offset distance from left side of an asset or a window. */
  var left: js.UndefOr[Double] = js.undefined
  
  /** Offset distance from top side of an asset or a window. */
  var top: js.UndefOr[Double] = js.undefined
}
object OffsetPosition {
  
  inline def apply(): OffsetPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetPosition] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
