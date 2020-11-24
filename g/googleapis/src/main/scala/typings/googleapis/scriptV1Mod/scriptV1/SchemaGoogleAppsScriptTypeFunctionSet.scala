package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of functions. No duplicates are permitted.
  */
@js.native
trait SchemaGoogleAppsScriptTypeFunctionSet extends js.Object {
  
  /**
    * A list of functions composing the set.
    */
  var values: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeFunction]] = js.native
}
object SchemaGoogleAppsScriptTypeFunctionSet {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunctionSet]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeFunctionSetOps[Self <: SchemaGoogleAppsScriptTypeFunctionSet] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: SchemaGoogleAppsScriptTypeFunction*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[SchemaGoogleAppsScriptTypeFunction]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
