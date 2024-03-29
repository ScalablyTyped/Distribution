package typings.materialUiCore.anon

import typings.enzyme.mod.MountRendererProps
import typings.enzyme.mod.ReactWrapper
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {None <P, S>(node : react.react.ReactElement, options : enzyme.enzyme.MountRendererProps): enzyme.enzyme.ReactWrapper<P, S, react.react.Component<{}, {}, any>>, None <P, S>(node : react.react.ReactElement): enzyme.enzyme.ReactWrapper<P, S, react.react.Component<{}, {}, any>>, None <P>(node : react.react.ReactElement, options : enzyme.enzyme.MountRendererProps): enzyme.enzyme.ReactWrapper<P, any, react.react.Component<{}, {}, any>>, None <P>(node : react.react.ReactElement): enzyme.enzyme.ReactWrapper<P, any, react.react.Component<{}, {}, any>>, None <C extends react.react.Component<{}, {}, any>, P = C['props'], S = C['state']>(node : react.react.ReactElement, options : enzyme.enzyme.MountRendererProps): enzyme.enzyme.ReactWrapper<P, S, C>, None <C extends react.react.Component<{}, {}, any>, P = C['props'], S = C['state']>(node : react.react.ReactElement): enzyme.enzyme.ReactWrapper<P, S, C>} & {  attachTo :std.HTMLElement, cleanUp (): void} */
@js.native
trait NonePSnodeReactElementopt extends StObject {
  
  def apply[P](node: ReactElement): ReactWrapper[P, Any, typings.react.mod.Component[js.Object, js.Object, Any]] = js.native
  def apply[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, Any, typings.react.mod.Component[js.Object, js.Object, Any]] = js.native
  
  var attachTo: HTMLElement = js.native
  
  def cleanUp(): Unit = js.native
}
