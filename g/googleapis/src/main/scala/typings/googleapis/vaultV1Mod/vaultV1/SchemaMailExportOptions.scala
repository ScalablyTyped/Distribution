package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for mail export.
  */
@js.native
trait SchemaMailExportOptions extends StObject {
  
  /**
    * The export file format.
    */
  var exportFormat: js.UndefOr[String] = js.native
  
  /**
    * Set to true to export confidential mode content.
    */
  var showConfidentialModeContent: js.UndefOr[Boolean] = js.native
}
object SchemaMailExportOptions {
  
  @scala.inline
  def apply(): SchemaMailExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailExportOptions]
  }
  
  @scala.inline
  implicit class SchemaMailExportOptionsMutableBuilder[Self <: SchemaMailExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
    
    @scala.inline
    def setShowConfidentialModeContent(value: Boolean): Self = StObject.set(x, "showConfidentialModeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConfidentialModeContentUndefined: Self = StObject.set(x, "showConfidentialModeContent", js.undefined)
  }
}
