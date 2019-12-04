package typings.atMaterialDashUiCore

import typings.enzyme.enzymeMod.MountRendererProps
import typings.enzyme.enzymeMod.ReactWrapper
import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {None <P, S>(node : react.react.ReactElement, options : enzyme.enzyme.MountRendererProps): enzyme.enzyme.ReactWrapper<P, S, react.react.Component<{}, {}, any>>, None <P, S>(node : react.react.ReactElement): enzyme.enzyme.ReactWrapper<P, S, react.react.Component<{}, {}, any>>, None <P>(node : react.react.ReactElement, options : enzyme.enzyme.MountRendererProps): enzyme.enzyme.ReactWrapper<P, any, react.react.Component<{}, {}, any>>, None <P>(node : react.react.ReactElement): enzyme.enzyme.ReactWrapper<P, any, react.react.Component<{}, {}, any>>, None <C extends react.react.Component<{}, {}, any>, P = C['props'], S = C['state']>(node : react.react.ReactElement, options : enzyme.enzyme.MountRendererProps): enzyme.enzyme.ReactWrapper<P, S, C>, None <C extends react.react.Component<{}, {}, any>, P = C['props'], S = C['state']>(node : react.react.ReactElement): enzyme.enzyme.ReactWrapper<P, S, C>} & {  attachTo  :std.HTMLElement, cleanUp (): void} */
@js.native
trait NonePSnodeReactElementoptionsMountRendererPropsRea extends js.Object {
  var attachTo: HTMLElement = js.native
  def apply[P](node: ReactElement): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def apply[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def cleanUp(): Unit = js.native
}

