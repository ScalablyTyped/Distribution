package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.adsense.AdUnitOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
object adsense {
  
  @JSGlobal("google.maps.adsense.AdFormat")
  @js.native
  object AdFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.adsense.AdFormat with String] = js.native
    
    /* "468x60_as" */ val BANNER: typings.googlemaps.google.maps.adsense.AdFormat.BANNER with String = js.native
    
    /* "125x125_as" */ val BUTTON: typings.googlemaps.google.maps.adsense.AdFormat.BUTTON with String = js.native
    
    /* "234x60_as" */ val HALF_BANNER: typings.googlemaps.google.maps.adsense.AdFormat.HALF_BANNER with String = js.native
    
    /* "728x15_0ads_al" */ val LARGE_HORIZONTAL_LINK_UNIT: typings.googlemaps.google.maps.adsense.AdFormat.LARGE_HORIZONTAL_LINK_UNIT with String = js.native
    
    /* "336x280_as" */ val LARGE_RECTANGLE: typings.googlemaps.google.maps.adsense.AdFormat.LARGE_RECTANGLE with String = js.native
    
    /* "180x90_0ads_al" */ val LARGE_VERTICAL_LINK_UNIT: typings.googlemaps.google.maps.adsense.AdFormat.LARGE_VERTICAL_LINK_UNIT with String = js.native
    
    /* "728x90_as" */ val LEADERBOARD: typings.googlemaps.google.maps.adsense.AdFormat.LEADERBOARD with String = js.native
    
    /* "300x250_as" */ val MEDIUM_RECTANGLE: typings.googlemaps.google.maps.adsense.AdFormat.MEDIUM_RECTANGLE with String = js.native
    
    /* "160x90_0ads_al" */ val MEDIUM_VERTICAL_LINK_UNIT: typings.googlemaps.google.maps.adsense.AdFormat.MEDIUM_VERTICAL_LINK_UNIT with String = js.native
    
    /* "120x600_as" */ val SKYSCRAPER: typings.googlemaps.google.maps.adsense.AdFormat.SKYSCRAPER with String = js.native
    
    /* "468x15_0ads_al" */ val SMALL_HORIZONTAL_LINK_UNIT: typings.googlemaps.google.maps.adsense.AdFormat.SMALL_HORIZONTAL_LINK_UNIT with String = js.native
    
    /* "180x150_as" */ val SMALL_RECTANGLE: typings.googlemaps.google.maps.adsense.AdFormat.SMALL_RECTANGLE with String = js.native
    
    /* "200x200_as" */ val SMALL_SQUARE: typings.googlemaps.google.maps.adsense.AdFormat.SMALL_SQUARE with String = js.native
    
    /* "120x90_0ads_al" */ val SMALL_VERTICAL_LINK_UNIT: typings.googlemaps.google.maps.adsense.AdFormat.SMALL_VERTICAL_LINK_UNIT with String = js.native
    
    /* "250x250_as" */ val SQUARE: typings.googlemaps.google.maps.adsense.AdFormat.SQUARE with String = js.native
    
    /* "120x240_as" */ val VERTICAL_BANNER: typings.googlemaps.google.maps.adsense.AdFormat.VERTICAL_BANNER with String = js.native
    
    /* "160x600_as" */ val WIDE_SKYSCRAPER: typings.googlemaps.google.maps.adsense.AdFormat.WIDE_SKYSCRAPER with String = js.native
    
    /* "200x90_0ads_al" */ val X_LARGE_VERTICAL_LINK_UNIT: typings.googlemaps.google.maps.adsense.AdFormat.X_LARGE_VERTICAL_LINK_UNIT with String = js.native
  }
  
  @JSGlobal("google.maps.adsense.AdUnit")
  @js.native
  class AdUnit protected ()
    extends typings.googlemaps.google.maps.adsense.AdUnit {
    def this(container: Element, opts: AdUnitOptions) = this()
  }
}
