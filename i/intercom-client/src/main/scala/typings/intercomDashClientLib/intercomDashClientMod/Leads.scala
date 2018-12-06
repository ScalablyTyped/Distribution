package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Leads")
@js.native
class Leads () extends js.Object {
  def convert(params: intercomDashClientLib.Anon_Contact): stdLib.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def convert(
    params: intercomDashClientLib.Anon_Contact,
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]
  ): scala.Unit = js.native
  def create(lead: stdLib.Partial[intercomDashClientLib.leadMod.Lead]): stdLib.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def create(
    lead: stdLib.Partial[intercomDashClientLib.leadMod.Lead],
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]
  ): scala.Unit = js.native
  def delete(id: java.lang.String): stdLib.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def delete(id: java.lang.String, cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]): scala.Unit = js.native
  def find(identifier: intercomDashClientLib.leadMod.LeadIdentifier): stdLib.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def find(
    identifier: intercomDashClientLib.leadMod.LeadIdentifier,
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]
  ): scala.Unit = js.native
  def list(): stdLib.Promise[ApiResponse[intercomDashClientLib.leadMod.List]] = js.native
  def list(cb: callback[ApiResponse[intercomDashClientLib.leadMod.List]]): scala.Unit = js.native
  def listBy(params: intercomDashClientLib.Anon_SegmentidTagid): stdLib.Promise[ApiResponse[intercomDashClientLib.leadMod.List]] = js.native
  def listBy(
    params: intercomDashClientLib.Anon_SegmentidTagid,
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.List]]
  ): scala.Unit = js.native
  def update(
    lead: intercomDashClientLib.userMod.UserIdentifier with stdLib.Partial[intercomDashClientLib.leadMod.Lead]
  ): stdLib.Promise[ApiResponse[intercomDashClientLib.leadMod.Lead]] = js.native
  def update(
    lead: intercomDashClientLib.userMod.UserIdentifier with stdLib.Partial[intercomDashClientLib.leadMod.Lead],
    cb: callback[ApiResponse[intercomDashClientLib.leadMod.Lead]]
  ): scala.Unit = js.native
}

