package typings.ibmCloudSdkCore

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLibStreamToPromiseMod {
  
  @JSImport("ibm-cloud-sdk-core/es/lib/stream-to-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def streamToPromise(stream: Stream): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToPromise")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
