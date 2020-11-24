package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  sourceLayer :string | undefined,   filter :std.Array<any> | undefined} & mapbox-gl.mapbox-gl.FilterOptions */
@js.native
trait sourceLayerstringundefine extends js.Object {
  
  var filter: js.UndefOr[js.Array[_]] = js.native
  
  var sourceLayer: js.UndefOr[String] = js.native
  
  /**
    * Whether to check if the filter conforms to the Mapbox GL Style Specification.
    * Disabling validation is a performance optimization that should only be used
    * if you have previously validated the values you will be passing to this function.
    */
  var validate: js.UndefOr[Boolean | Null] = js.native
}
object sourceLayerstringundefine {
  
  @scala.inline
  def apply(): sourceLayerstringundefine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[sourceLayerstringundefine]
  }
  
  @scala.inline
  implicit class sourceLayerstringundefineOps[Self <: sourceLayerstringundefine] (val x: Self) extends AnyVal {
    
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
    def setFilterVarargs(value: js.Any*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: js.Array[_]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setSourceLayer(value: String): Self = this.set("sourceLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLayer: Self = this.set("sourceLayer", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValidateNull: Self = this.set("validate", null)
  }
}
