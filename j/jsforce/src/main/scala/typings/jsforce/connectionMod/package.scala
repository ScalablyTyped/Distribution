package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectionMod {
  import typings.jsforce.jsforceStrings.refresh
  import typings.std.Error

  type Callback[T] = js.Function2[/* err */ Error | Null, /* result */ T, Unit]
  type ConnectionEvent = refresh
}
