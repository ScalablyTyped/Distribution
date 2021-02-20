package typings.leafletAwesomeMarkers

import typings.leaflet.mod.BaseIconOptions
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.black
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.blue
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.cadetblue
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkgreen
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkpurple
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkred
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.fa
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.glyphicon
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.green
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.orange
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.purple
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.red
import typings.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object AwesomeMarkers {
    
    @JSImport("leaflet", "AwesomeMarkers.Icon")
    @js.native
    class Icon_ ()
      extends typings.leaflet.mod.Icon_[AwesomeMarkersIconOptions] {
      def this(options: AwesomeMarkersIconOptions) = this()
    }
    
    @JSImport("leaflet", "AwesomeMarkers.icon")
    @js.native
    def icon(options: AwesomeMarkersIconOptions): Icon_ = js.native
    
    @JSImport("leaflet", "AwesomeMarkers.version")
    @js.native
    val version: String = js.native
    
    @js.native
    trait AwesomeMarkersIconOptions extends BaseIconOptions {
      
      /**
        * Additional classes in the created tag
        */
      var extraClasses: js.UndefOr[String] = js.native
      
      /**
        * Name of the icon. See glyphicons or font-awesome.
        */
      var icon: js.UndefOr[String] = js.native
      
      /**
        * Color of the icon. 'white', 'black' or css code (hex, rgba etc).
        */
      var iconColor: js.UndefOr[white | black | String] = js.native
      
      /**
        * Color of the marker
        */
      var markerColor: js.UndefOr[
            red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue
          ] = js.native
      
      /**
        * Select de icon library. 'fa' for font-awesome or 'glyphicon' for bootstrap 3.
        */
      var prefix: js.UndefOr[fa | glyphicon] = js.native
      
      /**
        * Make the icon spin. true or false. Font-awesome required
        */
      var spin: js.UndefOr[Boolean] = js.native
    }
    object AwesomeMarkersIconOptions {
      
      @scala.inline
      def apply(): AwesomeMarkersIconOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AwesomeMarkersIconOptions]
      }
      
      @scala.inline
      implicit class AwesomeMarkersIconOptionsMutableBuilder[Self <: AwesomeMarkersIconOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExtraClasses(value: String): Self = StObject.set(x, "extraClasses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtraClassesUndefined: Self = StObject.set(x, "extraClasses", js.undefined)
        
        @scala.inline
        def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconColor(value: white | black | String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setMarkerColor(value: red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
        
        @scala.inline
        def setPrefix(value: fa | glyphicon): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      }
    }
  }
}
