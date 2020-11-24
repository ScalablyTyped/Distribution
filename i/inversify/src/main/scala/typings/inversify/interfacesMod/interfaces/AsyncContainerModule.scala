package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncContainerModule extends js.Object {
  
  var id: Double = js.native
  
  def registry(bind: Bind, unbind: Unbind, isBound: IsBound, rebind: Rebind): js.Promise[Unit] = js.native
  @JSName("registry")
  var registry_Original: AsyncContainerModuleCallBack = js.native
}
