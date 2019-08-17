package typings.lasso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDependenciesMod {
  import typings.std.Error

  type Callback = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], js.Any]
}
