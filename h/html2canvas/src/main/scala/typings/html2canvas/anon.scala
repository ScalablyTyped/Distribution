package typings.html2canvas

import typings.html2canvas.distTypesCoreCacheStorageMod.Cache
import typings.std.Document
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<html2canvas.html2canvas.Options> */
  trait PartialOptions extends StObject {
    
    var allowTaint: js.UndefOr[Boolean] = js.undefined
    
    var backgroundColor: js.UndefOr[String | Null] = js.undefined
    
    var cache: js.UndefOr[Cache] = js.undefined
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var foreignObjectRendering: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var ignoreElements: js.UndefOr[js.Function1[/* element */ Element, Boolean]] = js.undefined
    
    var imageTimeout: js.UndefOr[Double] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var onclone: js.UndefOr[js.Function2[/* document */ Document, /* element */ HTMLElement, Unit]] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var removeContainer: js.UndefOr[Boolean] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var scrollX: js.UndefOr[Double] = js.undefined
    
    var scrollY: js.UndefOr[Double] = js.undefined
    
    var useCORS: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAllowTaint(value: Boolean): Self = StObject.set(x, "allowTaint", value.asInstanceOf[js.Any])
      
      inline def setAllowTaintUndefined: Self = StObject.set(x, "allowTaint", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setForeignObjectRendering(value: Boolean): Self = StObject.set(x, "foreignObjectRendering", value.asInstanceOf[js.Any])
      
      inline def setForeignObjectRenderingUndefined: Self = StObject.set(x, "foreignObjectRendering", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIgnoreElements(value: /* element */ Element => Boolean): Self = StObject.set(x, "ignoreElements", js.Any.fromFunction1(value))
      
      inline def setIgnoreElementsUndefined: Self = StObject.set(x, "ignoreElements", js.undefined)
      
      inline def setImageTimeout(value: Double): Self = StObject.set(x, "imageTimeout", value.asInstanceOf[js.Any])
      
      inline def setImageTimeoutUndefined: Self = StObject.set(x, "imageTimeout", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setOnclone(value: (/* document */ Document, /* element */ HTMLElement) => Unit): Self = StObject.set(x, "onclone", js.Any.fromFunction2(value))
      
      inline def setOncloneUndefined: Self = StObject.set(x, "onclone", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRemoveContainer(value: Boolean): Self = StObject.set(x, "removeContainer", value.asInstanceOf[js.Any])
      
      inline def setRemoveContainerUndefined: Self = StObject.set(x, "removeContainer", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      inline def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
      
      inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
      
      inline def setUseCORS(value: Boolean): Self = StObject.set(x, "useCORS", value.asInstanceOf[js.Any])
      
      inline def setUseCORSUndefined: Self = StObject.set(x, "useCORS", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      inline def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      inline def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
