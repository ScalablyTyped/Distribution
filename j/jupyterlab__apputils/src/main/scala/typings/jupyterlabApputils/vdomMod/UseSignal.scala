package typings.jupyterlabApputils.vdomMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils/lib/vdom", "UseSignal")
@js.native
class UseSignal[SENDER, ARGS] protected ()
  extends Component[IUseSignalProps[SENDER, ARGS], IUseSignalState[SENDER, ARGS], js.Any] {
  def this(props: IUseSignalProps[SENDER, ARGS]) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MUseSignal(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MUseSignal(): Unit = js.native
  
  var slot: js.Any = js.native
}
