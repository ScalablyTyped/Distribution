package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of a finding within a document.
  */
trait SchemaGooglePrivacyDlpV2DocumentLocation extends StObject {
  
  /**
    * Offset of the line, from the beginning of the file, where the finding is
    * located.
    */
  var fileOffset: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2DocumentLocation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DocumentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DocumentLocation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DocumentLocationMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DocumentLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileOffset(value: String): Self = StObject.set(x, "fileOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileOffsetUndefined: Self = StObject.set(x, "fileOffset", js.undefined)
  }
}
