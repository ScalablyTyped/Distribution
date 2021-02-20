package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCustomAttribute extends StObject {
  
  /**
    * Subattributes within this attribute group. Exactly one of value or
    * groupValues must be provided.
    */
  var groupValues: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.native
  
  /**
    * The name of the attribute. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The value of the attribute.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaCustomAttribute {
  
  @scala.inline
  def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  
  @scala.inline
  implicit class SchemaCustomAttributeMutableBuilder[Self <: SchemaCustomAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupValues(value: js.Array[SchemaCustomAttribute]): Self = StObject.set(x, "groupValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupValuesUndefined: Self = StObject.set(x, "groupValues", js.undefined)
    
    @scala.inline
    def setGroupValuesVarargs(value: SchemaCustomAttribute*): Self = StObject.set(x, "groupValues", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
