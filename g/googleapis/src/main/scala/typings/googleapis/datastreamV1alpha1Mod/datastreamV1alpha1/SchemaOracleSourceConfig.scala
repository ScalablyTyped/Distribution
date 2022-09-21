package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOracleSourceConfig extends StObject {
  
  /**
    * Oracle objects to include in the stream.
    */
  var allowlist: js.UndefOr[SchemaOracleRdbms] = js.undefined
  
  /**
    * Drop large object values.
    */
  var dropLargeObjects: js.UndefOr[SchemaDropLargeObjects] = js.undefined
  
  /**
    * Oracle objects to exclude from the stream.
    */
  var rejectlist: js.UndefOr[SchemaOracleRdbms] = js.undefined
}
object SchemaOracleSourceConfig {
  
  inline def apply(): SchemaOracleSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOracleSourceConfig]
  }
  
  extension [Self <: SchemaOracleSourceConfig](x: Self) {
    
    inline def setAllowlist(value: SchemaOracleRdbms): Self = StObject.set(x, "allowlist", value.asInstanceOf[js.Any])
    
    inline def setAllowlistUndefined: Self = StObject.set(x, "allowlist", js.undefined)
    
    inline def setDropLargeObjects(value: SchemaDropLargeObjects): Self = StObject.set(x, "dropLargeObjects", value.asInstanceOf[js.Any])
    
    inline def setDropLargeObjectsUndefined: Self = StObject.set(x, "dropLargeObjects", js.undefined)
    
    inline def setRejectlist(value: SchemaOracleRdbms): Self = StObject.set(x, "rejectlist", value.asInstanceOf[js.Any])
    
    inline def setRejectlistUndefined: Self = StObject.set(x, "rejectlist", js.undefined)
  }
}
