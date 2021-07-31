package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a
  * portion of the value.
  */
trait SchemaGooglePrivacyDlpV2TimePartConfig extends StObject {
  
  var partToExtract: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2TimePartConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimePartConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TimePartConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2TimePartConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartToExtract(value: String): Self = StObject.set(x, "partToExtract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartToExtractUndefined: Self = StObject.set(x, "partToExtract", js.undefined)
  }
}
