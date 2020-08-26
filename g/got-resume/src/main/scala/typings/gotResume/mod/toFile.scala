package typings.gotResume.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("got-resume", "toFile")
@js.native
object toFile extends js.Object {
  /**
    * Fetch URL and stream to file.
    * Return Promise. Promise resolves/reject once request is complete
    * (successfully or unsuccessfully) and file is closed.
    *
    * @param path File path to write to.
    * @param url URL.
    * @param options Options object (as per stream method).
    */
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, options: ToFileOptions): js.Promise[Unit] = js.native
  def apply(path: String, url: js.UndefOr[scala.Nothing], options: ToFileOptions): js.Promise[Unit] = js.native
  def apply(path: String, url: String): js.Promise[Unit] = js.native
  def apply(path: String, url: String, options: ToFileOptions): js.Promise[Unit] = js.native
}

