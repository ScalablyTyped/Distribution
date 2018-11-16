package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectionMod {
  type Callback[T] = js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ T, scala.Unit]
  type ConnectionEvent = jsforceLib.jsforceLibStrings.refresh
}
