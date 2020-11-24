package typings.intercomClient.mod

import typings.intercomClient.anon.Contact
import typings.intercomClient.anon.Email
import typings.intercomClient.anon.PartialLead
import typings.intercomClient.leadMod.Lead
import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.leadMod.List
import typings.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intercom-client", "Leads")
@js.native
class Leads () extends js.Object {
  
  def convert(params: Contact): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: Contact, cb: callback[ApiResponse[Lead]]): Unit = js.native
  
  def create(lead: PartialLead): js.Promise[ApiResponse[Lead]] = js.native
  def create(lead: PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
  
  def delete(id: String): js.Promise[ApiResponse[Lead]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Lead]]): Unit = js.native
  
  def find(identifier: LeadIdentifier): js.Promise[ApiResponse[Lead]] = js.native
  def find(identifier: LeadIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  
  def listBy(params: Email): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Email, cb: callback[ApiResponse[List]]): Unit = js.native
  
  def update(lead: UserIdentifier with PartialLead): js.Promise[ApiResponse[Lead]] = js.native
  def update(lead: UserIdentifier with PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
}
