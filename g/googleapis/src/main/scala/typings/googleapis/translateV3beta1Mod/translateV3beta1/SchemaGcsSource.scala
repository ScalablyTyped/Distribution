package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcsSource extends StObject {
  
  /**
    * Required. Source data URI. For example, `gs://my_bucket/my_object`.
    */
  var inputUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGcsSource {
  
  inline def apply(): SchemaGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsSource]
  }
  
  extension [Self <: SchemaGcsSource](x: Self) {
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriNull: Self = StObject.set(x, "inputUri", null)
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
  }
}
