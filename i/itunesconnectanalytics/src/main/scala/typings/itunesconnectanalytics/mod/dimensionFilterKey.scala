package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dimensionFilterKey extends StObject
@JSImport("itunesconnectanalytics", "dimensionFilterKey")
@js.native
object dimensionFilterKey extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimensionFilterKey & String] = js.native
  
  @js.native
  sealed trait appPurchaseWeek
    extends StObject
       with dimensionFilterKey
  /* "apppurchaseWeek" */ val appPurchaseWeek: typings.itunesconnectanalytics.mod.dimensionFilterKey.appPurchaseWeek & String = js.native
  
  @js.native
  sealed trait appVersion
    extends StObject
       with dimensionFilterKey
  /* "appVersion" */ val appVersion: typings.itunesconnectanalytics.mod.dimensionFilterKey.appVersion & String = js.native
  
  @js.native
  sealed trait apppurchaseDay
    extends StObject
       with dimensionFilterKey
  /* "apppurchaseDay" */ val apppurchaseDay: typings.itunesconnectanalytics.mod.dimensionFilterKey.apppurchaseDay & String = js.native
  
  @js.native
  sealed trait apppurchaseMonth
    extends StObject
       with dimensionFilterKey
  /* "apppurchaseMonth" */ val apppurchaseMonth: typings.itunesconnectanalytics.mod.dimensionFilterKey.apppurchaseMonth & String = js.native
  
  @js.native
  sealed trait campaigns
    extends StObject
       with dimensionFilterKey
  /* "campaignId" */ val campaigns: typings.itunesconnectanalytics.mod.dimensionFilterKey.campaigns & String = js.native
  
  @js.native
  sealed trait device
    extends StObject
       with dimensionFilterKey
  /* "platform" */ val device: typings.itunesconnectanalytics.mod.dimensionFilterKey.device & String = js.native
  
  @js.native
  sealed trait platformVersion
    extends StObject
       with dimensionFilterKey
  /* "platformVersion" */ val platformVersion: typings.itunesconnectanalytics.mod.dimensionFilterKey.platformVersion & String = js.native
  
  @js.native
  sealed trait region
    extends StObject
       with dimensionFilterKey
  /* "region" */ val region: typings.itunesconnectanalytics.mod.dimensionFilterKey.region & String = js.native
  
  @js.native
  sealed trait territory
    extends StObject
       with dimensionFilterKey
  /* "storefront" */ val territory: typings.itunesconnectanalytics.mod.dimensionFilterKey.territory & String = js.native
  
  @js.native
  sealed trait websites
    extends StObject
       with dimensionFilterKey
  /* "domainReferrer" */ val websites: typings.itunesconnectanalytics.mod.dimensionFilterKey.websites & String = js.native
}
