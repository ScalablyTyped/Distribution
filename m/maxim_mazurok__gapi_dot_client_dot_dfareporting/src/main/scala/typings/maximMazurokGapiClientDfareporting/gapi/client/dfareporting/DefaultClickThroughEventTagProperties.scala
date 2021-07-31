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
  
  @scala.inline
  def apply(): DefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultClickThroughEventTagProperties]
  }
  
  @scala.inline
  implicit class DefaultClickThroughEventTagPropertiesMutableBuilder[Self <: DefaultClickThroughEventTagProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultClickThroughEventTagId(value: String): Self = StObject.set(x, "defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultClickThroughEventTagIdUndefined: Self = StObject.set(x, "defaultClickThroughEventTagId", js.undefined)
    
    @scala.inline
    def setOverrideInheritedEventTag(value: Boolean): Self = StObject.set(x, "overrideInheritedEventTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideInheritedEventTagUndefined: Self = StObject.set(x, "overrideInheritedEventTag", js.undefined)
  }
}
