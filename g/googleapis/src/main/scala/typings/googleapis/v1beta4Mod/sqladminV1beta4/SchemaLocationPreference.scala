package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Preferred location. This specifies where a Cloud SQL instance should
  * preferably be located, either in a specific Compute Engine zone, or
  * co-located with an App Engine application. Note that if the preferred
  * location is not available, the instance will be located as close as
  * possible within the region. Only one location may be specified.
  */
@js.native
trait SchemaLocationPreference extends StObject {
  
  /**
    * The AppEngine application to follow, it must be in the same region as the
    * Cloud SQL instance.
    */
  var followGaeApplication: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#locationPreference.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The preferred Compute Engine zone (e.g. us-central1-a, us-central1-b,
    * etc.).
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaLocationPreference {
  
  @scala.inline
  def apply(): SchemaLocationPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationPreference]
  }
  
  @scala.inline
  implicit class SchemaLocationPreferenceMutableBuilder[Self <: SchemaLocationPreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowGaeApplication(value: String): Self = StObject.set(x, "followGaeApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowGaeApplicationUndefined: Self = StObject.set(x, "followGaeApplication", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
