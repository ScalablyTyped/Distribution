package typings.atLoadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atLoadableComponentMod {
  import typings.atLoadableComponent.Anon_Children
  import typings.atLoadableComponent.Anon_Fallback
  import typings.react.reactMod.ComponentType

  type DefaultComponent[P] = ComponentType[P] | DefaultImportedComponent[P]
  type LoadableComponent[T] = (ComponentType[T with Anon_Fallback]) with LoadableComponentMethods[T]
  type LoadableLibrary[TModule] = ComponentType[Anon_Children[TModule]] with TModule with LoadableComponentMethods[js.Object]
}
