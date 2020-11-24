package typings.iitc.portalDetailMod.global

import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import typings.jquery.JQuery.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PortalDetail")
@js.native
class PortalDetail_ () extends js.Object {
  
  /** Get portal detail from cache */
  def get(guid: String): js.UndefOr[PortalDataDetail] = js.native
  
  /** Get portal detail from cache */
  def isFresh(guid: String): js.UndefOr[Boolean] = js.native
  
  /**
    * Request Portal details from server
    * NB: you shouldn't use it.
    */
  def request(guid: String): Promise[_, _, _] = js.native
  
  def setup(): Unit = js.native
}
