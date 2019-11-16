package typings.jestDashJasmine2.buildJasmineSpecMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/Spec", JSImport.Default)
@js.native
class default protected () extends Spec {
  def this(attrs: Attributes) = this()
}

/* static members */
@JSImport("jest-jasmine2/build/jasmine/Spec", JSImport.Default)
@js.native
object default extends js.Object {
  var pendingSpecExceptionMessage: String = js.native
  def isPendingSpecException(e: Error): Boolean = js.native
}

