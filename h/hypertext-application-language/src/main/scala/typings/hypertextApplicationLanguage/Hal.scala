package typings.hypertextApplicationLanguage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hal {
  
  /**
    * Describe a HAL Link object
    *
    * https://tools.ietf.org/html/draft-kelly-json-hal-06#section-5
    */
  trait Link extends StObject {
    
    var deprecation: js.UndefOr[String] = js.undefined
    
    var href: String
    
    var hreflang: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var profile: js.UndefOr[String] = js.undefined
    
    var templated: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Link {
    
    inline def apply(href: String): Link = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
      
      inline def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      inline def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTemplated(value: Boolean): Self = StObject.set(x, "templated", value.asInstanceOf[js.Any])
      
      inline def setTemplatedUndefined: Self = StObject.set(x, "templated", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
