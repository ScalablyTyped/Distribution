package typings.lasso

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDependenciesMod {
  type Callback = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], js.Any]
}
