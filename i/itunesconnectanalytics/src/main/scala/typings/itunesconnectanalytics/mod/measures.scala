package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait measures extends StObject
@JSImport("itunesconnectanalytics", "measures")
@js.native
object measures extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[measures & String] = js.native
  
  @js.native
  sealed trait activeDevices
    extends StObject
       with measures
  /* "activeDevices" */ val activeDevices: typings.itunesconnectanalytics.mod.measures.activeDevices & String = js.native
  
  @js.native
  sealed trait activeLast30days
    extends StObject
       with measures
  /* "rollingActiveDevices" */ val activeLast30days: typings.itunesconnectanalytics.mod.measures.activeLast30days & String = js.native
  
  @js.native
  sealed trait crashes
    extends StObject
       with measures
  /* "crashes" */ val crashes: typings.itunesconnectanalytics.mod.measures.crashes & String = js.native
  
  @js.native
  sealed trait iap
    extends StObject
       with measures
  /* "iap" */ val iap: typings.itunesconnectanalytics.mod.measures.iap & String = js.native
  
  @js.native
  sealed trait impressions
    extends StObject
       with measures
  /* "impressionsTotal" */ val impressions: typings.itunesconnectanalytics.mod.measures.impressions & String = js.native
  
  @js.native
  sealed trait impressionsUnique
    extends StObject
       with measures
  /* "impressionsTotalUnique" */ val impressionsUnique: typings.itunesconnectanalytics.mod.measures.impressionsUnique & String = js.native
  
  @js.native
  sealed trait installs
    extends StObject
       with measures
  /* "installs" */ val installs: typings.itunesconnectanalytics.mod.measures.installs & String = js.native
  
  @js.native
  sealed trait pageViewUnique
    extends StObject
       with measures
  /* "pageViewUnique" */ val pageViewUnique: typings.itunesconnectanalytics.mod.measures.pageViewUnique & String = js.native
  
  @js.native
  sealed trait pageViews
    extends StObject
       with measures
  /* "pageViewCount" */ val pageViews: typings.itunesconnectanalytics.mod.measures.pageViews & String = js.native
  
  @js.native
  sealed trait payingUsers
    extends StObject
       with measures
  /* "payingUsers" */ val payingUsers: typings.itunesconnectanalytics.mod.measures.payingUsers & String = js.native
  
  @js.native
  sealed trait sales
    extends StObject
       with measures
  /* "sales" */ val sales: typings.itunesconnectanalytics.mod.measures.sales & String = js.native
  
  @js.native
  sealed trait sessions
    extends StObject
       with measures
  /* "sessions" */ val sessions: typings.itunesconnectanalytics.mod.measures.sessions & String = js.native
  
  @js.native
  sealed trait uninstalls
    extends StObject
       with measures
  /* "uninstalls" */ val uninstalls: typings.itunesconnectanalytics.mod.measures.uninstalls & String = js.native
  
  @js.native
  sealed trait units
    extends StObject
       with measures
  /* "units" */ val units: typings.itunesconnectanalytics.mod.measures.units & String = js.native
}
