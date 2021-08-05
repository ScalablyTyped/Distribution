package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom dimension.
  */
trait SchemaCustomDimension extends StObject {
  
  /**
    * Slot number of custom dimension.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Value of the custom dimension. Default value (i.e. empty string)
    * indicates clearing sesion/visitor scope custom dimension value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaCustomDimension {
  
  inline def apply(): SchemaCustomDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDimension]
  }
  
  extension [Self <: SchemaCustomDimension](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
