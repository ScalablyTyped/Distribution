package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiffDownloadResponse extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectLocation: js.UndefOr[SchemaCompositeMedia] = js.undefined
}
object SchemaDiffDownloadResponse {
  
  inline def apply(): SchemaDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiffDownloadResponse]
  }
  
  extension [Self <: SchemaDiffDownloadResponse](x: Self) {
    
    inline def setObjectLocation(value: SchemaCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    inline def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
  }
}
