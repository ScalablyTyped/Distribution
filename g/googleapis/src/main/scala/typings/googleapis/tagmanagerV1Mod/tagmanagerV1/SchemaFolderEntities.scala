package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Folder&#39;s contents.
  */
@js.native
trait SchemaFolderEntities extends js.Object {
  
  /**
    * The list of tags inside the folder.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.native
  
  /**
    * The list of triggers inside the folder.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.native
  
  /**
    * The list of variables inside the folder.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.native
}
object SchemaFolderEntities {
  
  @scala.inline
  def apply(): SchemaFolderEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolderEntities]
  }
  
  @scala.inline
  implicit class SchemaFolderEntitiesOps[Self <: SchemaFolderEntities] (val x: Self) extends AnyVal {
    
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
    def setTagVarargs(value: SchemaTag*): Self = this.set("tag", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: js.Array[SchemaTag]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: SchemaTrigger*): Self = this.set("trigger", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: js.Array[SchemaTrigger]): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: SchemaVariable*): Self = this.set("variable", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[SchemaVariable]): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}
