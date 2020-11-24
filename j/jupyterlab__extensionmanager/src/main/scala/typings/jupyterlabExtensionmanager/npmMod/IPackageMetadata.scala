package typings.jupyterlabExtensionmanager.npmMod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.anon.Deprecated
import typings.jupyterlabExtensionmanager.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPackageMetadata extends js.Object {
  
  /**
    * A short description of the package.
    */
  var description: String = js.native
  
  /**
    * A mapping of dist tags to the versions they point to.
    */
  var `dist-tags`: Dictkey = js.native
  
  /**
    * ISO string of the last time this package was modified.
    */
  var modified: String = js.native
  
  /**
    * The package name.
    */
  var name: String = js.native
  
  /**
    * A mapping of semver-compliant version numbers to version data.
    */
  var versions: StringDictionary[Deprecated] = js.native
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
  
  @scala.inline
  implicit class IPackageMetadataOps[Self <: IPackageMetadata] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDist-tags`(value: Dictkey): Self = this.set("dist-tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: StringDictionary[Deprecated]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
}
