package typings.kiiDashCloudDashSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KiiSite extends js.Object

@JSGlobal("KiiCloud.KiiSite")
@js.native
object KiiSite extends js.Object {
  @js.native
  sealed trait CN extends KiiSite
  
  @js.native
  sealed trait CN3 extends KiiSite
  
  @js.native
  sealed trait EU extends KiiSite
  
  @js.native
  sealed trait JP extends KiiSite
  
  @js.native
  sealed trait SG extends KiiSite
  
  @js.native
  sealed trait US extends KiiSite
  
  /* 2 */ val CN: typings.kiiDashCloudDashSdk.KiiCloud.KiiSite.CN with Double = js.native
  /* 4 */ val CN3: typings.kiiDashCloudDashSdk.KiiCloud.KiiSite.CN3 with Double = js.native
  /* 5 */ val EU: typings.kiiDashCloudDashSdk.KiiCloud.KiiSite.EU with Double = js.native
  /* 1 */ val JP: typings.kiiDashCloudDashSdk.KiiCloud.KiiSite.JP with Double = js.native
  /* 3 */ val SG: typings.kiiDashCloudDashSdk.KiiCloud.KiiSite.SG with Double = js.native
  /* 0 */ val US: typings.kiiDashCloudDashSdk.KiiCloud.KiiSite.US with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KiiSite with Double] = js.native
}

