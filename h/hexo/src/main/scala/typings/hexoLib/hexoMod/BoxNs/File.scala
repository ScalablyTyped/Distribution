package typings
package hexoLib.hexoMod.BoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /**
    * The information from path matching.
    */
  val params: js.Any = js.native
  /**
    * Relative path to the box of the file
    */
  val path: java.lang.String = js.native
  /**
    * Full path of the file
    */
  val source: java.lang.String = js.native
  /**
    * File type. The value can be `create` , `update` , `skip`, `delete` .
    */
  val `type`: hexoLib.hexoLibStrings.create | hexoLib.hexoLibStrings.update | hexoLib.hexoLibStrings.skip | hexoLib.hexoLibStrings.delete = js.native
  /**
    * Read a file
    */
  def read(): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def read(fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String | nodeLib.Buffer, scala.Unit]): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def read(option: hexoLib.Anon_Encoding): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def read(
    option: hexoLib.Anon_Encoding,
    fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String | nodeLib.Buffer, scala.Unit]
  ): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
    * Read a file synchronously
    */
  def readSync(): java.lang.String | nodeLib.Buffer = js.native
  def readSync(option: hexoLib.Anon_Encoding): java.lang.String | nodeLib.Buffer = js.native
  /**
    * Render a file
    */
  def render(): js.Promise[java.lang.String] = js.native
  def render(fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]): js.Promise[java.lang.String] = js.native
  def render(option: js.Any): js.Promise[java.lang.String] = js.native
  def render(option: js.Any, fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]): js.Promise[java.lang.String] = js.native
  /**
    * Render a file synchronously
    */
  def renderSync(): java.lang.String = js.native
  def renderSync(option: js.Any): java.lang.String = js.native
  /**
    * Read the status of a file
    */
  def stat(): js.Promise[nodeLib.fsMod.Stats] = js.native
  def stat(fn: js.Function2[/* err */ js.Any, /* result */ nodeLib.fsMod.Stats, scala.Unit]): js.Promise[nodeLib.fsMod.Stats] = js.native
  /**
    * Read the status of a file synchronously
    */
  def statSync(): nodeLib.fsMod.Stats = js.native
}

