package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Customize service error responses.  For example, list any service specific
  * protobuf types that can appear in error detail lists of error responses.
  * Example:      custom_error:       types:       - google.foo.v1.CustomError
  * - google.foo.v1.AnotherError
  */
@js.native
trait SchemaCustomError extends js.Object {
  
  /**
    * The list of custom error rules that apply to individual API messages.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaCustomErrorRule]] = js.native
  
  /**
    * The list of custom error detail types, e.g.
    * &#39;google.foo.v1.CustomError&#39;.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}
object SchemaCustomError {
  
  @scala.inline
  def apply(): SchemaCustomError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomError]
  }
  
  @scala.inline
  implicit class SchemaCustomErrorOps[Self <: SchemaCustomError] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: SchemaCustomErrorRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[SchemaCustomErrorRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
