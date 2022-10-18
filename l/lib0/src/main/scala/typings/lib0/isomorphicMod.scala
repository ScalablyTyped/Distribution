package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isomorphicMod {
  
  @JSImport("lib0/isomorphic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `performance` is a global reference for `require('perf_hooks').performance`
    * https://nodejs.org/api/globals.html#performance
    * @since v16.0.0
    */
  @JSImport("lib0/isomorphic", "performance")
  @js.native
  def performance: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   performance :infer T} ? T : node.perf_hooks.Performance */ js.Any = js.native
  inline def performance_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   performance :infer T} ? T : node.perf_hooks.Performance */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("performance")(x.asInstanceOf[js.Any])
}
