package typings.intercomDashClient.intercomDashClientMod

import typings.intercomDashClient.Anon_Contact
import typings.intercomDashClient.Anon_Email
import typings.intercomDashClient.leadMod.Lead
import typings.intercomDashClient.leadMod.LeadIdentifier
import typings.intercomDashClient.leadMod.List
import typings.intercomDashClient.userMod.UserIdentifier
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Leads")
@js.native
class Leads () extends js.Object {
  def convert(params: Anon_Contact): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: Anon_Contact, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def create(lead: Partial[Lead]): js.Promise[ApiResponse[Lead]] = js.native
  def create(lead: Partial[Lead], cb: callback[ApiResponse[Lead]]): Unit = js.native
  def delete(id: String): js.Promise[ApiResponse[Lead]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def find(identifier: LeadIdentifier): js.Promise[ApiResponse[Lead]] = js.native
  def find(identifier: LeadIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: Anon_Email): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Anon_Email, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(lead: UserIdentifier with Partial[Lead]): js.Promise[ApiResponse[Lead]] = js.native
  def update(lead: UserIdentifier with Partial[Lead], cb: callback[ApiResponse[Lead]]): Unit = js.native
}

