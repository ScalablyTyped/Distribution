package typings
package imagemagickLib.imagemagickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemagick", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convert(args: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def convert(
    args: js.Any,
    timeout: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def crop(options: Options, callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def identify(
    path: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* features */ Features, scala.Unit]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def identify(
    path: js.Array[_],
    callback: js.Function2[/* err */ stdLib.Error, /* result */ java.lang.String, scala.Unit]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def readMetadata(
    path: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def resize(options: Options, callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def resizeArgs(options: Options): ResizeArgs = js.native
}

