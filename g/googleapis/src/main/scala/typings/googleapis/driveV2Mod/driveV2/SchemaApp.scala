package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The apps resource provides a list of the apps that a user has installed,
  * with information about each app&#39;s supported MIME types, file
  * extensions, and other details.
  */
trait SchemaApp extends StObject {
  
  /**
    * Whether the app is authorized to access data on the user&#39;s Drive.
    */
  var authorized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The template url to create a new file with this app in a given folder.
    * The template will contain {folderId} to be replaced by the folder to
    * create the new file in.
    */
  var createInFolderTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * The url to create a new file with this app.
    */
  var createUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the app has drive-wide scope. An app with drive-wide scope can
    * access all files in the user&#39;s drive.
    */
  var hasDriveWideScope: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The various icons for the app.
    */
  var icons: js.UndefOr[js.Array[Category]] = js.undefined
  
  /**
    * The ID of the app.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the app is installed.
    */
  var installed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is always drive#app.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A long description of the app.
    */
  var longDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the app.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of object this app creates (e.g. Chart). If empty, the app name
    * should be used instead.
    */
  var objectType: js.UndefOr[String] = js.undefined
  
  /**
    * The template url for opening files with this app. The template will
    * contain {ids} and/or {exportIds} to be replaced by the actual file ids.
    * See  Open Files  for the full documentation.
    */
  var openUrlTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * The list of primary file extensions.
    */
  var primaryFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of primary mime types.
    */
  var primaryMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ID of the product listing for this app.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the product listing for this app.
    */
  var productUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The list of secondary file extensions.
    */
  var secondaryFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of secondary mime types.
    */
  var secondaryMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A short description of the app.
    */
  var shortDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this app supports creating new objects.
    */
  var supportsCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this app supports importing Google Docs.
    */
  var supportsImport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this app supports opening more than one file.
    */
  var supportsMultiOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this app supports creating new files when offline.
    */
  var supportsOfflineCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the app is selected as the default handler for the types it
    * supports.
    */
  var useByDefault: js.UndefOr[Boolean] = js.undefined
}
object SchemaApp {
  
  inline def apply(): SchemaApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApp]
  }
  
  extension [Self <: SchemaApp](x: Self) {
    
    inline def setAuthorized(value: Boolean): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
    
    inline def setCreateInFolderTemplate(value: String): Self = StObject.set(x, "createInFolderTemplate", value.asInstanceOf[js.Any])
    
    inline def setCreateInFolderTemplateUndefined: Self = StObject.set(x, "createInFolderTemplate", js.undefined)
    
    inline def setCreateUrl(value: String): Self = StObject.set(x, "createUrl", value.asInstanceOf[js.Any])
    
    inline def setCreateUrlUndefined: Self = StObject.set(x, "createUrl", js.undefined)
    
    inline def setHasDriveWideScope(value: Boolean): Self = StObject.set(x, "hasDriveWideScope", value.asInstanceOf[js.Any])
    
    inline def setHasDriveWideScopeUndefined: Self = StObject.set(x, "hasDriveWideScope", js.undefined)
    
    inline def setIcons(value: js.Array[Category]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIconsVarargs(value: Category*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstalled(value: Boolean): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
    
    inline def setInstalledUndefined: Self = StObject.set(x, "installed", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    inline def setLongDescriptionUndefined: Self = StObject.set(x, "longDescription", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOpenUrlTemplate(value: String): Self = StObject.set(x, "openUrlTemplate", value.asInstanceOf[js.Any])
    
    inline def setOpenUrlTemplateUndefined: Self = StObject.set(x, "openUrlTemplate", js.undefined)
    
    inline def setPrimaryFileExtensions(value: js.Array[String]): Self = StObject.set(x, "primaryFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryFileExtensionsUndefined: Self = StObject.set(x, "primaryFileExtensions", js.undefined)
    
    inline def setPrimaryFileExtensionsVarargs(value: String*): Self = StObject.set(x, "primaryFileExtensions", js.Array(value :_*))
    
    inline def setPrimaryMimeTypes(value: js.Array[String]): Self = StObject.set(x, "primaryMimeTypes", value.asInstanceOf[js.Any])
    
    inline def setPrimaryMimeTypesUndefined: Self = StObject.set(x, "primaryMimeTypes", js.undefined)
    
    inline def setPrimaryMimeTypesVarargs(value: String*): Self = StObject.set(x, "primaryMimeTypes", js.Array(value :_*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductUrl(value: String): Self = StObject.set(x, "productUrl", value.asInstanceOf[js.Any])
    
    inline def setProductUrlUndefined: Self = StObject.set(x, "productUrl", js.undefined)
    
    inline def setSecondaryFileExtensions(value: js.Array[String]): Self = StObject.set(x, "secondaryFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setSecondaryFileExtensionsUndefined: Self = StObject.set(x, "secondaryFileExtensions", js.undefined)
    
    inline def setSecondaryFileExtensionsVarargs(value: String*): Self = StObject.set(x, "secondaryFileExtensions", js.Array(value :_*))
    
    inline def setSecondaryMimeTypes(value: js.Array[String]): Self = StObject.set(x, "secondaryMimeTypes", value.asInstanceOf[js.Any])
    
    inline def setSecondaryMimeTypesUndefined: Self = StObject.set(x, "secondaryMimeTypes", js.undefined)
    
    inline def setSecondaryMimeTypesVarargs(value: String*): Self = StObject.set(x, "secondaryMimeTypes", js.Array(value :_*))
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setSupportsCreate(value: Boolean): Self = StObject.set(x, "supportsCreate", value.asInstanceOf[js.Any])
    
    inline def setSupportsCreateUndefined: Self = StObject.set(x, "supportsCreate", js.undefined)
    
    inline def setSupportsImport(value: Boolean): Self = StObject.set(x, "supportsImport", value.asInstanceOf[js.Any])
    
    inline def setSupportsImportUndefined: Self = StObject.set(x, "supportsImport", js.undefined)
    
    inline def setSupportsMultiOpen(value: Boolean): Self = StObject.set(x, "supportsMultiOpen", value.asInstanceOf[js.Any])
    
    inline def setSupportsMultiOpenUndefined: Self = StObject.set(x, "supportsMultiOpen", js.undefined)
    
    inline def setSupportsOfflineCreate(value: Boolean): Self = StObject.set(x, "supportsOfflineCreate", value.asInstanceOf[js.Any])
    
    inline def setSupportsOfflineCreateUndefined: Self = StObject.set(x, "supportsOfflineCreate", js.undefined)
    
    inline def setUseByDefault(value: Boolean): Self = StObject.set(x, "useByDefault", value.asInstanceOf[js.Any])
    
    inline def setUseByDefaultUndefined: Self = StObject.set(x, "useByDefault", js.undefined)
  }
}
