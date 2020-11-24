package typings.honeybadger.mod

import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureOptions extends js.Object {
  
  var apiKey: String = js.native
  
  var developmentEnvironments: js.UndefOr[js.Array[String]] = js.native
  
  var endpoint: js.UndefOr[String] = js.native
  
  var environment: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[js.Array[String]] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[Console] = js.native
  
  var projectRoot: js.UndefOr[String] = js.native
}
object ConfigureOptions {
  
  @scala.inline
  def apply(apiKey: String): ConfigureOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureOptions]
  }
  
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevelopmentEnvironmentsVarargs(value: String*): Self = this.set("developmentEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setDevelopmentEnvironments(value: js.Array[String]): Self = this.set("developmentEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevelopmentEnvironments: Self = this.set("developmentEnvironments", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: String*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[String]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setLogger(value: Console): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setProjectRoot(value: String): Self = this.set("projectRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectRoot: Self = this.set("projectRoot", js.undefined)
  }
}
