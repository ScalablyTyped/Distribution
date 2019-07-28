package typings.kosDashCore.kosDashCoreMod

import typings.kosDashCore.Anon_Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kos extends js.Object {
  var Util: typings.kosDashCore.kosDashCoreMod.Util = js.native
  def Wrapper(config: WrapperConfig): js.Function1[/* component */ ReactComponent[js.Any with KosProps[_], _], _] = js.native
  def getModel(namespace: String): KosModel[_] = js.native
  def registeModel(model: js.Any): Unit = js.native
  def removeModel(namespace: String): Unit = js.native
  def start(Layout: ReactComponent[_, _]): Unit = js.native
  def start(Layout: ReactComponent[_, _], container: String): Unit = js.native
  def use(middleware: js.Function1[/* api */ Anon_Dispatch, Unit]): Unit = js.native
}

