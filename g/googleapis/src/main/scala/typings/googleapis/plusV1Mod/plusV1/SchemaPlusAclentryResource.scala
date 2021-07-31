package typings.googleapis.plusV1Mod.plusV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlusAclentryResource extends StObject {
  
  /**
    * A descriptive name for this entry. Suitable for display.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the entry. For entries of type &quot;person&quot; or
    * &quot;circle&quot;, this is the ID of the resource. For other types, this
    * property is not set.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The type of entry describing to whom access is granted. Possible values
    * are:   - &quot;person&quot; - Access to an individual.  -
    * &quot;circle&quot; - Access to members of a circle.  -
    * &quot;myCircles&quot; - Access to members of all the person&#39;s
    * circles.  - &quot;extendedCircles&quot; - Access to members of all the
    * person&#39;s circles, plus all of the people in their circles.  -
    * &quot;domain&quot; - Access to members of the person&#39;s Google Apps
    * domain.  - &quot;public&quot; - Access to anyone on the web.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaPlusAclentryResource {
  
  @scala.inline
  def apply(): SchemaPlusAclentryResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlusAclentryResource]
  }
  
  @scala.inline
  implicit class SchemaPlusAclentryResourceMutableBuilder[Self <: SchemaPlusAclentryResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
