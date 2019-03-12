package typings
package gulpDashUtilLib.gulpDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var File: vinylLib.vinylMod.FileConstructor = js.native
  val colors: chalkLib.chalkMod.Chalk with chalkLib.Anon_SupportsColor = js.native
  val date: gulpDashUtilLib.Anon_ConvertLocalTimeToUTC = js.native
  val env: js.Any = js.native
  val linefeed: java.lang.String = js.native
  val noop: gulpDashUtilLib.Anon_Ctor = js.native
  def beep(): scala.Unit = js.native
  def buffer(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def buffer(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[_], scala.Unit]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def combine(streams: nodeLib.NodeJSNs.ReadWriteStream*): js.Function0[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def combine(streams: js.Array[nodeLib.NodeJSNs.ReadWriteStream]): js.Function0[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def isBuffer(obj: js.Any): scala.Boolean = js.native
  def isNull(obj: js.Any): scala.Boolean = js.native
  def isStream(obj: js.Any): scala.Boolean = js.native
  def log(): scala.Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def replaceExtension(npath: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def template(tmpl: java.lang.String): js.Function1[/* opt */ gulpDashUtilLib.Anon_File, java.lang.String] = js.native
  def template(tmpl: java.lang.String, opt: gulpDashUtilLib.Anon_File): java.lang.String = js.native
}

