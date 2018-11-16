package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libOptionsMod {
  type OptionPredicate[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] = js.Function2[
    /* option */ O, 
    /* value */ js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.ParsedArg], 
    scala.Boolean
  ]
}
