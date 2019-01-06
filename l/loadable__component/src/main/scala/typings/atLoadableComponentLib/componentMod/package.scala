package typings
package atLoadableComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentMod {
  type DefaultComponent[P] = reactLib.reactMod.ReactNs.ComponentType[P] | DefaultImportedComponent[P]
  type LoadableComponent[T] = reactLib.reactMod.ReactNs.ComponentType[T with atLoadableComponentLib.Anon_Fallback]
  type LoadableLibrary[TModule] = reactLib.reactMod.ReactNs.ComponentType[atLoadableComponentLib.Anon_Children[TModule]] with TModule
}
