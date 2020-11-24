package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object was created by copying an existing object.
  */
@js.native
trait SchemaCopy extends js.Object {
  
  /**
    * The the original object.
    */
  var originalObject: js.UndefOr[SchemaTargetReference] = js.native
}
object SchemaCopy {
  
  @scala.inline
  def apply(): SchemaCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopy]
  }
  
  @scala.inline
  implicit class SchemaCopyOps[Self <: SchemaCopy] (val x: Self) extends AnyVal {
    
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
    def setOriginalObject(value: SchemaTargetReference): Self = this.set("originalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalObject: Self = this.set("originalObject", js.undefined)
  }
}
