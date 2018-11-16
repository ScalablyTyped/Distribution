package typings
package kosDashCoreLib.kosDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kos extends js.Object {
  var Util: Util = js.native
  def Wrapper(config: WrapperConfig): js.Function1[/* component */ kosDashCoreLib.ReactComponent[js.Any with KosProps[_], _], _] = js.native
  def getModel(namespace: java.lang.String): KosModel[_] = js.native
  def registeModel(model: js.Any): scala.Unit = js.native
  def removeModel(namespace: java.lang.String): scala.Unit = js.native
  def start(Layout: kosDashCoreLib.ReactComponent[_, _]): scala.Unit = js.native
  def start(Layout: kosDashCoreLib.ReactComponent[_, _], container: java.lang.String): scala.Unit = js.native
  def use(middleware: js.Function1[/* api */ kosDashCoreLib.Anon_Dispatch, scala.Unit]): scala.Unit = js.native
}

