package typings
package lassoLib.libLassoContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LassoContext
  extends nodeLib.eventsMod.EventEmitter {
  var LassoContext: scala.Boolean = js.native
  var basePath: js.UndefOr[java.lang.String] = js.native
  var cache: js.Any = js.native
  var config: js.Any = js.native
  var contentType: js.UndefOr[java.lang.String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dependencyRegistry: lassoLib.libDependenciesMod.DependencyRegistry = js.native
  var flags: js.Array[_] = js.native
  var lasso: lassoLib.libLassoMod.default = js.native
  var options: js.Any = js.native
  var writer: lassoLib.libWritersMod.Writer = js.native
}

