package typings.atLinguiReact

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withI18nMod {
  type ComponentConstructor[P] = (ComponentClass[P, ComponentState]) | StatelessComponent[P]
}
