package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instances ListServerCas response.
  */
@js.native
trait SchemaInstancesListServerCasResponse extends js.Object {
  
  var activeVersion: js.UndefOr[String] = js.native
  
  /**
    * List of server CA certificates for the instance.
    */
  var certs: js.UndefOr[js.Array[SchemaSslCert]] = js.native
  
  /**
    * This is always sql#instancesListServerCas.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaInstancesListServerCasResponse {
  
  @scala.inline
  def apply(): SchemaInstancesListServerCasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesListServerCasResponse]
  }
  
  @scala.inline
  implicit class SchemaInstancesListServerCasResponseOps[Self <: SchemaInstancesListServerCasResponse] (val x: Self) extends AnyVal {
    
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
    def setActiveVersion(value: String): Self = this.set("activeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveVersion: Self = this.set("activeVersion", js.undefined)
    
    @scala.inline
    def setCertsVarargs(value: SchemaSslCert*): Self = this.set("certs", js.Array(value :_*))
    
    @scala.inline
    def setCerts(value: js.Array[SchemaSslCert]): Self = this.set("certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCerts: Self = this.set("certs", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
