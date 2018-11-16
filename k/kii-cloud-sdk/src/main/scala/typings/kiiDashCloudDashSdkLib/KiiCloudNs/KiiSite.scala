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
  
  val CN: CN with java.lang.String = js.native
  val CN3: CN3 with java.lang.String = js.native
  val EU: EU with java.lang.String = js.native
  val JP: JP with java.lang.String = js.native
  val SG: SG with java.lang.String = js.native
  val US: US with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[kiiDashCloudDashSdkLib.KiiCloudNs.KiiSite with java.lang.String] = js.native
}

