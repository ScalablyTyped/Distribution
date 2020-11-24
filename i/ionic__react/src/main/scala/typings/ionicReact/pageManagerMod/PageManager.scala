package typings.ionicReact.pageManagerMod

import typings.ionicReact.ionLifeCycleContextMod.IonLifeCycleContextInterface
import typings.ionicReact.stackContextMod.StackContextState
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/routing/PageManager", "PageManager")
@js.native
class PageManager protected ()
  extends Component[PageManagerProps, js.Object, js.Any] {
  def this(props: PageManagerProps) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MPageManager(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPageManager(): Unit = js.native
  
  @JSName("context")
  var context_PageManager: ContextType[Context[StackContextState]] = js.native
  
  var ionLifeCycleContext: ContextType[Context[IonLifeCycleContextInterface]] = js.native
  
  var ionPageElementRef: RefObject[HTMLDivElement] = js.native
  
  def ionViewDidEnterHandler(): Unit = js.native
  
  def ionViewDidLeaveHandler(): Unit = js.native
  
  def ionViewWillEnterHandler(): Unit = js.native
  
  def ionViewWillLeaveHandler(): Unit = js.native
}
/* static members */
@JSImport("@ionic/react/dist/types/routing/PageManager", "PageManager")
@js.native
object PageManager extends js.Object {
  
  def contextType: Context[StackContextState] = js.native
}
