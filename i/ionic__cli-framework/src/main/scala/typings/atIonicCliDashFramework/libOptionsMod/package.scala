package typings.atIonicCliDashFramework

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.ParsedArg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libOptionsMod {
  type OptionPredicate[O /* <: CommandMetadataOption */] = js.Function2[/* option */ O, /* value */ js.UndefOr[ParsedArg], Boolean]
}
