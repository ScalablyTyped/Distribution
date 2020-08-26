package typings.loadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentResolver[Props, Module] = js.Function2[/* module */ Module, /* props */ Props, typings.react.mod.ComponentType[Props]]
  type DefaultComponent[Props] = typings.react.mod.ComponentType[Props] | typings.loadableComponent.mod.DefaultImportedComponent[Props]
  type LoadableComponent[Props] = (typings.react.mod.ComponentType[Props with typings.loadableComponent.anon.Fallback]) with typings.loadableComponent.mod.LoadableComponentMethods[Props]
  type LoadableLibrary[Module] = typings.react.mod.ComponentType[typings.loadableComponent.anon.Children[Module]] with Module with typings.loadableComponent.mod.LoadableComponentMethods[js.Object]
}
