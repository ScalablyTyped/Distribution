package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A documentation rule provides information about individual API elements.
  */
@js.native
trait SchemaDocumentationRule extends js.Object {
  
  /**
    * Deprecation description of the selected element(s). It can be provided if
    * an element is marked as `deprecated`.
    */
  var deprecationDescription: js.UndefOr[String] = js.native
  
  /**
    * Description of the selected API(s).
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The selector is a comma-separated list of patterns. Each pattern is a
    * qualified name of the element which may end in &quot;*&quot;, indicating
    * a wildcard. Wildcards are only allowed at the end and for a whole
    * component of the qualified name, i.e. &quot;foo.*&quot; is ok, but not
    * &quot;foo.b*&quot; or &quot;foo.*.bar&quot;. A wildcard will match one or
    * more components. To specify a default for all applicable elements, the
    * whole pattern &quot;*&quot; is used.
    */
  var selector: js.UndefOr[String] = js.native
}
object SchemaDocumentationRule {
  
  @scala.inline
  def apply(): SchemaDocumentationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentationRule]
  }
  
  @scala.inline
  implicit class SchemaDocumentationRuleOps[Self <: SchemaDocumentationRule] (val x: Self) extends AnyVal {
    
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
    def setDeprecationDescription(value: String): Self = this.set("deprecationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationDescription: Self = this.set("deprecationDescription", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
