package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Organization Units operation in Directory
  * API.
  */
@js.native
trait SchemaOrgUnits extends js.Object {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * List of user objects.
    */
  var organizationUnits: js.UndefOr[js.Array[SchemaOrgUnit]] = js.native
}
object SchemaOrgUnits {
  
  @scala.inline
  def apply(): SchemaOrgUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnits]
  }
  
  @scala.inline
  implicit class SchemaOrgUnitsOps[Self <: SchemaOrgUnits] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOrganizationUnitsVarargs(value: SchemaOrgUnit*): Self = this.set("organizationUnits", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationUnits(value: js.Array[SchemaOrgUnit]): Self = this.set("organizationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationUnits: Self = this.set("organizationUnits", js.undefined)
  }
}
