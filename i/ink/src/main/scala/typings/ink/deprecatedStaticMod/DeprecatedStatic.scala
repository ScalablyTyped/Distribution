package typings.ink.deprecatedStaticMod

import typings.ink.anon.Children
import typings.ink.stylesMod.Styles
import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ink/build/components/DeprecatedStatic", "DeprecatedStatic")
@js.native
class DeprecatedStatic ()
  extends Component[Styles, State, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MDeprecatedStatic(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDeprecatedStatic(_prevProps: Styles, prevState: State): Unit = js.native
  
  def saveLastIndex(children: ReactNode): Unit = js.native
}
/* static members */
@JSImport("ink/build/components/DeprecatedStatic", "DeprecatedStatic")
@js.native
object DeprecatedStatic extends js.Object {
  
  var propTypes: Children = js.native
}
