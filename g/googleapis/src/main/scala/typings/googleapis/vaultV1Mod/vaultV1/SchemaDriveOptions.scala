package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveOptions extends StObject {
  
  /**
    * Set whether the results include only content encrypted with [Google Workspace Client-side encryption](https://support.google.com/a?p=cse_ov) content, only unencrypted content, or both. Defaults to both. Currently supported for Drive.
    */
  var clientSideEncryptedOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set to **true** to include shared drives.
    */
  var includeSharedDrives: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Set to true to include Team Drive.
    */
  var includeTeamDrives: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Search the current version of the Drive file, but export the contents of the last version saved before 12:00 AM UTC on the specified date. Enter the date in UTC.
    */
  var versionDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveOptions {
  
  inline def apply(): SchemaDriveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveOptions]
  }
  
  extension [Self <: SchemaDriveOptions](x: Self) {
    
    inline def setClientSideEncryptedOption(value: String): Self = StObject.set(x, "clientSideEncryptedOption", value.asInstanceOf[js.Any])
    
    inline def setClientSideEncryptedOptionNull: Self = StObject.set(x, "clientSideEncryptedOption", null)
    
    inline def setClientSideEncryptedOptionUndefined: Self = StObject.set(x, "clientSideEncryptedOption", js.undefined)
    
    inline def setIncludeSharedDrives(value: Boolean): Self = StObject.set(x, "includeSharedDrives", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedDrivesNull: Self = StObject.set(x, "includeSharedDrives", null)
    
    inline def setIncludeSharedDrivesUndefined: Self = StObject.set(x, "includeSharedDrives", js.undefined)
    
    inline def setIncludeTeamDrives(value: Boolean): Self = StObject.set(x, "includeTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDrivesNull: Self = StObject.set(x, "includeTeamDrives", null)
    
    inline def setIncludeTeamDrivesUndefined: Self = StObject.set(x, "includeTeamDrives", js.undefined)
    
    inline def setVersionDate(value: String): Self = StObject.set(x, "versionDate", value.asInstanceOf[js.Any])
    
    inline def setVersionDateNull: Self = StObject.set(x, "versionDate", null)
    
    inline def setVersionDateUndefined: Self = StObject.set(x, "versionDate", js.undefined)
  }
}
