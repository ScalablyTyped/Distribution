package typings
package jsonfileLib.jsonfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FS extends js.Object {
  var readFile: jsonfileLib.Anon_PromisifyPath = js.native
  @JSName("readFileSync")
  var readFileSync_Original: js.Function1[/* path */ scala.Double, java.lang.String | nodeLib.Buffer] = js.native
  var writeFile: jsonfileLib.Anon_Promisify = js.native
  @JSName("writeFileSync")
  var writeFileSync_Original: js.Function3[
    /* path */ scala.Double, 
    /* data */ js.Any, 
    /* options */ nodeLib.fsMod.WriteFileOptions, 
    scala.Unit
  ] = js.native
  def readFileSync(path: scala.Double): java.lang.String | nodeLib.Buffer = js.native
  def writeFileSync(path: scala.Double, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): scala.Unit = js.native
}

