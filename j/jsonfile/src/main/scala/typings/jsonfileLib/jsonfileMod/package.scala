package typings
package jsonfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonfileMod {
  type FSReadOptions = js.UndefOr[jsonfileLib.Anon_EncodingFlag | scala.Null]
  type FSWriteOptions = js.UndefOr[java.lang.String | jsonfileLib.Anon_Encoding | scala.Null]
  type JFReadCallback = js.Function2[
    /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
    /* data */ js.Any, 
    scala.Unit
  ]
  type JFReadOptions = js.UndefOr[jsonfileLib.Anon_Throws | scala.Null]
  type JFWriteOptions = java.lang.String | jsonfileLib.Anon_Replacer | scala.Null
  type Path = java.lang.String | scala.Double | nodeLib.Buffer | nodeLib.urlMod.Url
  type ReadCallback = js.Function2[
    /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
    /* data */ nodeLib.Buffer, 
    scala.Unit
  ]
  type WriteCallback = js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
}
