package typings.googleapis.driveV3Mod.driveV3

import typings.googleapis.anon.CanChangeCopyRequiresWriterPermissionRestriction
import typings.googleapis.anon.CopyRequiresWriterPermission
import typings.googleapis.anon.XCoordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTeamDrive extends StObject {
  
  /**
    * An image file and cropping parameters from which a background image for this Team Drive is set. This is a write only field; it can only be set on drive.teamdrives.update requests that don't set themeId. When specified, all fields of the backgroundImageFile must be set.
    */
  var backgroundImageFile: js.UndefOr[XCoordinate | Null] = js.undefined
  
  /**
    * A short-lived link to this Team Drive's background image.
    */
  var backgroundImageLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Capabilities the current user has on this Team Drive.
    */
  var capabilities: js.UndefOr[CanChangeCopyRequiresWriterPermissionRestriction | Null] = js.undefined
  
  /**
    * The color of this Team Drive as an RGB hex string. It can only be set on a drive.teamdrives.update request that does not set themeId.
    */
  var colorRgb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the Team Drive was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of this Team Drive which is also the ID of the top level folder of this Team Drive.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#teamDrive".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this Team Drive.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The organizational unit of this shared drive. This field is only populated on drives.list responses when the useDomainAdminAccess parameter is set to true.
    */
  var orgUnitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of restrictions that apply to this Team Drive or items inside this Team Drive.
    */
  var restrictions: js.UndefOr[CopyRequiresWriterPermission | Null] = js.undefined
  
  /**
    * The ID of the theme from which the background image and color will be set. The set of possible teamDriveThemes can be retrieved from a drive.about.get response. When not specified on a drive.teamdrives.create request, a random theme is chosen from which the background image and color are set. This is a write-only field; it can only be set on requests that don't set colorRgb or backgroundImageFile.
    */
  var themeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaTeamDrive {
  
  inline def apply(): SchemaTeamDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDrive]
  }
  
  extension [Self <: SchemaTeamDrive](x: Self) {
    
    inline def setBackgroundImageFile(value: XCoordinate): Self = StObject.set(x, "backgroundImageFile", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageFileNull: Self = StObject.set(x, "backgroundImageFile", null)
    
    inline def setBackgroundImageFileUndefined: Self = StObject.set(x, "backgroundImageFile", js.undefined)
    
    inline def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageLinkNull: Self = StObject.set(x, "backgroundImageLink", null)
    
    inline def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
    
    inline def setCapabilities(value: CanChangeCopyRequiresWriterPermissionRestriction): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesNull: Self = StObject.set(x, "capabilities", null)
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
    
    inline def setColorRgbNull: Self = StObject.set(x, "colorRgb", null)
    
    inline def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
    
    inline def setCreatedTime(value: String): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeNull: Self = StObject.set(x, "createdTime", null)
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdNull: Self = StObject.set(x, "orgUnitId", null)
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setRestrictions(value: CopyRequiresWriterPermission): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsNull: Self = StObject.set(x, "restrictions", null)
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setThemeId(value: String): Self = StObject.set(x, "themeId", value.asInstanceOf[js.Any])
    
    inline def setThemeIdNull: Self = StObject.set(x, "themeId", null)
    
    inline def setThemeIdUndefined: Self = StObject.set(x, "themeId", js.undefined)
  }
}
