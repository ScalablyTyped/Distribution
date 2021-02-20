package typings.heremaps.H.ui

import typings.heremaps.H.map.Icon
import typings.heremaps.H.map.SpatialStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DistanceMeasurement {
  
  /**
    * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.RIGHT_BOTTOM
    * @property startIcon {H.map.Icon=} - the icon to use for the first measurement point
    * @property stopoverIcon {H.map.Icon=} - the icon to use for the intermediate measurement points
    * @property endIcon {H.map.Icon=} - the icon to use for the last measurement point
    * @property splitIcon {H.map.Icon=} - the icon to use for indicating position under pointer over the line where new point will be created once user clicks
    * @property lineStyle {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - the style to use for connecting lines of the measurement points
    * @property distanceFormatter {function(number)=} - Optional function used for formatting a distance. By default distance measurement tool will do the formatting according to the
    * specified measurement unit (see H.ui.UI.Options#unitSystem)
    */
  @js.native
  trait Options extends StObject {
    
    var alignment: js.UndefOr[LayoutAlignment] = js.native
    
    var distanceFormatter: js.UndefOr[js.Function1[/* n */ Double, Unit]] = js.native
    
    var endIcon: js.UndefOr[Icon] = js.native
    
    var lineStyle: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options = js.native
    
    var splitIcon: js.UndefOr[Icon] = js.native
    
    var startIcon: js.UndefOr[Icon] = js.native
    
    var stopoverIcon: js.UndefOr[Icon] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(lineStyle: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Options = {
      val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: LayoutAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setDistanceFormatter(value: /* n */ Double => Unit): Self = StObject.set(x, "distanceFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDistanceFormatterUndefined: Self = StObject.set(x, "distanceFormatter", js.undefined)
      
      @scala.inline
      def setEndIcon(value: Icon): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
      
      @scala.inline
      def setLineStyle(value: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitIcon(value: Icon): Self = StObject.set(x, "splitIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitIconUndefined: Self = StObject.set(x, "splitIcon", js.undefined)
      
      @scala.inline
      def setStartIcon(value: Icon): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
      
      @scala.inline
      def setStopoverIcon(value: Icon): Self = StObject.set(x, "stopoverIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopoverIconUndefined: Self = StObject.set(x, "stopoverIcon", js.undefined)
    }
  }
}
