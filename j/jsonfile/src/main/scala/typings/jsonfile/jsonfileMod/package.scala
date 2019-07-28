package typings.jsonfile

import typings.jsonfile.Anon_EOL
import typings.jsonfile.Anon_Encoding
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.PathLike
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonfileMod {
  type JFReadOptions = js.UndefOr[Anon_Encoding | String | Null]
  type JFWriteOptions = Anon_EOL | String | Null
  type Path = PathLike | Url
  type ReadCallback = js.Function2[/* err */ ErrnoException | Null, /* data */ js.Any, Unit]
  type WriteCallback = js.Function1[/* err */ ErrnoException, Unit]
}
