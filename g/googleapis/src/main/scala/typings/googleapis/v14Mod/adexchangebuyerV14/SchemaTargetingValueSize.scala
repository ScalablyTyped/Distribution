package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValueSize extends StObject {
  
  /**
    * The height of the creative.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the creative.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaTargetingValueSize {
  
  inline def apply(): SchemaTargetingValueSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueSize]
  }
  
  extension [Self <: SchemaTargetingValueSize](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
