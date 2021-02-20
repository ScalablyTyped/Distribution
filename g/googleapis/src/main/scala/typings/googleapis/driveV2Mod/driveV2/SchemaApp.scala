package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The apps resource provides a list of the apps that a user has installed,
  * with information about each app&#39;s supported MIME types, file
  * extensions, and other details.
  */
@js.native
trait SchemaApp extends StObject {
  
  /**
    * Whether the app is authorized to access data on the user&#39;s Drive.
    */
  var authorized: js.UndefOr[Boolean] = js.native
  
  /**
    * The template url to create a new file with this app in a given folder.
    * The template will contain {folderId} to be replaced by the folder to
    * create the new file in.
    */
  var createInFolderTemplate: js.UndefOr[String] = js.native
  
  /**
    * The url to create a new file with this app.
    */
  var createUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether the app has drive-wide scope. An app with drive-wide scope can
    * access all files in the user&#39;s drive.
    */
  var hasDriveWideScope: js.UndefOr[Boolean] = js.native
  
  /**
    * The various icons for the app.
    */
  var icons: js.UndefOr[js.Array[Category]] = js.native
  
  /**
    * The ID of the app.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether the app is installed.
    */
  var installed: js.UndefOr[Boolean] = js.native
  
  /**
    * This is always drive#app.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A long description of the app.
    */
  var longDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the app.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of object this app creates (e.g. Chart). If empty, the app name
    * should be used instead.
    */
  var objectType: js.UndefOr[String] = js.native
  
  /**
    * The template url for opening files with this app. The template will
    * contain {ids} and/or {exportIds} to be replaced by the actual file ids.
    * See  Open Files  for the full documentation.
    */
  var openUrlTemplate: js.UndefOr[String] = js.native
  
  /**
    * The list of primary file extensions.
    */
  var primaryFileExtensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of primary mime types.
    */
  var primaryMimeTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The ID of the product listing for this app.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * A link to the product listing for this app.
    */
  var productUrl: js.UndefOr[String] = js.native
  
  /**
    * The list of secondary file extensions.
    */
  var secondaryFileExtensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of secondary mime types.
    */
  var secondaryMimeTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A short description of the app.
    */
  var shortDescription: js.UndefOr[String] = js.native
  
  /**
    * Whether this app supports creating new objects.
    */
  var supportsCreate: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this app supports importing Google Docs.
    */
  var supportsImport: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this app supports opening more than one file.
    */
  var supportsMultiOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this app supports creating new files when offline.
    */
  var supportsOfflineCreate: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the app is selected as the default handler for the types it
    * supports.
    */
  var useByDefault: js.UndefOr[Boolean] = js.native
}
object SchemaApp {
  
  @scala.inline
  def apply(): SchemaApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApp]
  }
  
  @scala.inline
  implicit class SchemaAppMutableBuilder[Self <: SchemaApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorized(value: Boolean): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
    
    @scala.inline
    def setCreateInFolderTemplate(value: String): Self = StObject.set(x, "createInFolderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateInFolderTemplateUndefined: Self = StObject.set(x, "createInFolderTemplate", js.undefined)
    
    @scala.inline
    def setCreateUrl(value: String): Self = StObject.set(x, "createUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUrlUndefined: Self = StObject.set(x, "createUrl", js.undefined)
    
    @scala.inline
    def setHasDriveWideScope(value: Boolean): Self = StObject.set(x, "hasDriveWideScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDriveWideScopeUndefined: Self = StObject.set(x, "hasDriveWideScope", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Array[Category]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIconsVarargs(value: Category*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstalled(value: Boolean): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledUndefined: Self = StObject.set(x, "installed", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDescriptionUndefined: Self = StObject.set(x, "longDescription", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setOpenUrlTemplate(value: String): Self = StObject.set(x, "openUrlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUrlTemplateUndefined: Self = StObject.set(x, "openUrlTemplate", js.undefined)
    
    @scala.inline
    def setPrimaryFileExtensions(value: js.Array[String]): Self = StObject.set(x, "primaryFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryFileExtensionsUndefined: Self = StObject.set(x, "primaryFileExtensions", js.undefined)
    
    @scala.inline
    def setPrimaryFileExtensionsVarargs(value: String*): Self = StObject.set(x, "primaryFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryMimeTypes(value: js.Array[String]): Self = StObject.set(x, "primaryMimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryMimeTypesUndefined: Self = StObject.set(x, "primaryMimeTypes", js.undefined)
    
    @scala.inline
    def setPrimaryMimeTypesVarargs(value: String*): Self = StObject.set(x, "primaryMimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductUrl(value: String): Self = StObject.set(x, "productUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUrlUndefined: Self = StObject.set(x, "productUrl", js.undefined)
    
    @scala.inline
    def setSecondaryFileExtensions(value: js.Array[String]): Self = StObject.set(x, "secondaryFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryFileExtensionsUndefined: Self = StObject.set(x, "secondaryFileExtensions", js.undefined)
    
    @scala.inline
    def setSecondaryFileExtensionsVarargs(value: String*): Self = StObject.set(x, "secondaryFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryMimeTypes(value: js.Array[String]): Self = StObject.set(x, "secondaryMimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryMimeTypesUndefined: Self = StObject.set(x, "secondaryMimeTypes", js.undefined)
    
    @scala.inline
    def setSecondaryMimeTypesVarargs(value: String*): Self = StObject.set(x, "secondaryMimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    @scala.inline
    def setSupportsCreate(value: Boolean): Self = StObject.set(x, "supportsCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsCreateUndefined: Self = StObject.set(x, "supportsCreate", js.undefined)
    
    @scala.inline
    def setSupportsImport(value: Boolean): Self = StObject.set(x, "supportsImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsImportUndefined: Self = StObject.set(x, "supportsImport", js.undefined)
    
    @scala.inline
    def setSupportsMultiOpen(value: Boolean): Self = StObject.set(x, "supportsMultiOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsMultiOpenUndefined: Self = StObject.set(x, "supportsMultiOpen", js.undefined)
    
    @scala.inline
    def setSupportsOfflineCreate(value: Boolean): Self = StObject.set(x, "supportsOfflineCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsOfflineCreateUndefined: Self = StObject.set(x, "supportsOfflineCreate", js.undefined)
    
    @scala.inline
    def setUseByDefault(value: Boolean): Self = StObject.set(x, "useByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseByDefaultUndefined: Self = StObject.set(x, "useByDefault", js.undefined)
  }
}
