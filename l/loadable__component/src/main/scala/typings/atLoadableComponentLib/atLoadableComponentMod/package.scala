package typings
package atLoadableComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atLoadableComponentMod {
  type DefaultComponent[P] = reactLib.reactMod.ComponentType[P] | DefaultImportedComponent[P]
  type LoadableComponent[T] = (reactLib.reactMod.ComponentType[T with atLoadableComponentLib.Anon_Fallback]) with LoadableComponentMethods[T]
  type LoadableLibrary[TModule] = reactLib.reactMod.ComponentType[atLoadableComponentLib.Anon_Children[TModule]] with TModule with LoadableComponentMethods[js.Object]
}
