package typings.idyll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idyllMod {
  import typings.std.Record

  type Paths = (Record[PredefinedFile, String]) with (Record[ComponentFiles, js.Array[String]])
}
