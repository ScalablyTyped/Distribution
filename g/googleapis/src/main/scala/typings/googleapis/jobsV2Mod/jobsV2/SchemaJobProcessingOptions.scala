package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobProcessingOptions extends StObject {
  
  /**
    * Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInstruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
    */
  var htmlSanitization: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobProcessingOptions {
  
  inline def apply(): SchemaJobProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobProcessingOptions]
  }
  
  extension [Self <: SchemaJobProcessingOptions](x: Self) {
    
    inline def setDisableStreetAddressResolution(value: Boolean): Self = StObject.set(x, "disableStreetAddressResolution", value.asInstanceOf[js.Any])
    
    inline def setDisableStreetAddressResolutionNull: Self = StObject.set(x, "disableStreetAddressResolution", null)
    
    inline def setDisableStreetAddressResolutionUndefined: Self = StObject.set(x, "disableStreetAddressResolution", js.undefined)
    
    inline def setHtmlSanitization(value: String): Self = StObject.set(x, "htmlSanitization", value.asInstanceOf[js.Any])
    
    inline def setHtmlSanitizationNull: Self = StObject.set(x, "htmlSanitization", null)
    
    inline def setHtmlSanitizationUndefined: Self = StObject.set(x, "htmlSanitization", js.undefined)
  }
}
