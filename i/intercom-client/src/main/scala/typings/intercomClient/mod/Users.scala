package typings.intercomClient.mod

import typings.intercomClient.AnonIdNumber
import typings.intercomClient.AnonSegmentid
import typings.intercomClient.scrollMod.Scroll
import typings.intercomClient.userMod.CreateUpdateUser
import typings.intercomClient.userMod.List
import typings.intercomClient.userMod.User
import typings.intercomClient.userMod.UserIdentifier
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Users")
@js.native
class Users () extends js.Object {
  var scroll: Scroll[User] = js.native
  def archive(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
  def archive(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  def create(user: Partial[CreateUpdateUser]): js.Promise[ApiResponse[User]] = js.native
  def create(user: Partial[CreateUpdateUser], cb: callback[ApiResponse[User]]): Unit = js.native
  def find(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
  def find(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: AnonSegmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: AnonSegmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def requestPermanentDeletion(id: String): js.Promise[AnonIdNumber] = js.native
  def requestPermanentDeletion(id: String, cb: callback[AnonIdNumber]): Unit = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier): js.Promise[AnonIdNumber] = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier, cb: callback[AnonIdNumber]): Unit = js.native
  def update(user: UserIdentifier with Partial[CreateUpdateUser]): js.Promise[ApiResponse[User]] = js.native
  def update(user: UserIdentifier with Partial[CreateUpdateUser], cb: callback[ApiResponse[User]]): Unit = js.native
}

