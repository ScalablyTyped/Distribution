package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Jscad CSG export options.
  */
trait IJscadCsgOptions
  extends StObject
     with IJscadCagOptions
     with IJscadExtrudeOptions {
  
  /**
    * SVG options per layer.
    */
  var layerOptions: js.UndefOr[StringDictionary[IJscadExtrudeOptions]] = js.undefined
}
object IJscadCsgOptions {
  
  inline def apply(): IJscadCsgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJscadCsgOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IJscadCsgOptions] (val x: Self) extends AnyVal {
    
    inline def setLayerOptions(value: StringDictionary[IJscadExtrudeOptions]): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    inline def setLayerOptionsUndefined: Self = StObject.set(x, "layerOptions", js.undefined)
  }
}
