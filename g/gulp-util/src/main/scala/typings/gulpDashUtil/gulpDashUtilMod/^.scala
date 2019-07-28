package typings.gulpDashUtil.gulpDashUtilMod

import typings.chalk.Anon_SupportsColor
import typings.chalk.chalkMod.Chalk
import typings.gulpDashUtil.Anon_File
import typings.node.NodeJSNs.ReadWriteStream
import typings.std.Error
import typings.vinyl.vinylMod.FileConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var File: FileConstructor = js.native
  val colors: Chalk with Anon_SupportsColor = js.native
  val env: js.Any = js.native
  val linefeed: String = js.native
  def beep(): Unit = js.native
  def buffer(): ReadWriteStream = js.native
  def buffer(cb: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]): ReadWriteStream = js.native
  def combine(streams: ReadWriteStream*): js.Function0[ReadWriteStream] = js.native
  def combine(streams: js.Array[ReadWriteStream]): js.Function0[ReadWriteStream] = js.native
  def isBuffer(obj: js.Any): Boolean = js.native
  def isNull(obj: js.Any): Boolean = js.native
  def isStream(obj: js.Any): Boolean = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def replaceExtension(npath: String, ext: String): String = js.native
  def template(tmpl: String): js.Function1[/* opt */ Anon_File, String] = js.native
  def template(tmpl: String, opt: Anon_File): String = js.native
}

