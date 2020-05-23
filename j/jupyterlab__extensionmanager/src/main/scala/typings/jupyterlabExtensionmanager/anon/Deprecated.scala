package typings.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deprecated extends js.Object {
  /**
    * The deprecation warnings message of this version.
    */
  var deprecated: js.UndefOr[String] = js.undefined
  /**
    * A short description of the package.
    */
  var description: String
  /**
    * The package name.
    */
  var name: String
  /**
    * The version string for this version.
    */
  var version: String
}

object Deprecated {
  @scala.inline
  def apply(description: String, name: String, version: String, deprecated: String = null): Deprecated = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deprecated]
  }
}

