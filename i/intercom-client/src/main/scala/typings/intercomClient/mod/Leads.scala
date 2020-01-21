package typings.intercomClient.mod

import typings.intercomClient.AnonContact
import typings.intercomClient.AnonEmailSegmentid
import typings.intercomClient.leadMod.Lead
import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.leadMod.List
import typings.intercomClient.userMod.UserIdentifier
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Leads")
@js.native
class Leads () extends js.Object {
  def convert(params: AnonContact): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: AnonContact, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def create(lead: Partial[Lead]): js.Promise[ApiResponse[Lead]] = js.native
  def create(lead: Partial[Lead], cb: callback[ApiResponse[Lead]]): Unit = js.native
  def delete(id: String): js.Promise[ApiResponse[Lead]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def find(identifier: LeadIdentifier): js.Promise[ApiResponse[Lead]] = js.native
  def find(identifier: LeadIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: AnonEmailSegmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: AnonEmailSegmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(lead: UserIdentifier with Partial[Lead]): js.Promise[ApiResponse[Lead]] = js.native
  def update(lead: UserIdentifier with Partial[Lead], cb: callback[ApiResponse[Lead]]): Unit = js.native
}

