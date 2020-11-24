package typings.kosCore.mod

import typings.kosCore.anon.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kos extends js.Object {
  
  var Util: typings.kosCore.mod.Util = js.native
  
  def Wrapper(config: WrapperConfig): js.Function1[/* component */ ReactComponent[js.Any with KosProps[_], _], _] = js.native
  
  def getModel(namespace: String): KosModel[_] = js.native
  
  def registeModel(model: js.Any): Unit = js.native
  
  def removeModel(namespace: String): Unit = js.native
  
  def start(Layout: ReactComponent[_, _]): Unit = js.native
  def start(Layout: ReactComponent[_, _], container: String): Unit = js.native
  
  def use(middleware: js.Function1[/* api */ Dispatch, Unit]): Unit = js.native
}
