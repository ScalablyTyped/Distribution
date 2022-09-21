package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcsSource extends StObject {
  
  /**
    * Google Cloud Storage URI for the input file. This must only be a Google Cloud Storage object. Wildcards are not currently supported.
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
