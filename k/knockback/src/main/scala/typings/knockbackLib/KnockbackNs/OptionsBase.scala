package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionsBase extends js.Object {
                 // a store used to cache and share view models.
  var factory: js.UndefOr[Factory] = js.undefined
             // a factory used to create view models.
  var options: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
                 // the path to the value (used to create related observables from the factory).
  var store: js.UndefOr[Store] = js.undefined
}

