package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait measures extends js.Object

@JSImport("itunesconnectanalytics", "measures")
@js.native
object measures extends js.Object {
  @js.native
  sealed trait activeDevices extends measures
  
  @js.native
  sealed trait activeLast30days extends measures
  
  @js.native
  sealed trait crashes extends measures
  
  @js.native
  sealed trait iap extends measures
  
  @js.native
  sealed trait impressions extends measures
  
  @js.native
  sealed trait impressionsUnique extends measures
  
  @js.native
  sealed trait installs extends measures
  
  @js.native
  sealed trait pageViewUnique extends measures
  
  @js.native
  sealed trait pageViews extends measures
  
  @js.native
  sealed trait payingUsers extends measures
  
  @js.native
  sealed trait sales extends measures
  
  @js.native
  sealed trait sessions extends measures
  
  @js.native
  sealed trait uninstalls extends measures
  
  @js.native
  sealed trait units extends measures
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[measures with String] = js.native
  /* "activeDevices" */ @js.native
  object activeDevices extends TopLevel[activeDevices with String]
  
  /* "rollingActiveDevices" */ @js.native
  object activeLast30days extends TopLevel[activeLast30days with String]
  
  /* "crashes" */ @js.native
  object crashes extends TopLevel[crashes with String]
  
  /* "iap" */ @js.native
  object iap extends TopLevel[iap with String]
  
  /* "impressionsTotal" */ @js.native
  object impressions extends TopLevel[impressions with String]
  
  /* "impressionsTotalUnique" */ @js.native
  object impressionsUnique extends TopLevel[impressionsUnique with String]
  
  /* "installs" */ @js.native
  object installs extends TopLevel[installs with String]
  
  /* "pageViewUnique" */ @js.native
  object pageViewUnique extends TopLevel[pageViewUnique with String]
  
  /* "pageViewCount" */ @js.native
  object pageViews extends TopLevel[pageViews with String]
  
  /* "payingUsers" */ @js.native
  object payingUsers extends TopLevel[payingUsers with String]
  
  /* "sales" */ @js.native
  object sales extends TopLevel[sales with String]
  
  /* "sessions" */ @js.native
  object sessions extends TopLevel[sessions with String]
  
  /* "uninstalls" */ @js.native
  object uninstalls extends TopLevel[uninstalls with String]
  
  /* "units" */ @js.native
  object units extends TopLevel[units with String]
  
}

