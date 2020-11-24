package typings.iitc.entityDecodeMod.global

import typings.iitc.iitctypesMod.IITC.PortalData
import typings.iitc.iitctypesMod.IITC.PortalDataCore
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * decode the on-network array entity format into an object format closer to that used before
  * makes much more sense as an object, means that existing code didn't need to change, and it's what the
  * stock intel site does internally too (the array format is only on the network)
  */
@JSGlobal("DecodeArray")
@js.native
class DecodeArray_ () extends js.Object {
  
  def portalDetail(data: js.Array[_]): js.UndefOr[PortalDataDetail] = js.native
  
  def portalSummary(data: js.Array[_]): js.UndefOr[PortalData | PortalDataCore] = js.native
}
