package typings.googlemaps.google.maps.adsense

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AdFormat with String] = js.native
  /* "468x60_as" */ @js.native
  object BANNER extends TopLevel[BANNER with String]
  
  /* "125x125_as" */ @js.native
  object BUTTON extends TopLevel[BUTTON with String]
  
  /* "234x60_as" */ @js.native
  object HALF_BANNER extends TopLevel[HALF_BANNER with String]
  
  /* "728x15_0ads_al" */ @js.native
  object LARGE_HORIZONTAL_LINK_UNIT extends TopLevel[LARGE_HORIZONTAL_LINK_UNIT with String]
  
  /* "336x280_as" */ @js.native
  object LARGE_RECTANGLE extends TopLevel[LARGE_RECTANGLE with String]
  
  /* "180x90_0ads_al" */ @js.native
  object LARGE_VERTICAL_LINK_UNIT extends TopLevel[LARGE_VERTICAL_LINK_UNIT with String]
  
  /* "728x90_as" */ @js.native
  object LEADERBOARD extends TopLevel[LEADERBOARD with String]
  
  /* "300x250_as" */ @js.native
  object MEDIUM_RECTANGLE extends TopLevel[MEDIUM_RECTANGLE with String]
  
  /* "160x90_0ads_al" */ @js.native
  object MEDIUM_VERTICAL_LINK_UNIT extends TopLevel[MEDIUM_VERTICAL_LINK_UNIT with String]
  
  /* "120x600_as" */ @js.native
  object SKYSCRAPER extends TopLevel[SKYSCRAPER with String]
  
  /* "468x15_0ads_al" */ @js.native
  object SMALL_HORIZONTAL_LINK_UNIT extends TopLevel[SMALL_HORIZONTAL_LINK_UNIT with String]
  
  /* "180x150_as" */ @js.native
  object SMALL_RECTANGLE extends TopLevel[SMALL_RECTANGLE with String]
  
  /* "200x200_as" */ @js.native
  object SMALL_SQUARE extends TopLevel[SMALL_SQUARE with String]
  
  /* "120x90_0ads_al" */ @js.native
  object SMALL_VERTICAL_LINK_UNIT extends TopLevel[SMALL_VERTICAL_LINK_UNIT with String]
  
  /* "250x250_as" */ @js.native
  object SQUARE extends TopLevel[SQUARE with String]
  
  /* "120x240_as" */ @js.native
  object VERTICAL_BANNER extends TopLevel[VERTICAL_BANNER with String]
  
  /* "160x600_as" */ @js.native
  object WIDE_SKYSCRAPER extends TopLevel[WIDE_SKYSCRAPER with String]
  
  /* "200x90_0ads_al" */ @js.native
  object X_LARGE_VERTICAL_LINK_UNIT extends TopLevel[X_LARGE_VERTICAL_LINK_UNIT with String]
  
}

