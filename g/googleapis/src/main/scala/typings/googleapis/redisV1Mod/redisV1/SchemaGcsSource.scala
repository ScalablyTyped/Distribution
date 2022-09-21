package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcsSource extends StObject {
  
  /**
    * Required. Source data URI. (e.g. 'gs://my_bucket/my_object').
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGcsSource {
  
  inline def apply(): SchemaGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsSource]
  }
  
  extension [Self <: SchemaGcsSource](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
