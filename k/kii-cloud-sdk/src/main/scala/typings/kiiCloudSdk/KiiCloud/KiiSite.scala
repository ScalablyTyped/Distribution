package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KiiSite with Double] = js.native
  /* 2 */ @js.native
  object CN extends TopLevel[CN with Double]
  
  /* 4 */ @js.native
  object CN3 extends TopLevel[CN3 with Double]
  
  /* 5 */ @js.native
  object EU extends TopLevel[EU with Double]
  
  /* 1 */ @js.native
  object JP extends TopLevel[JP with Double]
  
  /* 3 */ @js.native
  object SG extends TopLevel[SG with Double]
  
  /* 0 */ @js.native
  object US extends TopLevel[US with Double]
  
}

