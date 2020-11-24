package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLicenseCode extends js.Object {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Description of this License Code.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of resource. Always compute#licenseCode for licenses.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] URL and description aliases of Licenses with the same
    * License Code.
    */
  var licenseAlias: js.UndefOr[js.Array[SchemaLicenseCodeLicenseAlias]] = js.native
  
  /**
    * [Output Only] Name of the resource. The name is 1-20 characters long and
    * must be a valid 64 bit integer.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Current state of this License Code.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If true, the license will remain attached when creating
    * images or snapshots from disks. Otherwise, the license is not
    * transferred.
    */
  var transferable: js.UndefOr[Boolean] = js.native
}
object SchemaLicenseCode {
  
  @scala.inline
  def apply(): SchemaLicenseCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseCode]
  }
  
  @scala.inline
  implicit class SchemaLicenseCodeOps[Self <: SchemaLicenseCode] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLicenseAliasVarargs(value: SchemaLicenseCodeLicenseAlias*): Self = this.set("licenseAlias", js.Array(value :_*))
    
    @scala.inline
    def setLicenseAlias(value: js.Array[SchemaLicenseCodeLicenseAlias]): Self = this.set("licenseAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseAlias: Self = this.set("licenseAlias", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTransferable(value: Boolean): Self = this.set("transferable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferable: Self = this.set("transferable", js.undefined)
  }
}
