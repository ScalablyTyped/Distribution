package typings.materialUiCore

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/test-utils", JSImport.Namespace)
@js.native
object testUtilsMod extends js.Object {
  def createMount(): NonePSnodeReactElementopt = js.native
  def createMount(options: PartialMountOptions): NonePSnodeReactElementopt = js.native
  def createRender(): Fn0 = js.native
  def createRender(options: PartialRenderOptions): Fn0 = js.native
  def createShallow(): Fn1 = js.native
  def createShallow(options: PartialShallowOptions): Fn1 = js.native
  def findOutermostIntrinsic(reactWrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]]): ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]] = js.native
  def getClasses[T](element: ReactElement): T = js.native
  def getClasses[T](element: ReactElement, options: PartialwithThemeboolean): T = js.native
  def unwrap(element: ReactElement): ReactElement = js.native
}

