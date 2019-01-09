package typings
package jsonfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonfileMod {
  type JFReadOptions = js.UndefOr[jsonfileLib.Anon_Encoding | java.lang.String | scala.Null]
  type JFWriteOptions = jsonfileLib.Anon_EOL | java.lang.String | scala.Null
  type Path = nodeLib.fsMod.PathLike | nodeLib.urlMod.Url
  type ReadCallback = js.Function2[
    /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
    /* data */ js.Any, 
    scala.Unit
  ]
  type WriteCallback = js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
}
