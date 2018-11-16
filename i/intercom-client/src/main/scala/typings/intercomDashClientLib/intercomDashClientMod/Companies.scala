package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Companies")
@js.native
class Companies () extends js.Object {
  var scroll: intercomDashClientLib.scrollMod.Scroll[intercomDashClientLib.companyMod.Company] = js.native
  def archive(): stdLib.Promise[intercomDashClientLib.companyMod.Company] = js.native
  def create(
    company: intercomDashClientLib.companyMod.CompanyIdentifier with stdLib.Partial[intercomDashClientLib.companyMod.Company]
  ): stdLib.Promise[ApiResponse[intercomDashClientLib.companyMod.Company]] = js.native
  def create(
    company: intercomDashClientLib.companyMod.CompanyIdentifier with stdLib.Partial[intercomDashClientLib.companyMod.Company],
    cb: callback[ApiResponse[intercomDashClientLib.companyMod.Company]]
  ): scala.Unit = js.native
  def find(identifier: intercomDashClientLib.companyMod.CompanyIdentifier): stdLib.Promise[ApiResponse[intercomDashClientLib.companyMod.Company]] = js.native
  def find(
    identifier: intercomDashClientLib.companyMod.CompanyIdentifier,
    cb: callback[ApiResponse[intercomDashClientLib.companyMod.Company]]
  ): scala.Unit = js.native
  def list(): stdLib.Promise[ApiResponse[intercomDashClientLib.companyMod.List]] = js.native
  def list(cb: callback[ApiResponse[intercomDashClientLib.companyMod.List]]): scala.Unit = js.native
  def listBy(params: intercomDashClientLib.Anon_Segmentid): stdLib.Promise[ApiResponse[intercomDashClientLib.companyMod.List]] = js.native
  def listBy(
    params: intercomDashClientLib.Anon_Segmentid,
    cb: callback[ApiResponse[intercomDashClientLib.companyMod.List]]
  ): scala.Unit = js.native
  def update(
    company: intercomDashClientLib.companyMod.CompanyIdentifier with stdLib.Partial[intercomDashClientLib.companyMod.Company]
  ): stdLib.Promise[ApiResponse[intercomDashClientLib.companyMod.Company]] = js.native
  def update(
    company: intercomDashClientLib.companyMod.CompanyIdentifier with stdLib.Partial[intercomDashClientLib.companyMod.Company],
    cb: callback[ApiResponse[intercomDashClientLib.companyMod.Company]]
  ): scala.Unit = js.native
}

