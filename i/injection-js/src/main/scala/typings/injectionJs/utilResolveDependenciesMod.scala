package typings.injectionJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilResolveDependenciesMod {
  
  @JSImport("injection-js/util/resolve_dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveDependencies(inputs: Constructor*): js.Array[Constructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDependencies")(inputs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Constructor]]
  
  type Constructor = Instantiable1[/* args (repeated) */ Any, Any]
}
