package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultClickThroughEventTagProperties extends StObject {
  
  /** ID of the click-through event tag to apply to all ads in this entity's scope. */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.undefined
  
  /** Whether this entity should override the inherited default click-through event tag with its own defined value. */
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.undefined
}
object DefaultClickThroughEventTagProperties {
  
  inline def apply(): DefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultClickThroughEventTagProperties]
  }
  
  extension [Self <: DefaultClickThroughEventTagProperties](x: Self) {
    
    inline def setDefaultClickThroughEventTagId(value: String): Self = StObject.set(x, "defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    inline def setDefaultClickThroughEventTagIdUndefined: Self = StObject.set(x, "defaultClickThroughEventTagId", js.undefined)
    
    inline def setOverrideInheritedEventTag(value: Boolean): Self = StObject.set(x, "overrideInheritedEventTag", value.asInstanceOf[js.Any])
    
    inline def setOverrideInheritedEventTagUndefined: Self = StObject.set(x, "overrideInheritedEventTag", js.undefined)
  }
}
