package typings
package atJupyterlabExtensionmanagerLib.libQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackageMetadata extends js.Object {
  /**
    * A short description of the package.
    */
  var description: java.lang.String
  /**
    * A mapping of dist tags to the versions they point to.
    */
  var `dist-tags`: atJupyterlabExtensionmanagerLib.Anon_Key
  /**
    * ISO string of the last time this package was modified.
    */
  var modified: java.lang.String
  /**
    * The package name.
    */
  var name: java.lang.String
  /**
    * A mapping of semver-compliant version numbers to version data.
    */
  var versions: org.scalablytyped.runtime.StringDictionary[atJupyterlabExtensionmanagerLib.Anon_Deprecated]
}

object IPackageMetadata {
  @scala.inline
  def apply(
    description: java.lang.String,
    `dist-tags`: atJupyterlabExtensionmanagerLib.Anon_Key,
    modified: java.lang.String,
    name: java.lang.String,
    versions: org.scalablytyped.runtime.StringDictionary[atJupyterlabExtensionmanagerLib.Anon_Deprecated]
  ): IPackageMetadata = {
    val __obj = js.Dynamic.literal(description = description, modified = modified, name = name, versions = versions)
    __obj.updateDynamic("dist-tags")(`dist-tags`)
    __obj.asInstanceOf[IPackageMetadata]
  }
}

