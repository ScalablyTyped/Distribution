package typings.instagramPrivateApi

import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.userLookupOptionsMod.UserLookupOptions
import typings.instagramPrivateApi.userRepositoryInfoResponseMod.UserRepositoryInfoResponseUser
import typings.instagramPrivateApi.userRepositorySearchResponseMod.UserRepositorySearchResponseRootObject
import typings.instagramPrivateApi.userRepositorySearchResponseMod.UserRepositorySearchResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/user.repository", JSImport.Namespace)
@js.native
object userRepositoryMod extends js.Object {
  @js.native
  class UserRepository () extends Repository {
    def accountDetails(): js.Promise[_] = js.native
    def accountDetails(id: String): js.Promise[_] = js.native
    def accountDetails(id: Double): js.Promise[_] = js.native
    def arlinkDownloadInfo(): js.Promise[_] = js.native
    def flagUser(id: String): js.Promise[_] = js.native
    def flagUser(id: Double): js.Promise[_] = js.native
    def formerUsernames(): js.Promise[_] = js.native
    def formerUsernames(id: String): js.Promise[_] = js.native
    def formerUsernames(id: Double): js.Promise[_] = js.native
    def getIdByUsername(username: String): js.Promise[Double] = js.native
    def info(id: String): js.Promise[UserRepositoryInfoResponseUser] = js.native
    def info(id: Double): js.Promise[UserRepositoryInfoResponseUser] = js.native
    def lookup(options: UserLookupOptions): js.Promise[_] = js.native
    def search(username: String): js.Promise[UserRepositorySearchResponseRootObject] = js.native
    def searchExact(username: String): js.Promise[UserRepositorySearchResponseUsersItem] = js.native
    def sharedFollowerAccounts(id: String): js.Promise[_] = js.native
    def sharedFollowerAccounts(id: Double): js.Promise[_] = js.native
  }
  
}

