package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickThroughUrlSuffixProperties extends StObject {
  
  /** Click-through URL suffix to apply to all ads in this entity's scope. Must be less than 128 characters long. */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.undefined
  
  /** Whether this entity should override the inherited click-through URL suffix with its own defined value. */
  var overrideInheritedSuffix: js.UndefOr[Boolean] = js.undefined
}
object ClickThroughUrlSuffixProperties {
  
  @scala.inline
  def apply(): ClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickThroughUrlSuffixProperties]
  }
  
  @scala.inline
  implicit class ClickThroughUrlSuffixPropertiesMutableBuilder[Self <: ClickThroughUrlSuffixProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThroughUrlSuffix(value: String): Self = StObject.set(x, "clickThroughUrlSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlSuffixUndefined: Self = StObject.set(x, "clickThroughUrlSuffix", js.undefined)
    
    @scala.inline
    def setOverrideInheritedSuffix(value: Boolean): Self = StObject.set(x, "overrideInheritedSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideInheritedSuffixUndefined: Self = StObject.set(x, "overrideInheritedSuffix", js.undefined)
  }
}
