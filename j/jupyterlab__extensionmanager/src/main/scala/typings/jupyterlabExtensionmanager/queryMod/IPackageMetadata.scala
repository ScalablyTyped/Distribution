package typings.jupyterlabExtensionmanager.queryMod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.AnonDeprecated
import typings.jupyterlabExtensionmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackageMetadata extends js.Object {
  /**
    * A short description of the package.
    */
  var description: String
  /**
    * A mapping of dist tags to the versions they point to.
    */
  var `dist-tags`: AnonKey
  /**
    * ISO string of the last time this package was modified.
    */
  var modified: String
  /**
    * The package name.
    */
  var name: String
  /**
    * A mapping of semver-compliant version numbers to version data.
    */
  var versions: StringDictionary[AnonDeprecated]
}

object IPackageMetadata {
  @scala.inline
  def apply(
    description: String,
    `dist-tags`: AnonKey,
    modified: String,
    name: String,
    versions: StringDictionary[AnonDeprecated]
  ): IPackageMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackageMetadata]
  }
}

