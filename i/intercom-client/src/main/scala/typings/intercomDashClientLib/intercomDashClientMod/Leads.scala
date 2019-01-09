package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Leads")
@js.native
class Leads () extends js.Object {
  def convert(params: intercomDashClientLib.Anon_Contact): js.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def convert(
    params: intercomDashClientLib.Anon_Contact,
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]
  ): scala.Unit = js.native
  def create(lead: stdLib.Partial[intercomDashClientLib.leadMod.Lead]): js.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def create(
    lead: stdLib.Partial[intercomDashClientLib.leadMod.Lead],
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]
  ): scala.Unit = js.native
  def delete(id: java.lang.String): js.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def delete(id: java.lang.String, cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]): scala.Unit = js.native
  def find(identifier: intercomDashClientLib.leadMod.LeadIdentifier): js.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def find(
    identifier: intercomDashClientLib.leadMod.LeadIdentifier,
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]
  ): scala.Unit = js.native
  def list(): js.Promise[ApiResponse[intercomDashClientLib.leadMod.List]] = js.native
  def list(cb: callback[ApiResponse[intercomDashClientLib.leadMod.List]]): scala.Unit = js.native
  def listBy(params: intercomDashClientLib.Anon_EmailSegmentid): js.Promise[ApiResponse[intercomDashClientLib.leadMod.List]] = js.native
  def listBy(
    params: intercomDashClientLib.Anon_EmailSegmentid,
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.List]]
  ): scala.Unit = js.native
  def update(
    lead: intercomDashClientLib.userMod.UserIdentifier with stdLib.Partial[intercomDashClientLib.leadMod.Lead]
  ): js.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def update(
    lead: intercomDashClientLib.userMod.UserIdentifier with stdLib.Partial[intercomDashClientLib.leadMod.Lead],
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]
  ): scala.Unit = js.native
}

