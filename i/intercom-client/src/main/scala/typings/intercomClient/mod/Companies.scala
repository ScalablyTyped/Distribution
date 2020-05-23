package typings.intercomClient.mod

import typings.intercomClient.anon.PartialCompany
import typings.intercomClient.anon.Segmentid
import typings.intercomClient.companyMod.Company
import typings.intercomClient.companyMod.CompanyIdentifier
import typings.intercomClient.companyMod.List
import typings.intercomClient.scrollMod.Scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Companies")
@js.native
class Companies () extends js.Object {
  var scroll: Scroll[Company] = js.native
  def archive(): js.Promise[Company] = js.native
  def create(company: CompanyIdentifier with PartialCompany): js.Promise[ApiResponse[Company]] = js.native
  def create(company: CompanyIdentifier with PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
  def find(identifier: CompanyIdentifier): js.Promise[ApiResponse[Company]] = js.native
  def find(identifier: CompanyIdentifier, cb: callback[ApiResponse[Company]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: Segmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Segmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(company: CompanyIdentifier with PartialCompany): js.Promise[ApiResponse[Company]] = js.native
  def update(company: CompanyIdentifier with PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
}

