package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a specific parameter.
  */
@js.native
trait SchemaParameterMetadata extends js.Object {
  
  /**
    * Required. The help text to display for the parameter.
    */
  var helpText: js.UndefOr[String] = js.native
  
  /**
    * Optional. Whether the parameter is optional. Defaults to false.
    */
  var isOptional: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The label to display for the parameter.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the parameter.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. Regexes that the parameter must match.
    */
  var regexes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaParameterMetadata {
  
  @scala.inline
  def apply(): SchemaParameterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameterMetadata]
  }
  
  @scala.inline
  implicit class SchemaParameterMetadataOps[Self <: SchemaParameterMetadata] (val x: Self) extends AnyVal {
    
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
    def setHelpText(value: String): Self = this.set("helpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpText: Self = this.set("helpText", js.undefined)
    
    @scala.inline
    def setIsOptional(value: Boolean): Self = this.set("isOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOptional: Self = this.set("isOptional", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRegexesVarargs(value: String*): Self = this.set("regexes", js.Array(value :_*))
    
    @scala.inline
    def setRegexes(value: js.Array[String]): Self = this.set("regexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexes: Self = this.set("regexes", js.undefined)
  }
}
