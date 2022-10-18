package typings.ipfsCoreUtils

import org.scalablytyped.runtime.Instantiable0
import typings.node.httpMod.Agent
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAgentMod {
  
  @JSImport("ipfs-core-utils/dist/src/agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Instantiable0[Agent] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Instantiable0[Agent]]
  inline def default(url: URL): Instantiable0[Agent] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[Instantiable0[Agent]]
}
