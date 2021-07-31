package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an externalId entry.
  */
trait SchemaUserExternalId extends StObject {
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the Id.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the id.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaUserExternalId {
  
  @scala.inline
  def apply(): SchemaUserExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserExternalId]
  }
  
  @scala.inline
  implicit class SchemaUserExternalIdMutableBuilder[Self <: SchemaUserExternalId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
