package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountLabel extends StObject {
  
  /**
    * Immutable. The ID of account this label belongs to.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of this label.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ID of the label.
    */
  var labelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of this label.
    */
  var labelType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of this label.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountLabel {
  
  inline def apply(): SchemaAccountLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountLabel]
  }
  
  extension [Self <: SchemaAccountLabel](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    inline def setLabelType(value: String): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    inline def setLabelTypeNull: Self = StObject.set(x, "labelType", null)
    
    inline def setLabelTypeUndefined: Self = StObject.set(x, "labelType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
