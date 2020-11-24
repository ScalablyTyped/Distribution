package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// duplicating LocalForageDriverMethodsOptional to preserve TS v2.0 support,
// since Partial<> isn't supported there
@js.native
trait LocalForageDbMethodsOptional extends js.Object {
  
  def dropInstance(): js.Promise[Unit] = js.native
  def dropInstance(dbInstanceOptions: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def dropInstance(dbInstanceOptions: LocalForageDbInstanceOptions): js.Promise[Unit] = js.native
  def dropInstance(dbInstanceOptions: LocalForageDbInstanceOptions, callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  @JSName("dropInstance")
  var dropInstance_Original: LocalForageDropInstanceFn = js.native
}
