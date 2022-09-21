package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOffsetPosition extends StObject {
  
  /**
    * Offset distance from left side of an asset or a window.
    */
  var left: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Offset distance from top side of an asset or a window.
    */
  var top: js.UndefOr[Double | Null] = js.undefined
}
object SchemaOffsetPosition {
  
  inline def apply(): SchemaOffsetPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOffsetPosition]
  }
  
  extension [Self <: SchemaOffsetPosition](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftNull: Self = StObject.set(x, "left", null)
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopNull: Self = StObject.set(x, "top", null)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
