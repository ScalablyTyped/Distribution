package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Services extends StObject {
  
  var backendConnector: js.Any
  
  var i18nFormat: js.Any
  
  var interpolator: Interpolator
  
  var languageDetector: js.Any
  
  var languageUtils: js.Any
  
  var logger: js.Any
  
  var pluralResolver: js.Any
  
  var resourceStore: ResourceStore
}
object Services {
  
  inline def apply(
    backendConnector: js.Any,
    i18nFormat: js.Any,
    interpolator: Interpolator,
    languageDetector: js.Any,
    languageUtils: js.Any,
    logger: js.Any,
    pluralResolver: js.Any,
    resourceStore: ResourceStore
  ): Services = {
    val __obj = js.Dynamic.literal(backendConnector = backendConnector.asInstanceOf[js.Any], i18nFormat = i18nFormat.asInstanceOf[js.Any], interpolator = interpolator.asInstanceOf[js.Any], languageDetector = languageDetector.asInstanceOf[js.Any], languageUtils = languageUtils.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pluralResolver = pluralResolver.asInstanceOf[js.Any], resourceStore = resourceStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  
  extension [Self <: Services](x: Self) {
    
    inline def setBackendConnector(value: js.Any): Self = StObject.set(x, "backendConnector", value.asInstanceOf[js.Any])
    
    inline def setI18nFormat(value: js.Any): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
    
    inline def setInterpolator(value: Interpolator): Self = StObject.set(x, "interpolator", value.asInstanceOf[js.Any])
    
    inline def setLanguageDetector(value: js.Any): Self = StObject.set(x, "languageDetector", value.asInstanceOf[js.Any])
    
    inline def setLanguageUtils(value: js.Any): Self = StObject.set(x, "languageUtils", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPluralResolver(value: js.Any): Self = StObject.set(x, "pluralResolver", value.asInstanceOf[js.Any])
    
    inline def setResourceStore(value: ResourceStore): Self = StObject.set(x, "resourceStore", value.asInstanceOf[js.Any])
  }
}
