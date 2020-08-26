package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgUploadFileExtensionIcons
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Css classes which sets icon.
    */
  var css: js.UndefOr[String] = js.native
  /**
    * Default icons when the file extension is not found. It is taken only the first item which have def set to true, other are ignored.
    */
  var `def`: js.UndefOr[Boolean] = js.native
  /**
    * Array of string for file extensions
    */
  var ext: js.UndefOr[js.Array[_]] = js.native
}

object IgUploadFileExtensionIcons {
  @scala.inline
  def apply(): IgUploadFileExtensionIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUploadFileExtensionIcons]
  }
  @scala.inline
  implicit class IgUploadFileExtensionIconsOps[Self <: IgUploadFileExtensionIcons] (val x: Self) extends AnyVal {
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setDef(value: Boolean): Self = this.set("def", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDef: Self = this.set("def", js.undefined)
    @scala.inline
    def setExtVarargs(value: js.Any*): Self = this.set("ext", js.Array(value :_*))
    @scala.inline
    def setExt(value: js.Array[_]): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
  }
  
}

