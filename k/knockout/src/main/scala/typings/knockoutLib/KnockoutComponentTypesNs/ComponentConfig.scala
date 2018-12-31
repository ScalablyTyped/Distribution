package typings
package knockoutLib.KnockoutComponentTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfig extends js.Object {
  var createViewModel: js.UndefOr[js.Any] = js.undefined
  var template: js.Any
  var viewModel: js.UndefOr[
    ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule
  ] = js.undefined
}

