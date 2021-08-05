package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Options for job processing.
  */
trait SchemaProcessingOptions extends StObject {
  
  /**
    * Optional.  If set to `true`, the service does not attempt to resolve a
    * more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.  Option for job HTML content sanitization. Applied fields are:
    * * description * applicationInfo.instruction * incentives * qualifications
    * * responsibilities  HTML tags in these fields may be stripped if
    * sanitiazation is not disabled.  Defaults to
    * HtmlSanitization.SIMPLE_FORMATTING_ONLY.
    */
  var htmlSanitization: js.UndefOr[String] = js.undefined
}
object SchemaProcessingOptions {
  
  inline def apply(): SchemaProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProcessingOptions]
  }
  
  extension [Self <: SchemaProcessingOptions](x: Self) {
    
    inline def setDisableStreetAddressResolution(value: Boolean): Self = StObject.set(x, "disableStreetAddressResolution", value.asInstanceOf[js.Any])
    
    inline def setDisableStreetAddressResolutionUndefined: Self = StObject.set(x, "disableStreetAddressResolution", js.undefined)
    
    inline def setHtmlSanitization(value: String): Self = StObject.set(x, "htmlSanitization", value.asInstanceOf[js.Any])
    
    inline def setHtmlSanitizationUndefined: Self = StObject.set(x, "htmlSanitization", js.undefined)
  }
}
