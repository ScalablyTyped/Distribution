package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.BackgroundImageLink
import typings.googleapis.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAbout extends StObject {
  
  /**
    * Whether the user has installed the requesting app.
    */
  var appInstalled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can create shared drives.
    */
  var canCreateDrives: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Deprecated - use canCreateDrives instead.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A list of themes that are supported for shared drives.
    */
  var driveThemes: js.UndefOr[js.Array[BackgroundImageLink] | Null] = js.undefined
  
  /**
    * A map of source MIME type to possible targets for all supported exports.
    */
  var exportFormats: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.undefined
  
  /**
    * The currently supported folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A map of source MIME type to possible targets for all supported imports.
    */
  var importFormats: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#about".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map of maximum import sizes by MIME type, in bytes.
    */
  var maxImportSizes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The maximum upload size in bytes.
    */
  var maxUploadSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's storage quota limits and usage. All fields are measured in bytes.
    */
  var storageQuota: js.UndefOr[Limit | Null] = js.undefined
  
  /**
    * Deprecated - use driveThemes instead.
    */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink] | Null] = js.undefined
  
  /**
    * The authenticated user.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaAbout {
  
  inline def apply(): SchemaAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbout]
  }
  
  extension [Self <: SchemaAbout](x: Self) {
    
    inline def setAppInstalled(value: Boolean): Self = StObject.set(x, "appInstalled", value.asInstanceOf[js.Any])
    
    inline def setAppInstalledNull: Self = StObject.set(x, "appInstalled", null)
    
    inline def setAppInstalledUndefined: Self = StObject.set(x, "appInstalled", js.undefined)
    
    inline def setCanCreateDrives(value: Boolean): Self = StObject.set(x, "canCreateDrives", value.asInstanceOf[js.Any])
    
    inline def setCanCreateDrivesNull: Self = StObject.set(x, "canCreateDrives", null)
    
    inline def setCanCreateDrivesUndefined: Self = StObject.set(x, "canCreateDrives", js.undefined)
    
    inline def setCanCreateTeamDrives(value: Boolean): Self = StObject.set(x, "canCreateTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setCanCreateTeamDrivesNull: Self = StObject.set(x, "canCreateTeamDrives", null)
    
    inline def setCanCreateTeamDrivesUndefined: Self = StObject.set(x, "canCreateTeamDrives", js.undefined)
    
    inline def setDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "driveThemes", value.asInstanceOf[js.Any])
    
    inline def setDriveThemesNull: Self = StObject.set(x, "driveThemes", null)
    
    inline def setDriveThemesUndefined: Self = StObject.set(x, "driveThemes", js.undefined)
    
    inline def setDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "driveThemes", js.Array(value*))
    
    inline def setExportFormats(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    inline def setExportFormatsNull: Self = StObject.set(x, "exportFormats", null)
    
    inline def setExportFormatsUndefined: Self = StObject.set(x, "exportFormats", js.undefined)
    
    inline def setFolderColorPalette(value: js.Array[String]): Self = StObject.set(x, "folderColorPalette", value.asInstanceOf[js.Any])
    
    inline def setFolderColorPaletteNull: Self = StObject.set(x, "folderColorPalette", null)
    
    inline def setFolderColorPaletteUndefined: Self = StObject.set(x, "folderColorPalette", js.undefined)
    
    inline def setFolderColorPaletteVarargs(value: String*): Self = StObject.set(x, "folderColorPalette", js.Array(value*))
    
    inline def setImportFormats(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "importFormats", value.asInstanceOf[js.Any])
    
    inline def setImportFormatsNull: Self = StObject.set(x, "importFormats", null)
    
    inline def setImportFormatsUndefined: Self = StObject.set(x, "importFormats", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxImportSizes(value: StringDictionary[String]): Self = StObject.set(x, "maxImportSizes", value.asInstanceOf[js.Any])
    
    inline def setMaxImportSizesNull: Self = StObject.set(x, "maxImportSizes", null)
    
    inline def setMaxImportSizesUndefined: Self = StObject.set(x, "maxImportSizes", js.undefined)
    
    inline def setMaxUploadSize(value: String): Self = StObject.set(x, "maxUploadSize", value.asInstanceOf[js.Any])
    
    inline def setMaxUploadSizeNull: Self = StObject.set(x, "maxUploadSize", null)
    
    inline def setMaxUploadSizeUndefined: Self = StObject.set(x, "maxUploadSize", js.undefined)
    
    inline def setStorageQuota(value: Limit): Self = StObject.set(x, "storageQuota", value.asInstanceOf[js.Any])
    
    inline def setStorageQuotaNull: Self = StObject.set(x, "storageQuota", null)
    
    inline def setStorageQuotaUndefined: Self = StObject.set(x, "storageQuota", js.undefined)
    
    inline def setTeamDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "teamDriveThemes", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveThemesNull: Self = StObject.set(x, "teamDriveThemes", null)
    
    inline def setTeamDriveThemesUndefined: Self = StObject.set(x, "teamDriveThemes", js.undefined)
    
    inline def setTeamDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "teamDriveThemes", js.Array(value*))
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
