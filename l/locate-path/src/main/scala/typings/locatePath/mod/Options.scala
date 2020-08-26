package typings.locatePath.mod

import typings.locatePath.locatePathStrings.directory
import typings.locatePath.locatePathStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Allow symbolic links to match if they point to the requested path type.
  		@default true
  		*/
  val allowSymlinks: js.UndefOr[Boolean] = js.native
  /**
  		Current working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.native
  /**
  		Type of path to match.
  		@default 'file'
  		*/
  val `type`: js.UndefOr[file | directory] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowSymlinks(value: Boolean): Self = this.set("allowSymlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSymlinks: Self = this.set("allowSymlinks", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setType(value: file | directory): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

