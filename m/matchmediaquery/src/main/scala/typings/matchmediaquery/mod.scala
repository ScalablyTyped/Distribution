package typings.matchmediaquery

import typings.matchmediaquery.anon.PartialMediaValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("matchmediaquery", JSImport.Namespace)
  @js.native
  def apply(query: String): Mql = js.native
  @JSImport("matchmediaquery", JSImport.Namespace)
  @js.native
  def apply(query: String, values: js.UndefOr[scala.Nothing], forceStatic: Boolean): Mql = js.native
  @JSImport("matchmediaquery", JSImport.Namespace)
  @js.native
  def apply(query: String, values: PartialMediaValues): Mql = js.native
  @JSImport("matchmediaquery", JSImport.Namespace)
  @js.native
  def apply(query: String, values: PartialMediaValues, forceStatic: Boolean): Mql = js.native
  
  /* Inlined std.Record<'aspect-ratio' | 'color-index' | 'color' | 'device-aspect-ratio' | 'device-height' | 'device-width' | 'grid' | 'height' | 'monochrome' | 'orientation' | 'resolution' | 'scan' | 'type' | 'width', unknown> */
  @js.native
  trait MediaValues extends StObject {
    
    var `aspect-ratio`: js.Any = js.native
    
    var color: js.Any = js.native
    
    var `color-index`: js.Any = js.native
    
    var `device-aspect-ratio`: js.Any = js.native
    
    var `device-height`: js.Any = js.native
    
    var `device-width`: js.Any = js.native
    
    var grid: js.Any = js.native
    
    var height: js.Any = js.native
    
    var monochrome: js.Any = js.native
    
    var orientation: js.Any = js.native
    
    var resolution: js.Any = js.native
    
    var scan: js.Any = js.native
    
    var `type`: js.Any = js.native
    
    var width: js.Any = js.native
  }
  object MediaValues {
    
    @scala.inline
    def apply(
      `aspect-ratio`: js.Any,
      color: js.Any,
      `color-index`: js.Any,
      `device-aspect-ratio`: js.Any,
      `device-height`: js.Any,
      `device-width`: js.Any,
      grid: js.Any,
      height: js.Any,
      monochrome: js.Any,
      orientation: js.Any,
      resolution: js.Any,
      scan: js.Any,
      `type`: js.Any,
      width: js.Any
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
    implicit class MediaValuesMutableBuilder[Self <: MediaValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAspect-ratio`(value: js.Any): Self = StObject.set(x, "aspect-ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColor-index`(value: js.Any): Self = StObject.set(x, "color-index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDevice-aspect-ratio`(value: js.Any): Self = StObject.set(x, "device-aspect-ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDevice-height`(value: js.Any): Self = StObject.set(x, "device-height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDevice-width`(value: js.Any): Self = StObject.set(x, "device-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonochrome(value: js.Any): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: js.Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolution(value: js.Any): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScan(value: js.Any): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mql extends StObject {
    
    def dispose(): Unit = js.native
    
    var matches: Boolean = js.native
    
    var media: String = js.native
    
    def update(evt: Mql): Unit = js.native
  }
  object Mql {
    
    @scala.inline
    def apply(dispose: () => Unit, matches: Boolean, media: String, update: Mql => Unit): Mql = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), matches = matches.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Mql]
    }
    
    @scala.inline
    implicit class MqlMutableBuilder[Self <: Mql] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: Mql => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
