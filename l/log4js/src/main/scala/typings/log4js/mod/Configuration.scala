package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.anon.Appenders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var appenders: StringDictionary[Appender] = js.native
  
  var categories: StringDictionary[Appenders] = js.native
  
  var disableClustering: js.UndefOr[Boolean] = js.native
  
  var levels: js.UndefOr[Levels_] = js.native
  
  var pm2: js.UndefOr[Boolean] = js.native
  
  var pm2InstanceVar: js.UndefOr[String] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(appenders: StringDictionary[Appender], categories: StringDictionary[Appenders]): Configuration = {
    val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppenders(value: StringDictionary[Appender]): Self = this.set("appenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: StringDictionary[Appenders]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableClustering(value: Boolean): Self = this.set("disableClustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableClustering: Self = this.set("disableClustering", js.undefined)
    
    @scala.inline
    def setLevels(value: Levels_): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setPm2(value: Boolean): Self = this.set("pm2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePm2: Self = this.set("pm2", js.undefined)
    
    @scala.inline
    def setPm2InstanceVar(value: String): Self = this.set("pm2InstanceVar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePm2InstanceVar: Self = this.set("pm2InstanceVar", js.undefined)
  }
}
