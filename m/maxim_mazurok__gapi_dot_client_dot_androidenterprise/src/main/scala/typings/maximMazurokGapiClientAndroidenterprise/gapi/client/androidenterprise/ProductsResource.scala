package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.AltCallback
import typings.maximMazurokGapiClientAndroidenterprise.anon.Approved
import typings.maximMazurokGapiClientAndroidenterprise.anon.CallbackEnterpriseId
import typings.maximMazurokGapiClientAndroidenterprise.anon.LanguageCode
import typings.maximMazurokGapiClientAndroidenterprise.anon.ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends js.Object {
  
  /**
    * Approves the specified product and the relevant app permissions, if any. The maximum number of products that you can approve per enterprise customer is 1,000. To learn how to use
    * managed Google Play to design and create a store layout to display approved products to your users, see Store Layout Design.
    */
  def approve(request: AltCallback): Request[Unit] = js.native
  def approve(request: ProductId, body: ProductsApproveRequest): Request[Unit] = js.native
  
  /**
    * Generates a URL that can be rendered in an iframe to display the permissions (if any) of a product. An enterprise admin must view these permissions and accept them on behalf of
    * their organization in order to approve that product. Admins should accept the displayed permissions by interacting with a separate UI element in the EMM console, which in turn
    * should trigger the use of this URL as the approvalUrlInfo.approvalUrl property in a Products.approve call to approve the product. This URL can only be used to display permissions
    * for up to 1 day.
    */
  def generateApprovalUrl(): Request[ProductsGenerateApprovalUrlResponse] = js.native
  def generateApprovalUrl(request: LanguageCode): Request[ProductsGenerateApprovalUrlResponse] = js.native
  
  /** Retrieves details of a product for display to an enterprise admin. */
  def get(): Request[Product] = js.native
  def get(request: CallbackEnterpriseId): Request[Product] = js.native
  
  /**
    * Retrieves the schema that defines the configurable properties for this product. All products have a schema, but this schema may be empty if no managed configurations have been
    * defined. This schema can be used to populate a UI that allows an admin to configure the product. To apply a managed configuration based on the schema obtained using this API, see
    * Managed Configurations through Play.
    */
  def getAppRestrictionsSchema(): Request[AppRestrictionsSchema] = js.native
  def getAppRestrictionsSchema(request: CallbackEnterpriseId): Request[AppRestrictionsSchema] = js.native
  
  /** Retrieves the Android app permissions required by this app. */
  def getPermissions(): Request[ProductPermissions] = js.native
  def getPermissions(request: ProductId): Request[ProductPermissions] = js.native
  
  /** Finds approved products that match a query, or all approved products if there is no query. */
  def list(): Request[ProductsListResponse] = js.native
  def list(request: Approved): Request[ProductsListResponse] = js.native
  
  /** Unapproves the specified product (and the relevant app permissions, if any) */
  def unapprove(): Request[Unit] = js.native
  def unapprove(request: ProductId): Request[Unit] = js.native
}
