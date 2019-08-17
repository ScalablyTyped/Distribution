package typings.atLinguiReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withI18nMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.StatelessComponent

  type ComponentConstructor[P] = (ComponentClass[P, ComponentState]) | StatelessComponent[P]
}
