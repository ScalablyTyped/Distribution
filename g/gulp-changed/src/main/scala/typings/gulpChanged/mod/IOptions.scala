package typings.gulpChanged.mod

import typings.node.streamMod.Transform
import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  /**
    * The working directory the folder is relative to.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Extension of the destination files.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * Function that determines whether the source file is different from the destination file.
    * @default changed.compareLastModifiedTime
    */
  var hasChanged: js.UndefOr[IComparator] = js.native
  /**
    * Function to transform the path to the destination file. Should return the absolute path to the (renamed) destination file.
    */
  var transformPath: js.UndefOr[js.Function1[/* destPath */ String, String]] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setHasChanged(
      value: (/* stream */ Transform, /* callback */ js.Function, /* sourceFile */ File, /* destPath */ String) => Unit
    ): Self = this.set("hasChanged", js.Any.fromFunction4(value))
    @scala.inline
    def deleteHasChanged: Self = this.set("hasChanged", js.undefined)
    @scala.inline
    def setTransformPath(value: /* destPath */ String => String): Self = this.set("transformPath", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformPath: Self = this.set("transformPath", js.undefined)
  }
  
}

