package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about settings changes.
  */
@js.native
trait SchemaSettingsChange extends js.Object {
  
  /**
    * The set of changes made to restrictions.
    */
  var restrictionChanges: js.UndefOr[js.Array[SchemaRestrictionChange]] = js.native
}
object SchemaSettingsChange {
  
  @scala.inline
  def apply(): SchemaSettingsChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettingsChange]
  }
  
  @scala.inline
  implicit class SchemaSettingsChangeOps[Self <: SchemaSettingsChange] (val x: Self) extends AnyVal {
    
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
    def setRestrictionChangesVarargs(value: SchemaRestrictionChange*): Self = this.set("restrictionChanges", js.Array(value :_*))
    
    @scala.inline
    def setRestrictionChanges(value: js.Array[SchemaRestrictionChange]): Self = this.set("restrictionChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictionChanges: Self = this.set("restrictionChanges", js.undefined)
  }
}
