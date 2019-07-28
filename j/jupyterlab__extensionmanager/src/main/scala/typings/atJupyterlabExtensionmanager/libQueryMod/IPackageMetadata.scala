package typings.atJupyterlabExtensionmanager.libQueryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabExtensionmanager.Anon_Deprecated
import typings.atJupyterlabExtensionmanager.Anon_Key
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
  var `dist-tags`: Anon_Key
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
  var versions: StringDictionary[Anon_Deprecated]
}

object IPackageMetadata {
  @scala.inline
  def apply(
    description: String,
    `dist-tags`: Anon_Key,
    modified: String,
    name: String,
    versions: StringDictionary[Anon_Deprecated]
  ): IPackageMetadata = {
    val __obj = js.Dynamic.literal(description = description, modified = modified, name = name, versions = versions)
    __obj.updateDynamic("dist-tags")(`dist-tags`)
    __obj.asInstanceOf[IPackageMetadata]
  }
}

