package typings.materialUiCore

import typings.enzyme.mod.MountRendererProps
import typings.enzyme.mod.ReactWrapper
import typings.materialUiCore.materialUiCoreStrings.mount
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnMount extends js.Object {
  def apply[P](node: ReactElement): ReactWrapper[mount, _, Component[js.Object, js.Object, _]] = js.native
  def apply[P](node: ReactElement, options: MountRendererProps): ReactWrapper[mount, _, Component[js.Object, js.Object, _]] = js.native
}

