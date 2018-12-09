package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Tags")
@js.native
class Tags () extends js.Object {
  def create(tag: stdLib.Partial[intercomDashClientLib.tagMod.Tag]): js.Promise[ApiResponse[intercomDashClientLib.tagMod.Tag]] = js.native
  def create(
    tag: stdLib.Partial[intercomDashClientLib.tagMod.Tag],
    cb: callback[ApiResponse[intercomDashClientLib.tagMod.Tag]]
  ): scala.Unit = js.native
  def delete(tag: intercomDashClientLib.tagMod.TagIdentifier): js.Promise[nodeLib.httpMod.IncomingMessage] = js.native
  def delete(tag: intercomDashClientLib.tagMod.TagIdentifier, cb: callback[nodeLib.httpMod.IncomingMessage]): scala.Unit = js.native
  def list(): js.Promise[ApiResponse[intercomDashClientLib.tagMod.List]] = js.native
  def list(cb: callback[ApiResponse[intercomDashClientLib.tagMod.List]]): scala.Unit = js.native
  def tag(tagOper: intercomDashClientLib.tagMod.TagOper): js.Promise[ApiResponse[intercomDashClientLib.tagMod.Tag]] = js.native
  def tag(
    tagOper: intercomDashClientLib.tagMod.TagOper,
    cb: callback[ApiResponse[intercomDashClientLib.tagMod.Tag]]
  ): scala.Unit = js.native
  def untag(tagOper: intercomDashClientLib.tagMod.TagOper): js.Promise[ApiResponse[intercomDashClientLib.tagMod.Tag]] = js.native
  def untag(
    tagOper: intercomDashClientLib.tagMod.TagOper,
    cb: callback[ApiResponse[intercomDashClientLib.tagMod.Tag]]
  ): scala.Unit = js.native
}

