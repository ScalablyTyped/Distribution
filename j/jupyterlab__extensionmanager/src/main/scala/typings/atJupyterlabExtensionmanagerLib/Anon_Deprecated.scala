package typings
package atJupyterlabExtensionmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deprecated extends js.Object {
  /**
    * The deprecation warnings message of this version.
    */
  var deprecated: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A short description of the package.
    */
  var description: java.lang.String
  /**
    * The package name.
    */
  var name: java.lang.String
  /**
    * The version string for this version.
    */
  var version: java.lang.String
}

object Anon_Deprecated {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    version: java.lang.String,
    deprecated: java.lang.String = null
  ): Anon_Deprecated = {
    val __obj = js.Dynamic.literal(description = description, name = name, version = version)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    __obj.asInstanceOf[Anon_Deprecated]
  }
}

