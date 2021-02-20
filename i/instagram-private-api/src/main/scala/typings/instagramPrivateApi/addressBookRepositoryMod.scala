package typings.instagramPrivateApi

import typings.instagramPrivateApi.addressBookRepositoryLinkResponseMod.AddressBookRepositoryLinkResponseRootObject
import typings.instagramPrivateApi.anon.Emailaddresses
import typings.instagramPrivateApi.anon.Firstname
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressBookRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/address-book.repository", "AddressBookRepository")
  @js.native
  class AddressBookRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def acquireOwnerContacts(me: Firstname): js.Promise[StatusResponse] = js.native
    
    def link(contacts: js.Array[Emailaddresses]): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
    def link(contacts: js.Array[Emailaddresses], module: IgAppModule): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
  }
}
