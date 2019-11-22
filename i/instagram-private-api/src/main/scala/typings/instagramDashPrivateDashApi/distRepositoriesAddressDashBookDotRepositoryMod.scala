package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesAddressDashBookDotRepositoryDotLinkDotResponseMod.AddressBookRepositoryLinkResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/address-book.repository", JSImport.Namespace)
@js.native
object distRepositoriesAddressDashBookDotRepositoryMod extends js.Object {
  @js.native
  class AddressBookRepository () extends Repository {
    def acquireOwnerContacts(me: Anon_EmailaddressesFirstname): js.Promise[StatusResponse] = js.native
    def link(contacts: js.Array[Anon_Emailaddresses]): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
    def link(contacts: js.Array[Anon_Emailaddresses], module: IgAppModule): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
  }
  
}

