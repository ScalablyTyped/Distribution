package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.BackgroundImageLink
import typings.googleapis.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the user, the user&#39;s Drive, and system capabilities.
  */
@js.native
trait SchemaAbout extends js.Object {
  /**
    * Whether the user has installed the requesting app.
    */
  var appInstalled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user can create Team Drives.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * A map of source MIME type to possible targets for all supported exports.
    */
  var exportFormats: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * The currently supported folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of source MIME type to possible targets for all supported imports.
    */
  var importFormats: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#about&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A map of maximum import sizes by MIME type, in bytes.
    */
  var maxImportSizes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The maximum upload size in bytes.
    */
  var maxUploadSize: js.UndefOr[String] = js.native
  /**
    * The user&#39;s storage quota limits and usage. All fields are measured in
    * bytes.
    */
  var storageQuota: js.UndefOr[Limit] = js.native
  /**
    * A list of themes that are supported for Team Drives.
    */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.native
  /**
    * The authenticated user.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaAbout {
  @scala.inline
  def apply(): SchemaAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbout]
  }
  @scala.inline
  implicit class SchemaAboutOps[Self <: SchemaAbout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppInstalled(value: Boolean): Self = this.set("appInstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppInstalled: Self = this.set("appInstalled", js.undefined)
    @scala.inline
    def setCanCreateTeamDrives(value: Boolean): Self = this.set("canCreateTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanCreateTeamDrives: Self = this.set("canCreateTeamDrives", js.undefined)
    @scala.inline
    def setExportFormats(value: StringDictionary[js.Array[String]]): Self = this.set("exportFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportFormats: Self = this.set("exportFormats", js.undefined)
    @scala.inline
    def setFolderColorPaletteVarargs(value: String*): Self = this.set("folderColorPalette", js.Array(value :_*))
    @scala.inline
    def setFolderColorPalette(value: js.Array[String]): Self = this.set("folderColorPalette", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolderColorPalette: Self = this.set("folderColorPalette", js.undefined)
    @scala.inline
    def setImportFormats(value: StringDictionary[js.Array[String]]): Self = this.set("importFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportFormats: Self = this.set("importFormats", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxImportSizes(value: StringDictionary[String]): Self = this.set("maxImportSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxImportSizes: Self = this.set("maxImportSizes", js.undefined)
    @scala.inline
    def setMaxUploadSize(value: String): Self = this.set("maxUploadSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUploadSize: Self = this.set("maxUploadSize", js.undefined)
    @scala.inline
    def setStorageQuota(value: Limit): Self = this.set("storageQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageQuota: Self = this.set("storageQuota", js.undefined)
    @scala.inline
    def setTeamDriveThemesVarargs(value: BackgroundImageLink*): Self = this.set("teamDriveThemes", js.Array(value :_*))
    @scala.inline
    def setTeamDriveThemes(value: js.Array[BackgroundImageLink]): Self = this.set("teamDriveThemes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDriveThemes: Self = this.set("teamDriveThemes", js.undefined)
    @scala.inline
    def setUser(value: SchemaUser): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

