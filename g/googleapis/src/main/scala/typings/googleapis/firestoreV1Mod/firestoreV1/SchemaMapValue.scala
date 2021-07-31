package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A map value.
  */
trait SchemaMapValue extends StObject {
  
  /**
    * The map&#39;s fields.  The map keys represent field names. Field names
    * matching the regular expression `__.*__` are reserved. Reserved field
    * names are forbidden except in certain documented contexts. The map keys,
    * represented as UTF-8, must not exceed 1,500 bytes and cannot be empty.
    */
  var fields: js.UndefOr[StringDictionary[SchemaValue]] = js.undefined
}
object SchemaMapValue {
  
  @scala.inline
  def apply(): SchemaMapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapValue]
  }
  
  @scala.inline
  implicit class SchemaMapValueMutableBuilder[Self <: SchemaMapValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[SchemaValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
