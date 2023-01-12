package typings.lernaRunTopologically

import typings.lernaPackage.mod.Package
import typings.lernaQueryGraph.mod.QueryGraphConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lerna/run-topologically", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runTopologically[T](packages: js.Array[Package], runner: js.Function1[/* pkg */ Package, js.Promise[T]]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTopologically")(packages.asInstanceOf[js.Any], runner.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def runTopologically[T](
    packages: js.Array[Package],
    runner: js.Function1[/* pkg */ Package, js.Promise[T]],
    options: TopologicalConfig
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTopologically")(packages.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  trait TopologicalConfig
    extends StObject
       with QueryGraphConfig {
    
    var concurrency: Double
  }
  object TopologicalConfig {
    
    inline def apply(concurrency: Double): TopologicalConfig = {
      val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopologicalConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TopologicalConfig] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    }
  }
}
