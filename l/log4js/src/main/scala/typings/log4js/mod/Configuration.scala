package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  var appenders: StringDictionary[Appender]
  
  var categories: StringDictionary[typings.log4js.anon.Appenders]
  
  var disableClustering: js.UndefOr[Boolean] = js.undefined
  
  var levels: js.UndefOr[Levels_] = js.undefined
  
  var pm2: js.UndefOr[Boolean] = js.undefined
  
  var pm2InstanceVar: js.UndefOr[String] = js.undefined
}
object Configuration {
  
  inline def apply(appenders: StringDictionary[Appender], categories: StringDictionary[typings.log4js.anon.Appenders]): Configuration = {
    val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setAppenders(value: StringDictionary[Appender]): Self = StObject.set(x, "appenders", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: StringDictionary[typings.log4js.anon.Appenders]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setDisableClustering(value: Boolean): Self = StObject.set(x, "disableClustering", value.asInstanceOf[js.Any])
    
    inline def setDisableClusteringUndefined: Self = StObject.set(x, "disableClustering", js.undefined)
    
    inline def setLevels(value: Levels_): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setPm2(value: Boolean): Self = StObject.set(x, "pm2", value.asInstanceOf[js.Any])
    
    inline def setPm2InstanceVar(value: String): Self = StObject.set(x, "pm2InstanceVar", value.asInstanceOf[js.Any])
    
    inline def setPm2InstanceVarUndefined: Self = StObject.set(x, "pm2InstanceVar", js.undefined)
    
    inline def setPm2Undefined: Self = StObject.set(x, "pm2", js.undefined)
  }
}
