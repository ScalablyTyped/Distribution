package typings.makerjs.MakerJs.exporter

import typings.makerjs.MakerJs.IPointMatchOptions
import typings.makerjs.anon.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Jscad CAG export options.
  */
trait IJscadCagOptions
  extends StObject
     with IExportOptions
     with IPointMatchOptions {
  
  /**
    * Flag to separate chains by layers.
    */
  var byLayers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum length between points on an arc or circle.
    */
  var maxArcFacet: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional callback to get status during the export.
    */
  var statusCallback: js.UndefOr[IStatusCallback] = js.undefined
}
object IJscadCagOptions {
  
  inline def apply(): IJscadCagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJscadCagOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IJscadCagOptions] (val x: Self) extends AnyVal {
    
    inline def setByLayers(value: Boolean): Self = StObject.set(x, "byLayers", value.asInstanceOf[js.Any])
    
    inline def setByLayersUndefined: Self = StObject.set(x, "byLayers", js.undefined)
    
    inline def setMaxArcFacet(value: Double): Self = StObject.set(x, "maxArcFacet", value.asInstanceOf[js.Any])
    
    inline def setMaxArcFacetUndefined: Self = StObject.set(x, "maxArcFacet", js.undefined)
    
    inline def setStatusCallback(value: /* status */ Progress => Unit): Self = StObject.set(x, "statusCallback", js.Any.fromFunction1(value))
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
  }
}
