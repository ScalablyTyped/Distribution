package typings.googleapis.v32Mod.dfareportingV32

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
  def apply(
    id: String = null,
    kind: String = null,
    majorVersion: String = null,
    minorVersion: String = null,
    name: String = null,
    operatingSystem: SchemaOperatingSystem = null
  ): SchemaOperatingSystemVersion = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (majorVersion != null) __obj.updateDynamic("majorVersion")(majorVersion.asInstanceOf[js.Any])
    if (minorVersion != null) __obj.updateDynamic("minorVersion")(minorVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperatingSystemVersion]
  }
}

