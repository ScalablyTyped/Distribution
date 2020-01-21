package typings.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type OptionPredicate[O /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function2[
    /* option */ O, 
    /* value */ js.UndefOr[typings.ionicCliFramework.definitionsMod.ParsedArg], 
    scala.Boolean
  ]
}
