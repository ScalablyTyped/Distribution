package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Services extends StObject {
  
  var backendConnector: Any
  
  var formatter: js.UndefOr[Formatter] = js.undefined
  
  var i18nFormat: Any
  
  var interpolator: Interpolator
  
  var languageDetector: Any
  
  var languageUtils: Any
  
  var logger: Any
  
  var pluralResolver: Any
  
  var resourceStore: ResourceStore
}
object Services {
  
  inline def apply(
    backendConnector: Any,
    i18nFormat: Any,
    interpolator: Interpolator,
    languageDetector: Any,
    languageUtils: Any,
    logger: Any,
    pluralResolver: Any,
    resourceStore: ResourceStore
  ): Services = {
    val __obj = js.Dynamic.literal(backendConnector = backendConnector.asInstanceOf[js.Any], i18nFormat = i18nFormat.asInstanceOf[js.Any], interpolator = interpolator.asInstanceOf[js.Any], languageDetector = languageDetector.asInstanceOf[js.Any], languageUtils = languageUtils.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pluralResolver = pluralResolver.asInstanceOf[js.Any], resourceStore = resourceStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Services] (val x: Self) extends AnyVal {
    
    inline def setBackendConnector(value: Any): Self = StObject.set(x, "backendConnector", value.asInstanceOf[js.Any])
    
    inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setI18nFormat(value: Any): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
    
    inline def setInterpolator(value: Interpolator): Self = StObject.set(x, "interpolator", value.asInstanceOf[js.Any])
    
    inline def setLanguageDetector(value: Any): Self = StObject.set(x, "languageDetector", value.asInstanceOf[js.Any])
    
    inline def setLanguageUtils(value: Any): Self = StObject.set(x, "languageUtils", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPluralResolver(value: Any): Self = StObject.set(x, "pluralResolver", value.asInstanceOf[js.Any])
    
    inline def setResourceStore(value: ResourceStore): Self = StObject.set(x, "resourceStore", value.asInstanceOf[js.Any])
  }
}
