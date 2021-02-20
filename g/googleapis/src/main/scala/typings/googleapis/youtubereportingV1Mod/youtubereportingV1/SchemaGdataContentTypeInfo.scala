package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataContentTypeInfo extends StObject {
  
  /**
    * gdata
    */
  var bestGuess: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var fromBytes: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var fromFileName: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var fromHeader: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var fromUrlPath: js.UndefOr[String] = js.native
}
object SchemaGdataContentTypeInfo {
  
  @scala.inline
  def apply(): SchemaGdataContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataContentTypeInfo]
  }
  
  @scala.inline
  implicit class SchemaGdataContentTypeInfoMutableBuilder[Self <: SchemaGdataContentTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBestGuess(value: String): Self = StObject.set(x, "bestGuess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestGuessUndefined: Self = StObject.set(x, "bestGuess", js.undefined)
    
    @scala.inline
    def setFromBytes(value: String): Self = StObject.set(x, "fromBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromBytesUndefined: Self = StObject.set(x, "fromBytes", js.undefined)
    
    @scala.inline
    def setFromFileName(value: String): Self = StObject.set(x, "fromFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromFileNameUndefined: Self = StObject.set(x, "fromFileName", js.undefined)
    
    @scala.inline
    def setFromHeader(value: String): Self = StObject.set(x, "fromHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromHeaderUndefined: Self = StObject.set(x, "fromHeader", js.undefined)
    
    @scala.inline
    def setFromUrlPath(value: String): Self = StObject.set(x, "fromUrlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUrlPathUndefined: Self = StObject.set(x, "fromUrlPath", js.undefined)
  }
}
