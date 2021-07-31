package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  var language: js.UndefOr[String] = js.undefined
  
  var route: js.UndefOr[js.Array[Leg]] = js.undefined
}
object Language {
  
  @scala.inline
  def apply(): Language = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setRoute(value: js.Array[Leg]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    @scala.inline
    def setRouteVarargs(value: Leg*): Self = StObject.set(x, "route", js.Array(value :_*))
  }
}
