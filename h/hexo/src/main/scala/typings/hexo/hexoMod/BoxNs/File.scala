package typings.hexo.hexoMod.BoxNs

import typings.hexo.Anon_Encoding
import typings.hexo.hexoStrings.create
import typings.hexo.hexoStrings.delete
import typings.hexo.hexoStrings.skip
import typings.hexo.hexoStrings.update
import typings.node.Buffer
import typings.node.fsMod.Stats
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
  val path: String = js.native
  /**
    * Full path of the file
    */
  val source: String = js.native
  /**
    * File type. The value can be `create` , `update` , `skip`, `delete` .
    */
  val `type`: create | update | skip | delete = js.native
  /**
    * Read a file
    */
  def read(): js.Promise[String | Buffer] = js.native
  def read(fn: js.Function2[/* err */ js.Any, /* result */ String | Buffer, Unit]): js.Promise[String | Buffer] = js.native
  def read(option: Anon_Encoding): js.Promise[String | Buffer] = js.native
  def read(option: Anon_Encoding, fn: js.Function2[/* err */ js.Any, /* result */ String | Buffer, Unit]): js.Promise[String | Buffer] = js.native
  /**
    * Read a file synchronously
    */
  def readSync(): String | Buffer = js.native
  def readSync(option: Anon_Encoding): String | Buffer = js.native
  /**
    * Render a file
    */
  def render(): js.Promise[String] = js.native
  def render(fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  def render(option: js.Any): js.Promise[String] = js.native
  def render(option: js.Any, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  /**
    * Render a file synchronously
    */
  def renderSync(): String = js.native
  def renderSync(option: js.Any): String = js.native
  /**
    * Read the status of a file
    */
  def stat(): js.Promise[Stats] = js.native
  def stat(fn: js.Function2[/* err */ js.Any, /* result */ Stats, Unit]): js.Promise[Stats] = js.native
  /**
    * Read the status of a file synchronously
    */
  def statSync(): Stats = js.native
}

