package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dimension extends StObject
@JSImport("itunesconnectanalytics", "dimension")
@js.native
object dimension extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimension & String] = js.native
  
  @js.native
  sealed trait appVersion
    extends StObject
       with dimension
  /* "appVersion" */ val appVersion: typings.itunesconnectanalytics.mod.dimension.appVersion & String = js.native
  
  @js.native
  sealed trait apps
    extends StObject
       with dimension
  /* "appReferrer" */ val apps: typings.itunesconnectanalytics.mod.dimension.apps & String = js.native
  
  @js.native
  sealed trait campaigns
    extends StObject
       with dimension
  /* "campaignId" */ val campaigns: typings.itunesconnectanalytics.mod.dimension.campaigns & String = js.native
  
  @js.native
  sealed trait device
    extends StObject
       with dimension
  /* "platform" */ val device: typings.itunesconnectanalytics.mod.dimension.device & String = js.native
  
  @js.native
  sealed trait platformVersion
    extends StObject
       with dimension
  /* "platformVersion" */ val platformVersion: typings.itunesconnectanalytics.mod.dimension.platformVersion & String = js.native
  
  @js.native
  sealed trait region
    extends StObject
       with dimension
  /* "region" */ val region: typings.itunesconnectanalytics.mod.dimension.region & String = js.native
  
  @js.native
  sealed trait sourceType
    extends StObject
       with dimension
  /* "source" */ val sourceType: typings.itunesconnectanalytics.mod.dimension.sourceType & String = js.native
  
  @js.native
  sealed trait territory
    extends StObject
       with dimension
  /* "storefront" */ val territory: typings.itunesconnectanalytics.mod.dimension.territory & String = js.native
  
  @js.native
  sealed trait websites
    extends StObject
       with dimension
  /* "domainReferrer" */ val websites: typings.itunesconnectanalytics.mod.dimension.websites & String = js.native
}
