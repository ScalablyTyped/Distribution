package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait measures extends StObject
@JSImport("itunesconnectanalytics", "measures")
@js.native
object measures extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[measures with String] = js.native
  
  @js.native
  sealed trait activeDevices extends measures
  /* "activeDevices" */ val activeDevices: typings.itunesconnectanalytics.mod.measures.activeDevices with String = js.native
  
  @js.native
  sealed trait activeLast30days extends measures
  /* "rollingActiveDevices" */ val activeLast30days: typings.itunesconnectanalytics.mod.measures.activeLast30days with String = js.native
  
  @js.native
  sealed trait crashes extends measures
  /* "crashes" */ val crashes: typings.itunesconnectanalytics.mod.measures.crashes with String = js.native
  
  @js.native
  sealed trait iap extends measures
  /* "iap" */ val iap: typings.itunesconnectanalytics.mod.measures.iap with String = js.native
  
  @js.native
  sealed trait impressions extends measures
  /* "impressionsTotal" */ val impressions: typings.itunesconnectanalytics.mod.measures.impressions with String = js.native
  
  @js.native
  sealed trait impressionsUnique extends measures
  /* "impressionsTotalUnique" */ val impressionsUnique: typings.itunesconnectanalytics.mod.measures.impressionsUnique with String = js.native
  
  @js.native
  sealed trait installs extends measures
  /* "installs" */ val installs: typings.itunesconnectanalytics.mod.measures.installs with String = js.native
  
  @js.native
  sealed trait pageViewUnique extends measures
  /* "pageViewUnique" */ val pageViewUnique: typings.itunesconnectanalytics.mod.measures.pageViewUnique with String = js.native
  
  @js.native
  sealed trait pageViews extends measures
  /* "pageViewCount" */ val pageViews: typings.itunesconnectanalytics.mod.measures.pageViews with String = js.native
  
  @js.native
  sealed trait payingUsers extends measures
  /* "payingUsers" */ val payingUsers: typings.itunesconnectanalytics.mod.measures.payingUsers with String = js.native
  
  @js.native
  sealed trait sales extends measures
  /* "sales" */ val sales: typings.itunesconnectanalytics.mod.measures.sales with String = js.native
  
  @js.native
  sealed trait sessions extends measures
  /* "sessions" */ val sessions: typings.itunesconnectanalytics.mod.measures.sessions with String = js.native
  
  @js.native
  sealed trait uninstalls extends measures
  /* "uninstalls" */ val uninstalls: typings.itunesconnectanalytics.mod.measures.uninstalls with String = js.native
  
  @js.native
  sealed trait units extends measures
  /* "units" */ val units: typings.itunesconnectanalytics.mod.measures.units with String = js.native
}
