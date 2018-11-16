package typings
package localforageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// duplicating LocalForageDriverMethodsOptional to preserve TS v2.0 support,
// since Partial<> isn't supported there
@js.native
trait LocalForageDbMethodsOptional extends js.Object {
  @JSName("dropInstance")
  var dropInstance_Original: LocalForageDropInstanceFn = js.native
  def dropInstance(): stdLib.Promise[scala.Unit] = js.native
  def dropInstance(dbInstanceOptions: LocalForageDbInstanceOptions): stdLib.Promise[scala.Unit] = js.native
  def dropInstance(
    dbInstanceOptions: LocalForageDbInstanceOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): stdLib.Promise[scala.Unit] = js.native
}

