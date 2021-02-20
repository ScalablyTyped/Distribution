package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapProviderOptionsResultLanguage extends StObject {
  
  var `accept-language`: js.UndefOr[String] = js.native
}
object OpenStreetMapProviderOptionsResultLanguage {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsResultLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLanguage]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsResultLanguageMutableBuilder[Self <: OpenStreetMapProviderOptionsResultLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAccept-language`(value: String): Self = StObject.set(x, "accept-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAccept-languageUndefined`: Self = StObject.set(x, "accept-language", js.undefined)
  }
}
