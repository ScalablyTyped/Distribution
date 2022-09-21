package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInputConfig extends StObject {
  
  /**
    * Google Cloud Storage location where input content is located.
    */
  var gcsSource: js.UndefOr[SchemaGcsSource] = js.undefined
}
object SchemaInputConfig {
  
  inline def apply(): SchemaInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInputConfig]
  }
  
  extension [Self <: SchemaInputConfig](x: Self) {
    
    inline def setGcsSource(value: SchemaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
