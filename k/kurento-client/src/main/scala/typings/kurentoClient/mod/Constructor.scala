package typings.kurentoClient.mod

import typings.node.NodeRequire
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constructor extends StObject {
  
  def apply(ws_uri: String): js.Promise[ClientInstance] = js.native
  def apply(ws_uri: String, options: Options): js.Promise[ClientInstance] = js.native
  
  @JSName("getComplexType")
  def getComplexType_IceCandidate(complex: typings.kurentoClient.kurentoClientStrings.IceCandidate): js.Function1[/* value */ js.Any, _] = js.native
  
  def getSingleton(ws_uri: String): js.Promise[ClientInstance] = js.native
  def getSingleton(ws_uri: String, options: Options): js.Promise[ClientInstance] = js.native
  
  var on: js.UndefOr[scala.Nothing] = js.native
  
  def register(module: String): Unit = js.native
  def register(module: ReturnType[NodeRequire]): Unit = js.native
}
