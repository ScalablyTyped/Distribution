package typings.gulpDashJasmine.gulpDashJasmineMod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-jasmine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Executes Jasmine tests. Emits a 'jasmineDone' event on success.
    * @param options Optional options for the execution of the Jasmine test
    */
  def apply(): ReadWriteStream = js.native
  def apply(options: JasmineOptions): ReadWriteStream = js.native
}

