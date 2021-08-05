package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedProperty extends StObject {
  
  /** The default value of the property. BUNDLE_ARRAY properties don't have a default value. */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  /** A longer description of the property, providing more detail of what it affects. Localized. */
  var description: js.UndefOr[String] = js.undefined
  
  /** For CHOICE or MULTISELECT properties, the list of possible entries. */
  var entries: js.UndefOr[js.Array[ManagedPropertyEntry]] = js.undefined
  
  /** The unique key that the app uses to identify the property, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[String] = js.undefined
  
  /** For BUNDLE_ARRAY properties, the list of nested properties. A BUNDLE_ARRAY property is at most two levels deep. */
  var nestedProperties: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  
  /** The name of the property. Localized. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The type of the property. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ManagedProperty {
  
  inline def apply(): ManagedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedProperty]
  }
  
  extension [Self <: ManagedProperty](x: Self) {
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntries(value: js.Array[ManagedPropertyEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: ManagedPropertyEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNestedProperties(value: js.Array[ManagedProperty]): Self = StObject.set(x, "nestedProperties", value.asInstanceOf[js.Any])
    
    inline def setNestedPropertiesUndefined: Self = StObject.set(x, "nestedProperties", js.undefined)
    
    inline def setNestedPropertiesVarargs(value: ManagedProperty*): Self = StObject.set(x, "nestedProperties", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
