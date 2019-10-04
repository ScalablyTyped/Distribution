package typings.atJimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesPluginsMod {
  import typings.atJimpCore.atJimpCoreStrings.`class`
  import typings.atJimpCore.atJimpCoreStrings.constants
  import typings.atJimpCore.atJimpCoreStrings.mime
  import typings.atJimpCore.typesEtcMod.Image
  import typings.atJimpCore.typesUtilsMod.Omit
  import typings.std.Pick
  import typings.std.Required

  type ClassOrConstantPlugin[T /* <: Image */] = WellFormedPlugin[T] with (Required[Pick[WellFormedPlugin[T], `class` | constants]])
  type IllformedPlugin = (Omit[_, `class` | constants]) with js.Object
  type JimpPlugin[T /* <: Image */] = ClassOrConstantPlugin[T] | IllformedPlugin
  type JimpType[T /* <: Image */] = WellFormedPlugin[T] with (Required[Pick[WellFormedPlugin[T], mime]])
}
