package typings.intercomClient.mod

import typings.intercomClient.anon.Identifier
import typings.intercomClient.anon.PartialVisitor
import typings.intercomClient.anon.Type
import typings.intercomClient.leadMod.Lead
import typings.intercomClient.userMod.User
import typings.intercomClient.visitorMod.Visitor
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Visitors")
@js.native
class Visitors () extends js.Object {
  def convert(params: Identifier): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: Identifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def convert(params: Type): js.Promise[ApiResponse[User]] = js.native
  def convert(params: Type, cb: callback[ApiResponse[User]]): Unit = js.native
  def delete(id: String): js.Promise[ApiResponse[Visitor]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Visitor]]): Unit = js.native
  def find(identifier: VisitorIdentifier): js.Promise[ApiResponse[Visitor]] = js.native
  def find(identifier: VisitorIdentifier, cb: callback[ApiResponse[Visitor]]): Unit = js.native
  def update(visitor: VisitorIdentifier with PartialVisitor): js.Promise[ApiResponse[Visitor]] = js.native
  def update(visitor: VisitorIdentifier with PartialVisitor, cb: callback[ApiResponse[Visitor]]): Unit = js.native
}

