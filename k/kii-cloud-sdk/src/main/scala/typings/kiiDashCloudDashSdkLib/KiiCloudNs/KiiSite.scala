package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KiiSite extends js.Object

@JSGlobal("KiiCloud.KiiSite")
@js.native
object KiiSite extends js.Object {
  @js.native
  sealed trait CN
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSite
  
  @js.native
  sealed trait CN3
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSite
  
  @js.native
  sealed trait EU
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSite
  
  @js.native
  sealed trait JP
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSite
  
  @js.native
  sealed trait SG
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSite
  
  @js.native
  sealed trait US
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSite
  
  /* 2 */ val CN: CN with scala.Double = js.native
  /* 4 */ val CN3: CN3 with scala.Double = js.native
  /* 5 */ val EU: EU with scala.Double = js.native
  /* 1 */ val JP: JP with scala.Double = js.native
  /* 3 */ val SG: SG with scala.Double = js.native
  /* 0 */ val US: US with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[kiiDashCloudDashSdkLib.KiiCloudNs.KiiSite with scala.Double] = js.native
}

