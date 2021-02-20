package typings.googleapis.driveV3Mod.driveV3

import typings.googleapis.anon.AdminManagedRestrictions
import typings.googleapis.anon.CanChangeCopyRequiresWriterPermissionRestriction
import typings.googleapis.anon.XCoordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a Team Drive.
  */
@js.native
trait SchemaTeamDrive extends StObject {
  
  /**
    * An image file and cropping parameters from which a background image for
    * this Team Drive is set. This is a write only field; it can only be set on
    * drive.teamdrives.update requests that don&#39;t set themeId. When
    * specified, all fields of the backgroundImageFile must be set.
    */
  var backgroundImageFile: js.UndefOr[XCoordinate] = js.native
  
  /**
    * A short-lived link to this Team Drive&#39;s background image.
    */
  var backgroundImageLink: js.UndefOr[String] = js.native
  
  /**
    * Capabilities the current user has on this Team Drive.
    */
  var capabilities: js.UndefOr[CanChangeCopyRequiresWriterPermissionRestriction] = js.native
  
  /**
    * The color of this Team Drive as an RGB hex string. It can only be set on
    * a drive.teamdrives.update request that does not set themeId.
    */
  var colorRgb: js.UndefOr[String] = js.native
  
  /**
    * The time at which the Team Drive was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String] = js.native
  
  /**
    * The ID of this Team Drive which is also the ID of the top level folder of
    * this Team Drive.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#teamDrive&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of this Team Drive.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A set of restrictions that apply to this Team Drive or items inside this
    * Team Drive.
    */
  var restrictions: js.UndefOr[AdminManagedRestrictions] = js.native
  
  /**
    * The ID of the theme from which the background image and color will be
    * set. The set of possible teamDriveThemes can be retrieved from a
    * drive.about.get response. When not specified on a drive.teamdrives.create
    * request, a random theme is chosen from which the background image and
    * color are set. This is a write-only field; it can only be set on requests
    * that don&#39;t set colorRgb or backgroundImageFile.
    */
  var themeId: js.UndefOr[String] = js.native
}
object SchemaTeamDrive {
  
  @scala.inline
  def apply(): SchemaTeamDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDrive]
  }
  
  @scala.inline
  implicit class SchemaTeamDriveMutableBuilder[Self <: SchemaTeamDrive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundImageFile(value: XCoordinate): Self = StObject.set(x, "backgroundImageFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageFileUndefined: Self = StObject.set(x, "backgroundImageFile", js.undefined)
    
    @scala.inline
    def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
    
    @scala.inline
    def setCapabilities(value: CanChangeCopyRequiresWriterPermissionRestriction): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: String): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRestrictions(value: AdminManagedRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setThemeId(value: String): Self = StObject.set(x, "themeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeIdUndefined: Self = StObject.set(x, "themeId", js.undefined)
  }
}
