package typings.ink.inkMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSXNs {
  import typings.ink.inkMod.Component
  import typings.ink.inkMod.InkElement
  import typings.ink.inkMod.StatelessComponent

  type Element = InkElement
  type ElementClass = Component[js.Object, js.Object, js.Object]
  type FunctionalElement = StatelessComponent[js.Object, js.Object]
}
