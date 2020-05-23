package typings.materialUiCore

import typings.enzyme.mod.ReactWrapper
import typings.materialUiCore.anon.Fn0
import typings.materialUiCore.anon.Fn1
import typings.materialUiCore.anon.NonePSnodeReactElementopt
import typings.materialUiCore.anon.PartialMountOptions
import typings.materialUiCore.anon.PartialRenderOptions
import typings.materialUiCore.anon.PartialShallowOptions
import typings.materialUiCore.anon.PartialwithThemeboolean
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

