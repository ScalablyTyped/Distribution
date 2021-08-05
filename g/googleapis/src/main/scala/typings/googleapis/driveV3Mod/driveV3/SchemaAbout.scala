package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.BackgroundImageLink
import typings.googleapis.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the user, the user&#39;s Drive, and system capabilities.
  */
trait SchemaAbout extends StObject {
  
  /**
    * Whether the user has installed the requesting app.
    */
  var appInstalled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the user can create Team Drives.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A map of source MIME type to possible targets for all supported exports.
    */
  var exportFormats: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  /**
    * The currently supported folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A map of source MIME type to possible targets for all supported imports.
    */
  var importFormats: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#about&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A map of maximum import sizes by MIME type, in bytes.
    */
  var maxImportSizes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The maximum upload size in bytes.
    */
  var maxUploadSize: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s storage quota limits and usage. All fields are measured in
    * bytes.
    */
  var storageQuota: js.UndefOr[Limit] = js.undefined
  
  /**
    * A list of themes that are supported for Team Drives.
    */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.undefined
  
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
    
    inline def setAppInstalledUndefined: Self = StObject.set(x, "appInstalled", js.undefined)
    
    inline def setCanCreateTeamDrives(value: Boolean): Self = StObject.set(x, "canCreateTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setCanCreateTeamDrivesUndefined: Self = StObject.set(x, "canCreateTeamDrives", js.undefined)
    
    inline def setExportFormats(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    inline def setExportFormatsUndefined: Self = StObject.set(x, "exportFormats", js.undefined)
    
    inline def setFolderColorPalette(value: js.Array[String]): Self = StObject.set(x, "folderColorPalette", value.asInstanceOf[js.Any])
    
    inline def setFolderColorPaletteUndefined: Self = StObject.set(x, "folderColorPalette", js.undefined)
    
    inline def setFolderColorPaletteVarargs(value: String*): Self = StObject.set(x, "folderColorPalette", js.Array(value :_*))
    
    inline def setImportFormats(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "importFormats", value.asInstanceOf[js.Any])
    
    inline def setImportFormatsUndefined: Self = StObject.set(x, "importFormats", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxImportSizes(value: StringDictionary[String]): Self = StObject.set(x, "maxImportSizes", value.asInstanceOf[js.Any])
    
    inline def setMaxImportSizesUndefined: Self = StObject.set(x, "maxImportSizes", js.undefined)
    
    inline def setMaxUploadSize(value: String): Self = StObject.set(x, "maxUploadSize", value.asInstanceOf[js.Any])
    
    inline def setMaxUploadSizeUndefined: Self = StObject.set(x, "maxUploadSize", js.undefined)
    
    inline def setStorageQuota(value: Limit): Self = StObject.set(x, "storageQuota", value.asInstanceOf[js.Any])
    
    inline def setStorageQuotaUndefined: Self = StObject.set(x, "storageQuota", js.undefined)
    
    inline def setTeamDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "teamDriveThemes", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveThemesUndefined: Self = StObject.set(x, "teamDriveThemes", js.undefined)
    
    inline def setTeamDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "teamDriveThemes", js.Array(value :_*))
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
