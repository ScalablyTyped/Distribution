package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait measures extends js.Object
@JSImport("itunesconnectanalytics", "measures")
@js.native
object measures extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[measures with String] = js.native
  
  @js.native
  sealed trait activeDevices extends measures
  /* "activeDevices" */ @js.native
  object activeDevices extends TopLevel[activeDevices with String]
  
  @js.native
  sealed trait activeLast30days extends measures
  /* "rollingActiveDevices" */ @js.native
  object activeLast30days extends TopLevel[activeLast30days with String]
  
  @js.native
  sealed trait crashes extends measures
  /* "crashes" */ @js.native
  object crashes extends TopLevel[crashes with String]
  
  @js.native
  sealed trait iap extends measures
  /* "iap" */ @js.native
  object iap extends TopLevel[iap with String]
  
  @js.native
  sealed trait impressions extends measures
  /* "impressionsTotal" */ @js.native
  object impressions extends TopLevel[impressions with String]
  
  @js.native
  sealed trait impressionsUnique extends measures
  /* "impressionsTotalUnique" */ @js.native
  object impressionsUnique extends TopLevel[impressionsUnique with String]
  
  @js.native
  sealed trait installs extends measures
  /* "installs" */ @js.native
  object installs extends TopLevel[installs with String]
  
  @js.native
  sealed trait pageViewUnique extends measures
  /* "pageViewUnique" */ @js.native
  object pageViewUnique extends TopLevel[pageViewUnique with String]
  
  @js.native
  sealed trait pageViews extends measures
  /* "pageViewCount" */ @js.native
  object pageViews extends TopLevel[pageViews with String]
  
  @js.native
  sealed trait payingUsers extends measures
  /* "payingUsers" */ @js.native
  object payingUsers extends TopLevel[payingUsers with String]
  
  @js.native
  sealed trait sales extends measures
  /* "sales" */ @js.native
  object sales extends TopLevel[sales with String]
  
  @js.native
  sealed trait sessions extends measures
  /* "sessions" */ @js.native
  object sessions extends TopLevel[sessions with String]
  
  @js.native
  sealed trait uninstalls extends measures
  /* "uninstalls" */ @js.native
  object uninstalls extends TopLevel[uninstalls with String]
  
  @js.native
  sealed trait units extends measures
  /* "units" */ @js.native
  object units extends TopLevel[units with String]
}
