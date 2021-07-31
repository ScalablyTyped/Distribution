package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Options for job processing.
  */
trait SchemaJobProcessingOptions extends StObject {
  
  /**
    * Optional.  If set to `true`, the service does not attempt to resolve a
    * more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.  Option for job HTML content sanitization. Applied fields are:
    * * description * applicationInstruction * incentives * qualifications *
    * responsibilities  HTML tags in these fields may be stripped if
    * sanitiazation is not disabled.  Defaults to
    * HtmlSanitization.SIMPLE_FORMATTING_ONLY.
    */
  var htmlSanitization: js.UndefOr[String] = js.undefined
}
object SchemaJobProcessingOptions {
  
  @scala.inline
  def apply(): SchemaJobProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobProcessingOptions]
  }
  
  @scala.inline
  implicit class SchemaJobProcessingOptionsMutableBuilder[Self <: SchemaJobProcessingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableStreetAddressResolution(value: Boolean): Self = StObject.set(x, "disableStreetAddressResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStreetAddressResolutionUndefined: Self = StObject.set(x, "disableStreetAddressResolution", js.undefined)
    
    @scala.inline
    def setHtmlSanitization(value: String): Self = StObject.set(x, "htmlSanitization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlSanitizationUndefined: Self = StObject.set(x, "htmlSanitization", js.undefined)
  }
}
