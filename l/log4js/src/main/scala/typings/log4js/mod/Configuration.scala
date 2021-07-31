package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.anon.Appenders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  var appenders: StringDictionary[Appender]
  
  var categories: StringDictionary[Appenders]
  
  var disableClustering: js.UndefOr[Boolean] = js.undefined
  
  var levels: js.UndefOr[Levels_] = js.undefined
  
  var pm2: js.UndefOr[Boolean] = js.undefined
  
  var pm2InstanceVar: js.UndefOr[String] = js.undefined
}
object Configuration {
  
  @scala.inline
  def apply(appenders: StringDictionary[Appender], categories: StringDictionary[Appenders]): Configuration = {
    val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppenders(value: StringDictionary[Appender]): Self = StObject.set(x, "appenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: StringDictionary[Appenders]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableClustering(value: Boolean): Self = StObject.set(x, "disableClustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableClusteringUndefined: Self = StObject.set(x, "disableClustering", js.undefined)
    
    @scala.inline
    def setLevels(value: Levels_): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setPm2(value: Boolean): Self = StObject.set(x, "pm2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPm2InstanceVar(value: String): Self = StObject.set(x, "pm2InstanceVar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPm2InstanceVarUndefined: Self = StObject.set(x, "pm2InstanceVar", js.undefined)
    
    @scala.inline
    def setPm2Undefined: Self = StObject.set(x, "pm2", js.undefined)
  }
}
