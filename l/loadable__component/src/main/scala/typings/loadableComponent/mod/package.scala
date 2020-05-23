package typings.loadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultComponent[P] = typings.react.mod.ComponentType[P] | typings.loadableComponent.mod.DefaultImportedComponent[P]
  type LoadableComponent[T] = (typings.react.mod.ComponentType[T with typings.loadableComponent.anon.Fallback]) with typings.loadableComponent.mod.LoadableComponentMethods[T]
  type LoadableLibrary[TModule] = typings.react.mod.ComponentType[typings.loadableComponent.anon.Children[TModule]] with TModule with typings.loadableComponent.mod.LoadableComponentMethods[js.Object]
}
