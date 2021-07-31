package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Folder&#39;s contents.
  */
trait SchemaFolderEntities extends StObject {
  
  /**
    * The list of tags inside the folder.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.undefined
  
  /**
    * The list of triggers inside the folder.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.undefined
  
  /**
    * The list of variables inside the folder.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
}
object SchemaFolderEntities {
  
  @scala.inline
  def apply(): SchemaFolderEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolderEntities]
  }
  
  @scala.inline
  implicit class SchemaFolderEntitiesMutableBuilder[Self <: SchemaFolderEntities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: js.Array[SchemaTag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: SchemaTag*): Self = StObject.set(x, "tag", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: js.Array[SchemaTrigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: SchemaTrigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[SchemaVariable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: SchemaVariable*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
