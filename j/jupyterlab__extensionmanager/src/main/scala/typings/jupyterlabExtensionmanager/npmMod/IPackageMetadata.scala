package typings.jupyterlabExtensionmanager.npmMod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.anon.Deprecated
import typings.jupyterlabExtensionmanager.anon.Dictkey
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
  var `dist-tags`: Dictkey
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
  var versions: StringDictionary[Deprecated]
}

object IPackageMetadata {
  @scala.inline
  def apply(
    description: String,
    `dist-tags`: Dictkey,
    modified: String,
    name: String,
    versions: StringDictionary[Deprecated]
  ): IPackageMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackageMetadata]
  }
}

