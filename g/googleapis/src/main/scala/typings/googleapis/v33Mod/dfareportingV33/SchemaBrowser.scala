package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a browser that can be targeted by ads.
  */
@js.native
trait SchemaBrowser extends js.Object {
  /**
    * ID referring to this grouping of browser and version numbers. This is the
    * ID used for targeting.
    */
  var browserVersionId: js.UndefOr[String] = js.native
  /**
    * DART ID of this browser. This is the ID used when generating reports.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browser&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Major version number (leftmost number) of this browser. For example, for
    * Chrome 5.0.376.86 beta, this field should be set to 5. An asterisk (*)
    * may be used to target any version number, and a question mark (?) may be
    * used to target cases where the version number cannot be identified. For
    * example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so
    * on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets
    * cases where the ad server knows the browser is Firefox but can&#39;t tell
    * which version it is.
    */
  var majorVersion: js.UndefOr[String] = js.native
  /**
    * Minor version number (number after first dot on left) of this browser.
    * For example, for Chrome 5.0.375.86 beta, this field should be set to 0.
    * An asterisk (*) may be used to target any version number, and a question
    * mark (?) may be used to target cases where the version number cannot be
    * identified. For example, Chrome *.* targets any version of Chrome:
    * 1.2, 2.5, 3.5, and so on. Chrome 3.* targets Chrome 3.1, 3.5, but
    * not 4.0. Firefox ?.? targets cases where the ad server knows the browser
    * is Firefox but can&#39;t tell which version it is.
    */
  var minorVersion: js.UndefOr[String] = js.native
  /**
    * Name of this browser.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaBrowser {
  @scala.inline
  def apply(): SchemaBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowser]
  }
  @scala.inline
  implicit class SchemaBrowserOps[Self <: SchemaBrowser] (val x: Self) extends AnyVal {
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
    def setBrowserVersionId(value: String): Self = this.set("browserVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserVersionId: Self = this.set("browserVersionId", js.undefined)
    @scala.inline
    def setDartId(value: String): Self = this.set("dartId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDartId: Self = this.set("dartId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMajorVersion(value: String): Self = this.set("majorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorVersion: Self = this.set("majorVersion", js.undefined)
    @scala.inline
    def setMinorVersion(value: String): Self = this.set("minorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorVersion: Self = this.set("minorVersion", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

