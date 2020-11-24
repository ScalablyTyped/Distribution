package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the result of checking a revision.
  */
@js.native
trait SchemaRevisionCheckResponse extends js.Object {
  
  /**
    * The version of the API this client revision should use when calling API
    * methods.
    */
  var apiVersion: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#revisionCheckResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The result of the revision check. Possible values are:   - &quot;OK&quot;
    * - The revision being used is current.  - &quot;DEPRECATED&quot; - There
    * is currently a newer version available, but the revision being used still
    * works.  - &quot;INVALID&quot; - The revision being used is not supported
    * in any released version.
    */
  var revisionStatus: js.UndefOr[String] = js.native
}
object SchemaRevisionCheckResponse {
  
  @scala.inline
  def apply(): SchemaRevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionCheckResponse]
  }
  
  @scala.inline
  implicit class SchemaRevisionCheckResponseOps[Self <: SchemaRevisionCheckResponse] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRevisionStatus(value: String): Self = this.set("revisionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionStatus: Self = this.set("revisionStatus", js.undefined)
  }
}
