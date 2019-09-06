package typings.hashring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashringMod {
  import typings.std.Partial
  import typings.std.Record

  type Servers = String | js.Array[String] | (Record[String, Partial[ServerConfig]])
}
