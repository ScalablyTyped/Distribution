package typings.idyll

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idyllMod {
  type Paths = (Record[PredefinedFile, String]) with (Record[ComponentFiles, js.Array[String]])
}
