package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.OnoError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isomorphicNodeMod {
  
  @JSImport("@jsdevtools/ono/esm/isomorphic.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addInspectMethod[T](newError: OnoError[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addInspectMethod")(newError.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@jsdevtools/ono/esm/isomorphic.node", "format")
  @js.native
  val format: js.Function2[/* format */ js.Any, /* repeated */ js.Any, String] = js.native
}
