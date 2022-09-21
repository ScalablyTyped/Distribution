package typings.makerjs.MakerJs.exporter

import typings.makerjs.MakerJs.IPoint
import typings.makerjs.makerjsStrings.evenodd
import typings.makerjs.makerjsStrings.nonzero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SVG Path Data rendering options.
  */
trait ISVGPathDataRenderOptions
  extends StObject
     with IExportOptions {
  
  /**
    * Optional boolean flag to return a map of path data by layer.
    */
  var byLayers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SVG fill-rule.
    */
  var fillRule: js.UndefOr[nonzero | evenodd] = js.undefined
  
  /**
    * Optional origin. Default x = 0, y = topmost y point in the model. Use [0, 0] to use the same origin as Maker.js, which will translate to negative Y values in SVG.
    */
  var origin: js.UndefOr[IPoint] = js.undefined
}
object ISVGPathDataRenderOptions {
  
  inline def apply(): ISVGPathDataRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISVGPathDataRenderOptions]
  }
  
  extension [Self <: ISVGPathDataRenderOptions](x: Self) {
    
    inline def setByLayers(value: Boolean): Self = StObject.set(x, "byLayers", value.asInstanceOf[js.Any])
    
    inline def setByLayersUndefined: Self = StObject.set(x, "byLayers", js.undefined)
    
    inline def setFillRule(value: nonzero | evenodd): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
