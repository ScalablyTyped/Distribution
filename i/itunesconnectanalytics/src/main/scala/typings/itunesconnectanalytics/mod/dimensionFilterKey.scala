package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait dimensionFilterKey extends js.Object

@JSImport("itunesconnectanalytics", "dimensionFilterKey")
@js.native
object dimensionFilterKey extends js.Object {
  @js.native
  sealed trait appPurchaseWeek extends dimensionFilterKey
  
  @js.native
  sealed trait appVersion extends dimensionFilterKey
  
  @js.native
  sealed trait apppurchaseDay extends dimensionFilterKey
  
  @js.native
  sealed trait apppurchaseMonth extends dimensionFilterKey
  
  @js.native
  sealed trait campaigns extends dimensionFilterKey
  
  @js.native
  sealed trait device extends dimensionFilterKey
  
  @js.native
  sealed trait platformVersion extends dimensionFilterKey
  
  @js.native
  sealed trait region extends dimensionFilterKey
  
  @js.native
  sealed trait territory extends dimensionFilterKey
  
  @js.native
  sealed trait websites extends dimensionFilterKey
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimensionFilterKey with String] = js.native
  /* "apppurchaseWeek" */ @js.native
  object appPurchaseWeek extends TopLevel[appPurchaseWeek with String]
  
  /* "appVersion" */ @js.native
  object appVersion extends TopLevel[appVersion with String]
  
  /* "apppurchaseDay" */ @js.native
  object apppurchaseDay extends TopLevel[apppurchaseDay with String]
  
  /* "apppurchaseMonth" */ @js.native
  object apppurchaseMonth extends TopLevel[apppurchaseMonth with String]
  
  /* "campaignId" */ @js.native
  object campaigns extends TopLevel[campaigns with String]
  
  /* "platform" */ @js.native
  object device extends TopLevel[device with String]
  
  /* "platformVersion" */ @js.native
  object platformVersion extends TopLevel[platformVersion with String]
  
  /* "region" */ @js.native
  object region
    extends TopLevel[typings.itunesconnectanalytics.mod.dimensionFilterKey.region with String]
  
  /* "storefront" */ @js.native
  object territory
    extends TopLevel[typings.itunesconnectanalytics.mod.dimensionFilterKey.territory with String]
  
  /* "domainReferrer" */ @js.native
  object websites extends TopLevel[websites with String]
  
}

