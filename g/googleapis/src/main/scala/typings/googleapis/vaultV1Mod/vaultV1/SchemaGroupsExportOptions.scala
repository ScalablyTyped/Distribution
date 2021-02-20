package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for groups export.
  */
@js.native
trait SchemaGroupsExportOptions extends StObject {
  
  /**
    * The export format for groups export.
    */
  var exportFormat: js.UndefOr[String] = js.native
}
object SchemaGroupsExportOptions {
  
  @scala.inline
  def apply(): SchemaGroupsExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupsExportOptions]
  }
  
  @scala.inline
  implicit class SchemaGroupsExportOptionsMutableBuilder[Self <: SchemaGroupsExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
