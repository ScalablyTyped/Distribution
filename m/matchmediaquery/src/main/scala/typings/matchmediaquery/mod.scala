package typings.matchmediaquery

import typings.matchmediaquery.anon.PartialMediaValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(query: String): Mql = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[Mql]
  inline def apply(query: String, values: Unit, forceStatic: Boolean): Mql = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], values.asInstanceOf[js.Any], forceStatic.asInstanceOf[js.Any])).asInstanceOf[Mql]
  inline def apply(query: String, values: PartialMediaValues): Mql = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Mql]
  inline def apply(query: String, values: PartialMediaValues, forceStatic: Boolean): Mql = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], values.asInstanceOf[js.Any], forceStatic.asInstanceOf[js.Any])).asInstanceOf[Mql]
  
  @JSImport("matchmediaquery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Record<'aspect-ratio' | 'color-index' | 'color' | 'device-aspect-ratio' | 'device-height' | 'device-width' | 'grid' | 'height' | 'monochrome' | 'orientation' | 'resolution' | 'scan' | 'type' | 'width', unknown> */
  trait MediaValues extends StObject {
    
    var `aspect-ratio`: Any
    
    var color: Any
    
    var `color-index`: Any
    
    var `device-aspect-ratio`: Any
    
    var `device-height`: Any
    
    var `device-width`: Any
    
    var grid: Any
    
    var height: Any
    
    var monochrome: Any
    
    var orientation: Any
    
    var resolution: Any
    
    var scan: Any
    
    var `type`: Any
    
    var width: Any
  }
  object MediaValues {
    
    inline def apply(
      `aspect-ratio`: Any,
      color: Any,
      `color-index`: Any,
      `device-aspect-ratio`: Any,
      `device-height`: Any,
      `device-width`: Any,
      grid: Any,
      height: Any,
      monochrome: Any,
      orientation: Any,
      resolution: Any,
      scan: Any,
      `type`: Any,
      width: Any
    ): MediaValues = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], scan = scan.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("aspect-ratio")(`aspect-ratio`.asInstanceOf[js.Any])
      __obj.updateDynamic("color-index")(`color-index`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-aspect-ratio")(`device-aspect-ratio`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-height")(`device-height`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-width")(`device-width`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaValues] (val x: Self) extends AnyVal {
      
      inline def `setAspect-ratio`(value: Any): Self = StObject.set(x, "aspect-ratio", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def `setColor-index`(value: Any): Self = StObject.set(x, "color-index", value.asInstanceOf[js.Any])
      
      inline def `setDevice-aspect-ratio`(value: Any): Self = StObject.set(x, "device-aspect-ratio", value.asInstanceOf[js.Any])
      
      inline def `setDevice-height`(value: Any): Self = StObject.set(x, "device-height", value.asInstanceOf[js.Any])
      
      inline def `setDevice-width`(value: Any): Self = StObject.set(x, "device-width", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMonochrome(value: Any): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Any): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setScan(value: Any): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mql extends StObject {
    
    def dispose(): Unit
    
    var matches: Boolean
    
    var media: String
    
    def update(evt: Mql): Unit
  }
  object Mql {
    
    inline def apply(dispose: () => Unit, matches: Boolean, media: String, update: Mql => Unit): Mql = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), matches = matches.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Mql]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mql] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Mql => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
