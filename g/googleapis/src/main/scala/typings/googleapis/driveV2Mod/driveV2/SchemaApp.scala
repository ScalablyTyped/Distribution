package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The apps resource provides a list of the apps that a user has installed,
  * with information about each app&#39;s supported MIME types, file
  * extensions, and other details.
  */
@js.native
trait SchemaApp extends js.Object {
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
  def apply(
    authorized: js.UndefOr[Boolean] = js.undefined,
    createInFolderTemplate: String = null,
    createUrl: String = null,
    hasDriveWideScope: js.UndefOr[Boolean] = js.undefined,
    icons: js.Array[Category] = null,
    id: String = null,
    installed: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    longDescription: String = null,
    name: String = null,
    objectType: String = null,
    openUrlTemplate: String = null,
    primaryFileExtensions: js.Array[String] = null,
    primaryMimeTypes: js.Array[String] = null,
    productId: String = null,
    productUrl: String = null,
    secondaryFileExtensions: js.Array[String] = null,
    secondaryMimeTypes: js.Array[String] = null,
    shortDescription: String = null,
    supportsCreate: js.UndefOr[Boolean] = js.undefined,
    supportsImport: js.UndefOr[Boolean] = js.undefined,
    supportsMultiOpen: js.UndefOr[Boolean] = js.undefined,
    supportsOfflineCreate: js.UndefOr[Boolean] = js.undefined,
    useByDefault: js.UndefOr[Boolean] = js.undefined
  ): SchemaApp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(authorized)) __obj.updateDynamic("authorized")(authorized.get.asInstanceOf[js.Any])
    if (createInFolderTemplate != null) __obj.updateDynamic("createInFolderTemplate")(createInFolderTemplate.asInstanceOf[js.Any])
    if (createUrl != null) __obj.updateDynamic("createUrl")(createUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDriveWideScope)) __obj.updateDynamic("hasDriveWideScope")(hasDriveWideScope.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(installed)) __obj.updateDynamic("installed")(installed.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (longDescription != null) __obj.updateDynamic("longDescription")(longDescription.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (openUrlTemplate != null) __obj.updateDynamic("openUrlTemplate")(openUrlTemplate.asInstanceOf[js.Any])
    if (primaryFileExtensions != null) __obj.updateDynamic("primaryFileExtensions")(primaryFileExtensions.asInstanceOf[js.Any])
    if (primaryMimeTypes != null) __obj.updateDynamic("primaryMimeTypes")(primaryMimeTypes.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productUrl != null) __obj.updateDynamic("productUrl")(productUrl.asInstanceOf[js.Any])
    if (secondaryFileExtensions != null) __obj.updateDynamic("secondaryFileExtensions")(secondaryFileExtensions.asInstanceOf[js.Any])
    if (secondaryMimeTypes != null) __obj.updateDynamic("secondaryMimeTypes")(secondaryMimeTypes.asInstanceOf[js.Any])
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsCreate)) __obj.updateDynamic("supportsCreate")(supportsCreate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsImport)) __obj.updateDynamic("supportsImport")(supportsImport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsMultiOpen)) __obj.updateDynamic("supportsMultiOpen")(supportsMultiOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsOfflineCreate)) __obj.updateDynamic("supportsOfflineCreate")(supportsOfflineCreate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useByDefault)) __obj.updateDynamic("useByDefault")(useByDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApp]
  }
}

