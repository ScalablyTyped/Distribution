package typings.jsdevtoolsReaddirEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesPublicMod {
  type Callback[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* result */ T, scala.Unit]
  type FilterFunction = js.Function1[/* stat */ typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats, js.Any]
}
