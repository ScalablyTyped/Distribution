package typings.jasmineNode.jasmine

import typings.jasmine.jasmine.Runner
import typings.jasmineNode.anon.Consolidate
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteSpecsOptions extends js.Object {
  
  var growl: js.UndefOr[Boolean] = js.native
  
  var includeStackTrace: js.UndefOr[Boolean] = js.native
  
  var isVerbose: js.UndefOr[Boolean] = js.native
  
  var junitreport: js.UndefOr[Consolidate] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* runner */ Runner, Unit]] = js.native
  
  var regExpSpec: RegExp = js.native
  
  var showColors: js.UndefOr[Boolean] = js.native
  
  var specFolders: js.Array[String] = js.native
  
  var teamcity: js.UndefOr[String | Boolean] = js.native
  
  var useRequireJs: js.UndefOr[Boolean] = js.native
}
object ExecuteSpecsOptions {
  
  @scala.inline
  def apply(regExpSpec: RegExp, specFolders: js.Array[String]): ExecuteSpecsOptions = {
    val __obj = js.Dynamic.literal(regExpSpec = regExpSpec.asInstanceOf[js.Any], specFolders = specFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSpecsOptions]
  }
  
  @scala.inline
  implicit class ExecuteSpecsOptionsOps[Self <: ExecuteSpecsOptions] (val x: Self) extends AnyVal {
    
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
    def setRegExpSpec(value: RegExp): Self = this.set("regExpSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecFoldersVarargs(value: String*): Self = this.set("specFolders", js.Array(value :_*))
    
    @scala.inline
    def setSpecFolders(value: js.Array[String]): Self = this.set("specFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowl(value: Boolean): Self = this.set("growl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowl: Self = this.set("growl", js.undefined)
    
    @scala.inline
    def setIncludeStackTrace(value: Boolean): Self = this.set("includeStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeStackTrace: Self = this.set("includeStackTrace", js.undefined)
    
    @scala.inline
    def setIsVerbose(value: Boolean): Self = this.set("isVerbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVerbose: Self = this.set("isVerbose", js.undefined)
    
    @scala.inline
    def setJunitreport(value: Consolidate): Self = this.set("junitreport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJunitreport: Self = this.set("junitreport", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* runner */ Runner => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setShowColors(value: Boolean): Self = this.set("showColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColors: Self = this.set("showColors", js.undefined)
    
    @scala.inline
    def setTeamcity(value: String | Boolean): Self = this.set("teamcity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamcity: Self = this.set("teamcity", js.undefined)
    
    @scala.inline
    def setUseRequireJs(value: Boolean): Self = this.set("useRequireJs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseRequireJs: Self = this.set("useRequireJs", js.undefined)
  }
}
