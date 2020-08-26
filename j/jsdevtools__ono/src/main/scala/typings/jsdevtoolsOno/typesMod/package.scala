package typings.jsdevtoolsOno

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ErrorLike = typings.std.Error | typings.jsdevtoolsOno.typesMod.ErrorPOJO
  type MessageFormatter = js.Function2[/* message */ java.lang.String, /* repeated */ js.Any, java.lang.String]
}
