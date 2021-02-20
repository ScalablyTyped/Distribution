package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a website entry.
  */
@js.native
trait SchemaUserWebsite extends StObject {
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  
  /**
    * If this is user&#39;s primary website or not.
    */
  var primary: js.UndefOr[Boolean] = js.native
  
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example website could be of home, work, blog etc. In addition to the
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Website.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaUserWebsite {
  
  @scala.inline
  def apply(): SchemaUserWebsite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserWebsite]
  }
  
  @scala.inline
  implicit class SchemaUserWebsiteMutableBuilder[Self <: SchemaUserWebsite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
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
