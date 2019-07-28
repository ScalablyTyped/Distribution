package typings.imagemagick.imagemagickMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemagick", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convert(args: js.Any, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  def convert(args: js.Any, timeout: Double, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  def crop(options: Options, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  def identify(path: String, callback: js.Function2[/* err */ Error, /* features */ Features, Unit]): ChildProcess = js.native
  def identify(path: js.Array[_], callback: js.Function2[/* err */ Error, /* result */ String, Unit]): ChildProcess = js.native
  def readMetadata(path: String, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  def resize(options: Options, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  def resizeArgs(options: Options): ResizeArgs = js.native
}

