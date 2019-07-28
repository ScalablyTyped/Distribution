package typings.intercomDashClient.intercomDashClientMod

import typings.intercomDashClient.Anon_Segmentid
import typings.intercomDashClient.companyMod.Company
import typings.intercomDashClient.companyMod.CompanyIdentifier
import typings.intercomDashClient.companyMod.List
import typings.intercomDashClient.scrollMod.Scroll
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Companies")
@js.native
class Companies () extends js.Object {
  var scroll: Scroll[Company] = js.native
  def archive(): js.Promise[Company] = js.native
  def create(company: CompanyIdentifier with Partial[Company]): js.Promise[ApiResponse[Company]] = js.native
  def create(company: CompanyIdentifier with Partial[Company], cb: callback[ApiResponse[Company]]): Unit = js.native
  def find(identifier: CompanyIdentifier): js.Promise[ApiResponse[Company]] = js.native
  def find(identifier: CompanyIdentifier, cb: callback[ApiResponse[Company]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: Anon_Segmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Anon_Segmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(company: CompanyIdentifier with Partial[Company]): js.Promise[ApiResponse[Company]] = js.native
  def update(company: CompanyIdentifier with Partial[Company], cb: callback[ApiResponse[Company]]): Unit = js.native
}

