package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentTypeInfo extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var bestGuess: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var fromBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var fromFileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var fromHeader: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var fromUrlPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentTypeInfo {
  
  inline def apply(): SchemaContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentTypeInfo]
  }
  
  extension [Self <: SchemaContentTypeInfo](x: Self) {
    
    inline def setBestGuess(value: String): Self = StObject.set(x, "bestGuess", value.asInstanceOf[js.Any])
    
    inline def setBestGuessNull: Self = StObject.set(x, "bestGuess", null)
    
    inline def setBestGuessUndefined: Self = StObject.set(x, "bestGuess", js.undefined)
    
    inline def setFromBytes(value: String): Self = StObject.set(x, "fromBytes", value.asInstanceOf[js.Any])
    
    inline def setFromBytesNull: Self = StObject.set(x, "fromBytes", null)
    
    inline def setFromBytesUndefined: Self = StObject.set(x, "fromBytes", js.undefined)
    
    inline def setFromFileName(value: String): Self = StObject.set(x, "fromFileName", value.asInstanceOf[js.Any])
    
    inline def setFromFileNameNull: Self = StObject.set(x, "fromFileName", null)
    
    inline def setFromFileNameUndefined: Self = StObject.set(x, "fromFileName", js.undefined)
    
    inline def setFromHeader(value: String): Self = StObject.set(x, "fromHeader", value.asInstanceOf[js.Any])
    
    inline def setFromHeaderNull: Self = StObject.set(x, "fromHeader", null)
    
    inline def setFromHeaderUndefined: Self = StObject.set(x, "fromHeader", js.undefined)
    
    inline def setFromUrlPath(value: String): Self = StObject.set(x, "fromUrlPath", value.asInstanceOf[js.Any])
    
    inline def setFromUrlPathNull: Self = StObject.set(x, "fromUrlPath", null)
    
    inline def setFromUrlPathUndefined: Self = StObject.set(x, "fromUrlPath", js.undefined)
  }
}
