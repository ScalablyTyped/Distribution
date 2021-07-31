package typings.instagramPrivateApi

import typings.instagramPrivateApi.accountEditProfileOptionsMod.AccountEditProfileOptions
import typings.instagramPrivateApi.accountRepositoryCurrentUserResponseMod.AccountRepositoryCurrentUserResponseRootObject
import typings.instagramPrivateApi.accountRepositoryCurrentUserResponseMod.AccountRepositoryCurrentUserResponseUser
import typings.instagramPrivateApi.accountRepositoryLoginResponseMod.AccountRepositoryLoginResponseLoggedInUser
import typings.instagramPrivateApi.accountTwoFactorLoginOptionsMod.AccountTwoFactorLoginOptions
import typings.instagramPrivateApi.anon.Email
import typings.instagramPrivateApi.anon.Encrypted
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/account.repository", "AccountRepository")
  @js.native
  class AccountRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def changePassword(oldPassword: String, newPassword: String): js.Promise[js.Any] = js.native
    
    def changeProfilePicture(picture: Buffer): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    
    var command: js.Any = js.native
    
    def contactPointPrefill(): js.Promise[js.Any] = js.native
    def contactPointPrefill(usage: String): js.Promise[js.Any] = js.native
    
    def create(hasUsernamePasswordEmailFirst_name: Email): js.Promise[js.Any] = js.native
    
    def currentUser(): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    
    def editProfile(options: AccountEditProfileOptions): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    
    def encryptPassword(password: String): Encrypted = js.native
    
    def getPrefillCandidates(): js.Promise[js.Any] = js.native
    
    def login(username: String, password: String): js.Promise[AccountRepositoryLoginResponseLoggedInUser] = js.native
    
    def logout(): js.Promise[StatusResponse] = js.native
    
    def msisdnHeaderBootstrap(): js.Promise[js.Any] = js.native
    def msisdnHeaderBootstrap(usage: String): js.Promise[js.Any] = js.native
    
    def processContactPointSignals(): js.Promise[js.Any] = js.native
    
    def readMsisdnHeader(): js.Promise[js.Any] = js.native
    def readMsisdnHeader(usage: String): js.Promise[js.Any] = js.native
    
    def removeProfilePicture(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    
    def sendRecoveryFlowEmail(query: String): js.Promise[js.Any] = js.native
    
    def setBiography(text: String): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    
    def setPrivate(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    
    def setPublic(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    
    def twoFactorLogin(options: AccountTwoFactorLoginOptions): js.Promise[AccountRepositoryLoginResponseLoggedInUser] = js.native
  }
  /* static members */
  object AccountRepository {
    
    @JSImport("instagram-private-api/dist/repositories/account.repository", "AccountRepository")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("instagram-private-api/dist/repositories/account.repository", "AccountRepository.accountDebug")
    @js.native
    def accountDebug: js.Any = js.native
    @scala.inline
    def accountDebug_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accountDebug")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def createJazoest(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createJazoest")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
