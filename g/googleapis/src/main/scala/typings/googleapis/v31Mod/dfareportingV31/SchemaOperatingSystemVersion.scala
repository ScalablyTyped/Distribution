package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a particular version of an operating system that
  * can be targeted by ads.
  */
@js.native
trait SchemaOperatingSystemVersion extends js.Object {
  /**
    * ID of this operating system version.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemVersion&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Major version (leftmost number) of this operating system version.
    */
  var majorVersion: js.UndefOr[String] = js.native
  /**
    * Minor version (number after the first dot) of this operating system
    * version.
    */
  var minorVersion: js.UndefOr[String] = js.native
  /**
    * Name of this operating system version.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Operating system of this operating system version.
    */
  var operatingSystem: js.UndefOr[SchemaOperatingSystem] = js.native
}

object SchemaOperatingSystemVersion {
  @scala.inline
  def apply(): SchemaOperatingSystemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemVersion]
  }
  @scala.inline
  implicit class SchemaOperatingSystemVersionOps[Self <: SchemaOperatingSystemVersion] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
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
    @scala.inline
    def setOperatingSystem(value: SchemaOperatingSystem): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
  }
  
}

