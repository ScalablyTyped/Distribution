package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pair Property / Value.
  */
@js.native
trait SchemaPropertyValue extends StObject {
  
  /**
    * A property.
    */
  var property: js.UndefOr[String] = js.native
  
  /**
    * The property&#39;s value.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaPropertyValue {
  
  @scala.inline
  def apply(): SchemaPropertyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyValue]
  }
  
  @scala.inline
  implicit class SchemaPropertyValueMutableBuilder[Self <: SchemaPropertyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
