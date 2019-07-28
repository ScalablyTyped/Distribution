package typings.jsforce

import typings.jsforce.jsforceStrings.refresh
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectionMod {
  type Callback[T] = js.Function2[/* err */ Error | Null, /* result */ T, Unit]
  type ConnectionEvent = refresh
}
