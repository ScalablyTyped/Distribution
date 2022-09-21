package typings.makerjs.MakerJs.exporter

import typings.makerjs.MakerJs.IFindLoopsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OpenJsCad export options.
  */
trait IOpenJsCadOptions
  extends StObject
     with IFindLoopsOptions
     with IExportOptions {
  
  /**
    * Optional depth of 3D extrusion.
    */
  var extrusion: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional size of curve facets.
    */
  var facetSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional override of function name, default is "main".
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional options applied to specific first-child models by model id.
    */
  var modelMap: js.UndefOr[IOpenJsCadOptionsMap] = js.undefined
}
object IOpenJsCadOptions {
  
  inline def apply(): IOpenJsCadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenJsCadOptions]
  }
  
  extension [Self <: IOpenJsCadOptions](x: Self) {
    
    inline def setExtrusion(value: Double): Self = StObject.set(x, "extrusion", value.asInstanceOf[js.Any])
    
    inline def setExtrusionUndefined: Self = StObject.set(x, "extrusion", js.undefined)
    
    inline def setFacetSize(value: Double): Self = StObject.set(x, "facetSize", value.asInstanceOf[js.Any])
    
    inline def setFacetSizeUndefined: Self = StObject.set(x, "facetSize", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setModelMap(value: IOpenJsCadOptionsMap): Self = StObject.set(x, "modelMap", value.asInstanceOf[js.Any])
    
    inline def setModelMapUndefined: Self = StObject.set(x, "modelMap", js.undefined)
  }
}
