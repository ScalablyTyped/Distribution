package typings.gulpNewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  /**
    * Path to destination directory or file.
    */
  var dest: String = js.native
  /**
    * Source files will be matched to destination files with the provided extension.
    */
  var ext: js.UndefOr[String] = js.native
  /**
    * Map relative source paths to relative destination paths.
    */
  var map: js.UndefOr[js.Function1[/* relativePath */ String, String]] = js.native
}

object IOptions {
  @scala.inline
  def apply(dest: String): IOptions = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setMap(value: /* relativePath */ String => String): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
  
}

