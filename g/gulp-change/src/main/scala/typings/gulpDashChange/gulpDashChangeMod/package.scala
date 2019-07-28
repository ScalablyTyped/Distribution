package typings.gulpDashChange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashChangeMod {
  type Callback = js.Function2[/* err */ js.Any, /* content */ String, js.Any]
  type ChangeFunction = js.Function2[/* content */ String, /* callback */ Callback, String | Unit]
}
