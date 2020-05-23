package typings.intercomClient.mod

import typings.intercomClient.anon.IdNumber
import typings.intercomClient.anon.PartialCreateUpdateUser
import typings.intercomClient.anon.Segmentid
import typings.intercomClient.scrollMod.Scroll
import typings.intercomClient.userMod.List
import typings.intercomClient.userMod.User
import typings.intercomClient.userMod.UserEmailIdentifier
import typings.intercomClient.userMod.UserIdIdentifier
import typings.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Users")
@js.native
class Users () extends js.Object {
  var scroll: Scroll[User] = js.native
  def archive(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
  def archive(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  def create(user: PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
  def create(user: PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
  def find(identifier: UserEmailIdentifier): js.Promise[ApiResponse[List]] = js.native
  def find(identifier: UserEmailIdentifier, cb: callback[ApiResponse[List]]): Unit = js.native
  def find(identifier: UserIdIdentifier): js.Promise[ApiResponse[User]] = js.native
  def find(identifier: UserIdIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  def find(identifier: UserIdentifier): js.Promise[ApiResponse[User | List]] = js.native
  def find(identifier: UserIdentifier, cb: callback[ApiResponse[User | List]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: Segmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Segmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def requestPermanentDeletion(id: String): js.Promise[IdNumber] = js.native
  def requestPermanentDeletion(id: String, cb: callback[IdNumber]): Unit = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier): js.Promise[IdNumber] = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier, cb: callback[IdNumber]): Unit = js.native
  def update(user: UserIdentifier with PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
  def update(user: UserIdentifier with PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
}

