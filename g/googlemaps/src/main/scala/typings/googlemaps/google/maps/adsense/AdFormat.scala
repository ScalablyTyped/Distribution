package typings.googlemaps.google.maps.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdFormat extends js.Object

@JSGlobal("google.maps.adsense.AdFormat")
@js.native
object AdFormat extends js.Object {
  @js.native
  sealed trait BANNER extends AdFormat
  
  @js.native
  sealed trait BUTTON extends AdFormat
  
  @js.native
  sealed trait HALF_BANNER extends AdFormat
  
  @js.native
  sealed trait LARGE_HORIZONTAL_LINK_UNIT extends AdFormat
  
  @js.native
  sealed trait LARGE_RECTANGLE extends AdFormat
  
  @js.native
  sealed trait LARGE_VERTICAL_LINK_UNIT extends AdFormat
  
  @js.native
  sealed trait LEADERBOARD extends AdFormat
  
  @js.native
  sealed trait MEDIUM_RECTANGLE extends AdFormat
  
  @js.native
  sealed trait MEDIUM_VERTICAL_LINK_UNIT extends AdFormat
  
  @js.native
  sealed trait SKYSCRAPER extends AdFormat
  
  @js.native
  sealed trait SMALL_HORIZONTAL_LINK_UNIT extends AdFormat
  
  @js.native
  sealed trait SMALL_RECTANGLE extends AdFormat
  
  @js.native
  sealed trait SMALL_SQUARE extends AdFormat
  
  @js.native
  sealed trait SMALL_VERTICAL_LINK_UNIT extends AdFormat
  
  @js.native
  sealed trait SQUARE extends AdFormat
  
  @js.native
  sealed trait VERTICAL_BANNER extends AdFormat
  
  @js.native
  sealed trait WIDE_SKYSCRAPER extends AdFormat
  
  @js.native
  sealed trait X_LARGE_VERTICAL_LINK_UNIT extends AdFormat
  
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
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AdFormat with String] = js.native
}

