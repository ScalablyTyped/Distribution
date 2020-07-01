package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor extends js.Object {
  def apply(ws_uri: String): js.Promise[ClientInstance] = js.native
  def apply(ws_uri: String, options: Options): js.Promise[ClientInstance] = js.native
  @JSName("getComplexType")
  def getComplexType_IceCandidate(complex: typings.kurentoClient.kurentoClientStrings.IceCandidate): js.Function1[/* value */ js.Any, _] = js.native
  def getSingleton(ws_uri: String): js.Promise[ClientInstance] = js.native
  def getSingleton(ws_uri: String, options: Options): js.Promise[ClientInstance] = js.native
}

