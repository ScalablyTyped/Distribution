package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KnockoutComponentTypes {
  /* Rewritten from type alias, can be one of: 
    - typings.knockout.KnockoutComponentTypes.ViewModelFunction
    - typings.knockout.KnockoutComponentTypes.ViewModelSharedInstance
    - typings.knockout.KnockoutComponentTypes.ViewModelFactoryFunction
    - typings.knockout.KnockoutComponentTypes.AMDModule
  */
  type ViewModel = typings.knockout.KnockoutComponentTypes._ViewModel | typings.knockout.KnockoutComponentTypes.ViewModelFunction
  // viewmodel types
  type ViewModelFunction = js.Function1[/* params */ js.UndefOr[js.Any], js.Any]
}
