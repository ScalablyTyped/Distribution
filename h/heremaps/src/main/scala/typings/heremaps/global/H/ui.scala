package typings.heremaps.global.H

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.service.DefaultLayers
import typings.heremaps.H.service.Platform.MapTypes
import typings.heremaps.H.ui.DistanceMeasurement.Options
import typings.heremaps.H.ui.i18n.Localization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** ui *****/
object ui {
  
  /**
    * This class represents the base class for UI controls on the map.
    */
  @JSGlobal("H.ui.Control")
  @js.native
  open class Control ()
    extends StObject
       with typings.heremaps.H.ui.Control
  
  /**
    * This class represents a distance measurement control which helps calculating distances between geographical locations indicated by the user clicks.
    */
  @JSGlobal("H.ui.DistanceMeasurement")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.ui.DistanceMeasurement.Options=} - optional parameters to be passed to this control
    */
  open class DistanceMeasurement ()
    extends StObject
       with typings.heremaps.H.ui.Control {
    def this(opt_options: Options) = this()
  }
  
  /**
    * This class represents an information bubble bound to a geo-position on the map.
    */
  @JSGlobal("H.ui.InfoBubble")
  @js.native
  open class InfoBubble protected ()
    extends StObject
       with typings.heremaps.H.ui.InfoBubble {
    /**
      * Constructor
      * @param position {H.geo.IPoint} - the geo-position to which this info bubble corresponds
      * @param opt_options {H.ui.InfoBubble.Options=} - optional parameters to be passed to the info bubble
      */
    def this(position: IPoint) = this()
    def this(position: IPoint, opt_options: typings.heremaps.H.ui.InfoBubble.Options) = this()
  }
  object InfoBubble {
    
    /**
      * This enumeration holds the state an info bubble can have.
      */
    @JSGlobal("H.ui.InfoBubble.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.ui.InfoBubble.State & Double] = js.native
      
      /* 1 */ val CLOSED: typings.heremaps.H.ui.InfoBubble.State.CLOSED & Double = js.native
      
      /* 0 */ val OPEN: typings.heremaps.H.ui.InfoBubble.State.OPEN & Double = js.native
    }
  }
  
  /**
    * This enumeration holds the possible layout alignments for the UI elements.
    */
  @JSGlobal("H.ui.LayoutAlignment")
  @js.native
  object LayoutAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heremaps.H.ui.LayoutAlignment & Double] = js.native
    
    /* 10 */ val BOTTOM_CENTER: typings.heremaps.H.ui.LayoutAlignment.BOTTOM_CENTER & Double = js.native
    
    /* 9 */ val BOTTOM_LEFT: typings.heremaps.H.ui.LayoutAlignment.BOTTOM_LEFT & Double = js.native
    
    /* 11 */ val BOTTOM_RIGHT: typings.heremaps.H.ui.LayoutAlignment.BOTTOM_RIGHT & Double = js.native
    
    /* 5 */ val LEFT_BOTTOM: typings.heremaps.H.ui.LayoutAlignment.LEFT_BOTTOM & Double = js.native
    
    /* 4 */ val LEFT_MIDDLE: typings.heremaps.H.ui.LayoutAlignment.LEFT_MIDDLE & Double = js.native
    
    /* 3 */ val LEFT_TOP: typings.heremaps.H.ui.LayoutAlignment.LEFT_TOP & Double = js.native
    
    /* 8 */ val RIGHT_BOTTOM: typings.heremaps.H.ui.LayoutAlignment.RIGHT_BOTTOM & Double = js.native
    
    /* 7 */ val RIGHT_MIDDLE: typings.heremaps.H.ui.LayoutAlignment.RIGHT_MIDDLE & Double = js.native
    
    /* 6 */ val RIGHT_TOP: typings.heremaps.H.ui.LayoutAlignment.RIGHT_TOP & Double = js.native
    
    /* 1 */ val TOP_CENTER: typings.heremaps.H.ui.LayoutAlignment.TOP_CENTER & Double = js.native
    
    /* 0 */ val TOP_LEFT: typings.heremaps.H.ui.LayoutAlignment.TOP_LEFT & Double = js.native
    
    /* 2 */ val TOP_RIGHT: typings.heremaps.H.ui.LayoutAlignment.TOP_RIGHT & Double = js.native
  }
  
  /**
    * This class represents a menu control allowing to control which map type the map shows, etc.
    */
  @JSGlobal("H.ui.MapSettingsControl")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.ui.MapSettingsControl.Options=} - optional parameters to be passed to this control
    */
  open class MapSettingsControl ()
    extends StObject
       with typings.heremaps.H.ui.MapSettingsControl {
    def this(opt_options: typings.heremaps.H.ui.MapSettingsControl.Options) = this()
  }
  
  /**
    * This class represents the UI controls for panorama
    */
  @JSGlobal("H.ui.Pano")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.ui.Pano.Options=} - optional parameters to be passed to the map.
    */
  open class Pano ()
    extends StObject
       with typings.heremaps.H.ui.Control {
    def this(opt_options: typings.heremaps.H.ui.Pano.Options) = this()
  }
  
  /**
    * This class represents a UI element showing the current zoom scale.
    */
  @JSGlobal("H.ui.ScaleBar")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.ui.ScaleBar.Options=} - optional parameters to be passed to this scale bar.
    */
  open class ScaleBar ()
    extends StObject
       with typings.heremaps.H.ui.ScaleBar {
    def this(opt_options: typings.heremaps.H.ui.ScaleBar.Options) = this()
  }
  
  /**
    * This class encapsulates map UI functionality.
    */
  @JSGlobal("H.ui.UI")
  @js.native
  open class UI protected ()
    extends StObject
       with typings.heremaps.H.ui.UI {
    /**
      * Constructor
      * @param map {H.Map}
      * @param opt_options {H.ui.UI.Options=}
      */
    def this(map: typings.heremaps.H.Map_) = this()
    def this(map: typings.heremaps.H.Map_, opt_options: typings.heremaps.H.ui.UI.Options) = this()
  }
  object UI {
    
    @JSGlobal("H.ui.UI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createDefault(map: typings.heremaps.H.Map_, mapTypes: DefaultLayers): typings.heremaps.H.ui.UI = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefault")(map.asInstanceOf[js.Any], mapTypes.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.ui.UI]
    inline def createDefault(map: typings.heremaps.H.Map_, mapTypes: DefaultLayers, opt_locale: String): typings.heremaps.H.ui.UI = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefault")(map.asInstanceOf[js.Any], mapTypes.asInstanceOf[js.Any], opt_locale.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.ui.UI]
    inline def createDefault(map: typings.heremaps.H.Map_, mapTypes: DefaultLayers, opt_locale: Localization): typings.heremaps.H.ui.UI = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefault")(map.asInstanceOf[js.Any], mapTypes.asInstanceOf[js.Any], opt_locale.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.ui.UI]
    /**
      * This function creates the default UI including the zoom control,
      * map settings control and scalebar and panorama discovery control.
      * The default controls will be assigned the following values:
      *
      * Zoom control:
      *     id: 'zoom'
      *     alignment: 'right-middle'
      * Map settings control:
      *     id: 'mapsettings'
      *     alignment: 'bottom-right'
      * Scalebar:
      *     id: 'scalebar'
      *     alignment: 'bottom-right'
      * Pano:
      *     id: 'panorama'
      *     alignment: 'top-right'
      *
      * @param map {H.Map} - The map instance to which to append the UI
      * @param mapTypes {Object<H.service.MapType>} - The map types to use
      * @param opt_locale {(H.ui.i18n.Localization | string)=} - the language to use (or a full localization object).
      * @returns {H.ui.UI} - the UI instance configured with the default controls
      */
    /* static member */
    inline def createDefault(map: typings.heremaps.H.Map_, mapTypes: MapTypes): typings.heremaps.H.ui.UI = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefault")(map.asInstanceOf[js.Any], mapTypes.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.ui.UI]
    inline def createDefault(map: typings.heremaps.H.Map_, mapTypes: MapTypes, opt_locale: String): typings.heremaps.H.ui.UI = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefault")(map.asInstanceOf[js.Any], mapTypes.asInstanceOf[js.Any], opt_locale.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.ui.UI]
    inline def createDefault(map: typings.heremaps.H.Map_, mapTypes: MapTypes, opt_locale: Localization): typings.heremaps.H.ui.UI = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefault")(map.asInstanceOf[js.Any], mapTypes.asInstanceOf[js.Any], opt_locale.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.ui.UI]
  }
  
  /**
    * This enumeration holds the possible unit systems for the UI to display distances.
    */
  @JSGlobal("H.ui.UnitSystem")
  @js.native
  object UnitSystem extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heremaps.H.ui.UnitSystem & Double] = js.native
    
    /* 0 */ val IMPERIAL: typings.heremaps.H.ui.UnitSystem.IMPERIAL & Double = js.native
    
    /* 1 */ val METRIC: typings.heremaps.H.ui.UnitSystem.METRIC & Double = js.native
  }
  
  /**
    * This class represents the UI controls for zooming in an out of the map.
    */
  @JSGlobal("H.ui.ZoomControl")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.ui.ZoomControl.Options=} - optional parameters to be passed to the map.
    */
  open class ZoomControl ()
    extends StObject
       with typings.heremaps.H.ui.ZoomControl {
    def this(opt_options: typings.heremaps.H.ui.ZoomControl.Options) = this()
  }
  
  /**
    * This class represents a zoom rectangle control element that allows zooming to the selected area on the screen.
    */
  @JSGlobal("H.ui.ZoomRectangle")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.ui.ZoomRectangle.Options=} - optional parameters to be passed to this control
    */
  open class ZoomRectangle ()
    extends StObject
       with typings.heremaps.H.ui.Control {
    def this(opt_options: typings.heremaps.H.ui.ZoomRectangle.Options) = this()
  }
  
  /**
    * This namespace contains basic UI elements from which the UI controls are built.
    */
  object base {
    
    @JSGlobal("H.ui.base.Container")
    @js.native
    /**
      * Constructor
      * @param opt_elementType {string=} - the type of HTML element this UI element renders as, default is 'div'
      * @param opt_className {string=} - an optional class name to be used on this element
      * @param opt_children {Array<H.ui.base.Element>=} - optional child elements to be added to this container
      */
    open class Container ()
      extends StObject
         with typings.heremaps.H.ui.base.Container {
      def this(opt_elementType: String) = this()
      def this(opt_elementType: String, opt_className: String) = this()
      def this(opt_elementType: Unit, opt_className: String) = this()
      def this(
        opt_elementType: String,
        opt_className: String,
        opt_children: js.Array[typings.heremaps.H.ui.base.Element]
      ) = this()
      def this(
        opt_elementType: String,
        opt_className: Unit,
        opt_children: js.Array[typings.heremaps.H.ui.base.Element]
      ) = this()
      def this(
        opt_elementType: Unit,
        opt_className: String,
        opt_children: js.Array[typings.heremaps.H.ui.base.Element]
      ) = this()
      def this(
        opt_elementType: Unit,
        opt_className: Unit,
        opt_children: js.Array[typings.heremaps.H.ui.base.Element]
      ) = this()
    }
    
    @JSGlobal("H.ui.base.Element")
    @js.native
    /**
      * Constructor
      * @param opt_elementType {string=} - the type of HTML element this UI element renders as, default is 'div'
      * @param opt_className {string=} - an optional class name to be used on this element
      */
    open class Element ()
      extends StObject
         with typings.heremaps.H.ui.base.Element {
      def this(opt_elementType: String) = this()
      def this(opt_elementType: String, opt_className: String) = this()
      def this(opt_elementType: Unit, opt_className: String) = this()
    }
  }
  
  /**
    * Namespace contains functionality related to internationalization.
    */
  object i18n {
    
    /**
      * This class is used for internationalization of UI components.
      */
    @JSGlobal("H.ui.i18n.Localization")
    @js.native
    open class Localization protected ()
      extends StObject
         with typings.heremaps.H.ui.i18n.Localization {
      def this(locale: String) = this()
      def this(locale: String, opt_translationMap: Any) = this()
      
      /**
        * This method returns translation keys for current locale. Keys from this set can be used to get translations via translate method.
        * @returns {Array<string>}
        */
      /* CompleteClass */
      override def getKeys(): js.Array[String] = js.native
      
      /**
        * This method returns current locale code i.e 'en-US'
        * @returns {string} - locale code
        */
      /* CompleteClass */
      override def getLocale(): String = js.native
      
      /**
        * This method returns a boolean value indicating whether this localization object has a translation for the specified translation key.
        * @param key {string} - a translation key
        * @returns {boolean} - true if the key exists, otherwise false
        */
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /**
        * This method returns translation for provided key. It throws exception if translation is not available
        * @param key {string} - a translation key
        * @returns {string} - a localized string corresponding to provided key
        */
      /* CompleteClass */
      override def translate(key: String): String = js.native
    }
    
    /**
      * Default available locales. UI provides default translations for this set of locale codes.
      */
    @JSGlobal("H.ui.i18n.defaultLocales")
    @js.native
    val defaultLocales: js.Array[String] = js.native
  }
}
