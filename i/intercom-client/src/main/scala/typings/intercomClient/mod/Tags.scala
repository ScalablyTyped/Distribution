package typings.intercomClient.mod

import typings.intercomClient.tagMod.List
import typings.intercomClient.tagMod.Tag
import typings.intercomClient.tagMod.TagIdentifier
import typings.intercomClient.tagMod.TagOper
import typings.node.httpMod.IncomingMessage
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Tags")
@js.native
class Tags () extends js.Object {
  def create(tag: Partial[Tag]): js.Promise[ApiResponse[Tag]] = js.native
  def create(tag: Partial[Tag], cb: callback[ApiResponse[Tag]]): Unit = js.native
  def delete(tag: TagIdentifier): js.Promise[IncomingMessage] = js.native
  def delete(tag: TagIdentifier, cb: callback[IncomingMessage]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def tag(tagOper: TagOper): js.Promise[ApiResponse[Tag]] = js.native
  def tag(tagOper: TagOper, cb: callback[ApiResponse[Tag]]): Unit = js.native
  def untag(tagOper: TagOper): js.Promise[ApiResponse[Tag]] = js.native
  def untag(tagOper: TagOper, cb: callback[ApiResponse[Tag]]): Unit = js.native
}

