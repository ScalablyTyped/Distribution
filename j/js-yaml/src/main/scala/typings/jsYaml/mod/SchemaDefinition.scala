package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDefinition extends js.Object {
  
  var explicit: js.UndefOr[js.Array[Type]] = js.native
  
  var `implicit`: js.UndefOr[js.Array[_]] = js.native
  
  var include: js.UndefOr[js.Array[Schema]] = js.native
}
object SchemaDefinition {
  
  @scala.inline
  def apply(): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefinition]
  }
  
  @scala.inline
  implicit class SchemaDefinitionOps[Self <: SchemaDefinition] (val x: Self) extends AnyVal {
    
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
    def setExplicitVarargs(value: Type*): Self = this.set("explicit", js.Array(value :_*))
    
    @scala.inline
    def setExplicit(value: js.Array[Type]): Self = this.set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicit: Self = this.set("explicit", js.undefined)
    
    @scala.inline
    def setImplicitVarargs(value: js.Any*): Self = this.set("implicit", js.Array(value :_*))
    
    @scala.inline
    def setImplicit(value: js.Array[_]): Self = this.set("implicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicit: Self = this.set("implicit", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: Schema*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[Schema]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
}
