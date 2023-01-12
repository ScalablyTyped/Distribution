package typings.justifiedgallery

import org.scalablytyped.runtime.NumberDictionary
import typings.jquery.JQuery.Event
import typings.jquery.JQueryStatic
import typings.justifiedgallery.justifiedgalleryBooleans.`false`
import typings.justifiedgallery.justifiedgalleryStrings.center
import typings.justifiedgallery.justifiedgalleryStrings.hide
import typings.justifiedgallery.justifiedgalleryStrings.justify
import typings.justifiedgallery.justifiedgalleryStrings.left
import typings.justifiedgallery.justifiedgalleryStrings.nojustify
import typings.justifiedgallery.justifiedgalleryStrings.right
import typings.justifiedgallery.mod.JustifiedGallery.Settings
import typings.justifiedgallery.mod.global.JQuery
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(root: Window): JQueryStatic | JQuery[HTMLElement] | HTMLElement = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[JQueryStatic | JQuery[HTMLElement] | HTMLElement]
  inline def apply(root: Window, jQuery: JQueryStatic): JQueryStatic | JQuery[HTMLElement] | HTMLElement = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], jQuery.asInstanceOf[js.Any])).asInstanceOf[JQueryStatic | JQuery[HTMLElement] | HTMLElement]
  
  @JSImport("justifiedgallery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object JustifiedGallery {
    
    trait CaptionSettings extends StObject {
      
      var animationDuration: js.UndefOr[Double] = js.undefined
      
      var nonVisibleOpacity: js.UndefOr[Double] = js.undefined
      
      var visibleOpacity: js.UndefOr[Double] = js.undefined
    }
    object CaptionSettings {
      
      inline def apply(): CaptionSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CaptionSettings]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CaptionSettings] (val x: Self) extends AnyVal {
        
        inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
        
        inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
        
        inline def setNonVisibleOpacity(value: Double): Self = StObject.set(x, "nonVisibleOpacity", value.asInstanceOf[js.Any])
        
        inline def setNonVisibleOpacityUndefined: Self = StObject.set(x, "nonVisibleOpacity", js.undefined)
        
        inline def setVisibleOpacity(value: Double): Self = StObject.set(x, "visibleOpacity", value.asInstanceOf[js.Any])
        
        inline def setVisibleOpacityUndefined: Self = StObject.set(x, "visibleOpacity", js.undefined)
      }
    }
    
    trait Settings extends StObject {
      
      var border: js.UndefOr[Double] = js.undefined
      
      var captionSettings: js.UndefOr[CaptionSettings] = js.undefined
      
      var captions: js.UndefOr[Boolean] = js.undefined
      
      var cssAnimation: js.UndefOr[Boolean] = js.undefined
      
      var `extension`: js.UndefOr[js.RegExp] = js.undefined
      
      var filter: js.UndefOr[
            `false` | String | (js.Function3[
              /* value */ HTMLElement, 
              /* index */ Double, 
              /* array */ js.Array[HTMLElement], 
              Boolean
            ])
          ] = js.undefined
      
      var imagesAnimationDuration: js.UndefOr[Double] = js.undefined
      
      var imgSelector: js.UndefOr[String] = js.undefined
      
      var justifyThreshold: js.UndefOr[Double] = js.undefined
      
      var lastRow: js.UndefOr[justify | nojustify | left | right | center | hide] = js.undefined
      
      var margins: js.UndefOr[Double] = js.undefined
      
      var maxRowHeight: js.UndefOr[`false` | Double | String] = js.undefined
      
      var maxRowsCount: js.UndefOr[Double] = js.undefined
      
      var randomize: js.UndefOr[Boolean] = js.undefined
      
      var refreshSensitivity: js.UndefOr[Double] = js.undefined
      
      var refreshTime: js.UndefOr[Double] = js.undefined
      
      var rel: js.UndefOr[String | Null] = js.undefined
      
      var rowHeight: js.UndefOr[Double] = js.undefined
      
      var rtl: js.UndefOr[Boolean] = js.undefined
      
      var selector: js.UndefOr[String] = js.undefined
      
      var sizeRangeSuffixes: js.UndefOr[NumberDictionary[String]] = js.undefined
      
      var sort: js.UndefOr[`false` | (js.Function2[/* a */ Any, /* b */ Any, Double])] = js.undefined
      
      var target: js.UndefOr[String | Null] = js.undefined
      
      var thumbnailPath: js.UndefOr[
            js.Function4[
              /* imageSrc */ String, 
              /* imgWidth */ Double, 
              /* imgHeight */ Double, 
              /* image */ JQuery[HTMLElement], 
              String
            ]
          ] = js.undefined
      
      var triggerEvent: js.UndefOr[js.Function1[/* event */ String | Event, Unit]] = js.undefined
      
      var waitThumbnailsLoad: js.UndefOr[Boolean] = js.undefined
    }
    object Settings {
      
      inline def apply(): Settings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Settings]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
        
        inline def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
        
        inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
        
        inline def setCaptionSettings(value: CaptionSettings): Self = StObject.set(x, "captionSettings", value.asInstanceOf[js.Any])
        
        inline def setCaptionSettingsUndefined: Self = StObject.set(x, "captionSettings", js.undefined)
        
        inline def setCaptions(value: Boolean): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
        
        inline def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
        
        inline def setCssAnimation(value: Boolean): Self = StObject.set(x, "cssAnimation", value.asInstanceOf[js.Any])
        
        inline def setCssAnimationUndefined: Self = StObject.set(x, "cssAnimation", js.undefined)
        
        inline def setExtension(value: js.RegExp): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
        
        inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
        
        inline def setFilter(
          value: `false` | String | (js.Function3[
                  /* value */ HTMLElement, 
                  /* index */ Double, 
                  /* array */ js.Array[HTMLElement], 
                  Boolean
                ])
        ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterFunction3(value: (/* value */ HTMLElement, /* index */ Double, /* array */ js.Array[HTMLElement]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setImagesAnimationDuration(value: Double): Self = StObject.set(x, "imagesAnimationDuration", value.asInstanceOf[js.Any])
        
        inline def setImagesAnimationDurationUndefined: Self = StObject.set(x, "imagesAnimationDuration", js.undefined)
        
        inline def setImgSelector(value: String): Self = StObject.set(x, "imgSelector", value.asInstanceOf[js.Any])
        
        inline def setImgSelectorUndefined: Self = StObject.set(x, "imgSelector", js.undefined)
        
        inline def setJustifyThreshold(value: Double): Self = StObject.set(x, "justifyThreshold", value.asInstanceOf[js.Any])
        
        inline def setJustifyThresholdUndefined: Self = StObject.set(x, "justifyThreshold", js.undefined)
        
        inline def setLastRow(value: justify | nojustify | left | right | center | hide): Self = StObject.set(x, "lastRow", value.asInstanceOf[js.Any])
        
        inline def setLastRowUndefined: Self = StObject.set(x, "lastRow", js.undefined)
        
        inline def setMargins(value: Double): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
        
        inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
        
        inline def setMaxRowHeight(value: `false` | Double | String): Self = StObject.set(x, "maxRowHeight", value.asInstanceOf[js.Any])
        
        inline def setMaxRowHeightUndefined: Self = StObject.set(x, "maxRowHeight", js.undefined)
        
        inline def setMaxRowsCount(value: Double): Self = StObject.set(x, "maxRowsCount", value.asInstanceOf[js.Any])
        
        inline def setMaxRowsCountUndefined: Self = StObject.set(x, "maxRowsCount", js.undefined)
        
        inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
        
        inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
        
        inline def setRefreshSensitivity(value: Double): Self = StObject.set(x, "refreshSensitivity", value.asInstanceOf[js.Any])
        
        inline def setRefreshSensitivityUndefined: Self = StObject.set(x, "refreshSensitivity", js.undefined)
        
        inline def setRefreshTime(value: Double): Self = StObject.set(x, "refreshTime", value.asInstanceOf[js.Any])
        
        inline def setRefreshTimeUndefined: Self = StObject.set(x, "refreshTime", js.undefined)
        
        inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
        
        inline def setRelNull: Self = StObject.set(x, "rel", null)
        
        inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
        
        inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
        
        inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
        
        inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
        
        inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setSizeRangeSuffixes(value: NumberDictionary[String]): Self = StObject.set(x, "sizeRangeSuffixes", value.asInstanceOf[js.Any])
        
        inline def setSizeRangeSuffixesUndefined: Self = StObject.set(x, "sizeRangeSuffixes", js.undefined)
        
        inline def setSort(value: `false` | (js.Function2[/* a */ Any, /* b */ Any, Double])): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        inline def setSortFunction2(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
        
        inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetNull: Self = StObject.set(x, "target", null)
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setThumbnailPath(
          value: (/* imageSrc */ String, /* imgWidth */ Double, /* imgHeight */ Double, /* image */ JQuery[HTMLElement]) => String
        ): Self = StObject.set(x, "thumbnailPath", js.Any.fromFunction4(value))
        
        inline def setThumbnailPathUndefined: Self = StObject.set(x, "thumbnailPath", js.undefined)
        
        inline def setTriggerEvent(value: /* event */ String | Event => Unit): Self = StObject.set(x, "triggerEvent", js.Any.fromFunction1(value))
        
        inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
        
        inline def setWaitThumbnailsLoad(value: Boolean): Self = StObject.set(x, "waitThumbnailsLoad", value.asInstanceOf[js.Any])
        
        inline def setWaitThumbnailsLoadUndefined: Self = StObject.set(x, "waitThumbnailsLoad", js.undefined)
      }
    }
  }
  
  object global {
    
    @js.native
    trait JQuery[TElement] extends StObject {
      
      def justifiedGallery(): JQuery[HTMLElement] = js.native
      def justifiedGallery(settings: Settings): JQuery[HTMLElement] = js.native
    }
  }
}
