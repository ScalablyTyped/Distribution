package typings.kurentoClient.mod

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constructor extends StObject {
  
  def apply(ws_uri: String): js.Promise[ClientInstance] = js.native
  def apply(ws_uri: String, options: Options): js.Promise[ClientInstance] = js.native
  
  @JSName("getComplexType")
  def getComplexType_IceCandidate(complex: typings.kurentoClient.kurentoClientStrings.IceCandidate): js.Function1[/* value */ Any, Any] = js.native
  
  def getSingleton(ws_uri: String): js.Promise[ClientInstance] = js.native
  def getSingleton(ws_uri: String, options: Options): js.Promise[ClientInstance] = js.native
  
  var on: Unit = js.native
  
  def register(module: String): Unit = js.native
  def register(
    module: ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequire */ Any
    ]
  ): Unit = js.native
}
