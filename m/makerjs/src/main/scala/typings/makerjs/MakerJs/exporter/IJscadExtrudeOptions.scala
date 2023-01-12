package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Jscad CAG extrusion options.
  */
trait IJscadExtrudeOptions extends StObject {
  
  /**
    * Optional depth of 3D extrusion.
    */
  var extrude: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional depth of 3D extrusion.
    */
  var z: js.UndefOr[Double] = js.undefined
}
object IJscadExtrudeOptions {
  
  inline def apply(): IJscadExtrudeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJscadExtrudeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IJscadExtrudeOptions] (val x: Self) extends AnyVal {
    
    inline def setExtrude(value: Double): Self = StObject.set(x, "extrude", value.asInstanceOf[js.Any])
    
    inline def setExtrudeUndefined: Self = StObject.set(x, "extrude", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
