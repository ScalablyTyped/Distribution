package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomGroup extends StObject {
  
  /**
    * The sub-attributes.
    */
  var attributes: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.undefined
  
  /**
    * The name of the group. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaCustomGroup {
  
  @scala.inline
  def apply(): SchemaCustomGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomGroup]
  }
  
  @scala.inline
  implicit class SchemaCustomGroupMutableBuilder[Self <: SchemaCustomGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[SchemaCustomAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: SchemaCustomAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
