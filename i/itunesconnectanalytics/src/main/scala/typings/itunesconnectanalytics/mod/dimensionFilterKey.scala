package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dimensionFilterKey extends js.Object
@JSImport("itunesconnectanalytics", "dimensionFilterKey")
@js.native
object dimensionFilterKey extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimensionFilterKey with String] = js.native
  
  @js.native
  sealed trait appPurchaseWeek extends dimensionFilterKey
  /* "apppurchaseWeek" */ @js.native
  object appPurchaseWeek extends TopLevel[appPurchaseWeek with String]
  
  @js.native
  sealed trait appVersion extends dimensionFilterKey
  /* "appVersion" */ @js.native
  object appVersion extends TopLevel[appVersion with String]
  
  @js.native
  sealed trait apppurchaseDay extends dimensionFilterKey
  /* "apppurchaseDay" */ @js.native
  object apppurchaseDay extends TopLevel[apppurchaseDay with String]
  
  @js.native
  sealed trait apppurchaseMonth extends dimensionFilterKey
  /* "apppurchaseMonth" */ @js.native
  object apppurchaseMonth extends TopLevel[apppurchaseMonth with String]
  
  @js.native
  sealed trait campaigns extends dimensionFilterKey
  /* "campaignId" */ @js.native
  object campaigns extends TopLevel[campaigns with String]
  
  @js.native
  sealed trait device extends dimensionFilterKey
  /* "platform" */ @js.native
  object device extends TopLevel[device with String]
  
  @js.native
  sealed trait platformVersion extends dimensionFilterKey
  /* "platformVersion" */ @js.native
  object platformVersion extends TopLevel[platformVersion with String]
  
  @js.native
  sealed trait region extends dimensionFilterKey
  /* "region" */ @js.native
  object region
    extends TopLevel[typings.itunesconnectanalytics.mod.dimensionFilterKey.region with String]
  
  @js.native
  sealed trait territory extends dimensionFilterKey
  /* "storefront" */ @js.native
  object territory
    extends TopLevel[typings.itunesconnectanalytics.mod.dimensionFilterKey.territory with String]
  
  @js.native
  sealed trait websites extends dimensionFilterKey
  /* "domainReferrer" */ @js.native
  object websites extends TopLevel[websites with String]
}
