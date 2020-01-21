package typings.jupyterlabApputils.vdomMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/vdom", "UseSignal")
@js.native
class UseSignal[SENDER, ARGS] protected ()
  extends Component[IUseSignalProps[SENDER, ARGS], IUseSignalState[SENDER, ARGS], js.Any] {
  def this(props: IUseSignalProps[SENDER, ARGS]) = this()
  var slot: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MUseSignal(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MUseSignal(): Unit = js.native
}

