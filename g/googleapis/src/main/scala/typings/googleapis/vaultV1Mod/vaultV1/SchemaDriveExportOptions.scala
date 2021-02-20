package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for Drive export.
  */
@js.native
trait SchemaDriveExportOptions extends StObject {
  
  /**
    * Set to true to include access level information for users with &lt;a
    * href=&quot;https://support.google.com/vault/answer/6099459#metadata&quot;&gt;indirect
    * access&lt;/a&gt; to files.
    */
  var includeAccessInfo: js.UndefOr[Boolean] = js.native
}
object SchemaDriveExportOptions {
  
  @scala.inline
  def apply(): SchemaDriveExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveExportOptions]
  }
  
  @scala.inline
  implicit class SchemaDriveExportOptionsMutableBuilder[Self <: SchemaDriveExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAccessInfo(value: Boolean): Self = StObject.set(x, "includeAccessInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAccessInfoUndefined: Self = StObject.set(x, "includeAccessInfo", js.undefined)
  }
}
