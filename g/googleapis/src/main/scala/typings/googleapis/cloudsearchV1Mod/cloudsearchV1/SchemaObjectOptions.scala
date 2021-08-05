package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for an object.
  */
trait SchemaObjectOptions extends StObject {
  
  /**
    * Options that determine how the object is displayed in the Cloud Search
    * results page.
    */
  var displayOptions: js.UndefOr[SchemaObjectDisplayOptions] = js.undefined
  
  /**
    * The freshness options for an object.
    */
  var freshnessOptions: js.UndefOr[SchemaFreshnessOptions] = js.undefined
}
object SchemaObjectOptions {
  
  inline def apply(): SchemaObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectOptions]
  }
  
  extension [Self <: SchemaObjectOptions](x: Self) {
    
    inline def setDisplayOptions(value: SchemaObjectDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    inline def setFreshnessOptions(value: SchemaFreshnessOptions): Self = StObject.set(x, "freshnessOptions", value.asInstanceOf[js.Any])
    
    inline def setFreshnessOptionsUndefined: Self = StObject.set(x, "freshnessOptions", js.undefined)
  }
}
