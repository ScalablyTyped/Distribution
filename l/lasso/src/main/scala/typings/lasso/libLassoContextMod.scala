package typings.lasso

import typings.lasso.libDependenciesMod.DependencyRegistry
import typings.lasso.libLassoContextMod.LassoContext
import typings.lasso.libWritersMod.Writer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/lib/LassoContext", JSImport.Namespace)
@js.native
object libLassoContextMod extends js.Object {
  @js.native
  trait LassoContext extends EventEmitter {
    var LassoContext: Boolean = js.native
    var basePath: js.UndefOr[String] = js.native
    var cache: js.Any = js.native
    var config: js.Any = js.native
    var contentType: js.UndefOr[String] = js.native
    var data: js.UndefOr[js.Any] = js.native
    var dependencyRegistry: DependencyRegistry = js.native
    var flags: js.Array[_] = js.native
    var lasso: typings.lasso.libLassoMod.default = js.native
    var options: js.Any = js.native
    @JSName("writer")
    var writer_Original: Writer = js.native
    def writer(impl: js.Any): typings.lasso.libWritersWriterMod.Writer = js.native
  }
  
  @js.native
  class default () extends LassoContext
  
}

