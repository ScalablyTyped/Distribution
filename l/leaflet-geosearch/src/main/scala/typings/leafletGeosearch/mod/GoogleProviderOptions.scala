package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleProviderOptions extends StObject {
  
  var bounds: js.UndefOr[String] = js.native
  
  var key: String = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[String] = js.native
}
object GoogleProviderOptions {
  
  @scala.inline
  def apply(key: String): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderOptions]
  }
  
  @scala.inline
  implicit class GoogleProviderOptionsMutableBuilder[Self <: GoogleProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: String): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
