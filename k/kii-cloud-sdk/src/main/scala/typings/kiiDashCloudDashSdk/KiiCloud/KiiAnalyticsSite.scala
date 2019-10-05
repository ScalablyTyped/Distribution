package typings.kiiDashCloudDashSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KiiAnalyticsSite extends js.Object

@JSGlobal("KiiCloud.KiiAnalyticsSite")
@js.native
object KiiAnalyticsSite extends js.Object {
  @js.native
  sealed trait CN extends KiiAnalyticsSite
  
  @js.native
  sealed trait CN3 extends KiiAnalyticsSite
  
  @js.native
  sealed trait EU extends KiiAnalyticsSite
  
  @js.native
  sealed trait JP extends KiiAnalyticsSite
  
  @js.native
  sealed trait SG extends KiiAnalyticsSite
  
  @js.native
  sealed trait US extends KiiAnalyticsSite
  
  /* 2 */ val CN: typings.kiiDashCloudDashSdk.KiiCloud.KiiAnalyticsSite.CN with Double = js.native
  /* 4 */ val CN3: typings.kiiDashCloudDashSdk.KiiCloud.KiiAnalyticsSite.CN3 with Double = js.native
  /* 5 */ val EU: typings.kiiDashCloudDashSdk.KiiCloud.KiiAnalyticsSite.EU with Double = js.native
  /* 1 */ val JP: typings.kiiDashCloudDashSdk.KiiCloud.KiiAnalyticsSite.JP with Double = js.native
  /* 3 */ val SG: typings.kiiDashCloudDashSdk.KiiCloud.KiiAnalyticsSite.SG with Double = js.native
  /* 0 */ val US: typings.kiiDashCloudDashSdk.KiiCloud.KiiAnalyticsSite.US with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KiiAnalyticsSite with Double] = js.native
}

