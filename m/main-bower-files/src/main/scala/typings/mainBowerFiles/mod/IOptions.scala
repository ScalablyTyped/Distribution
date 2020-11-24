package typings.mainBowerFiles.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  var checkExistence: js.UndefOr[Boolean] = js.native
  
  var debugging: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[RegExp | IFilterFunction | String | js.Array[String]] = js.native
  
  var includeDev: js.UndefOr[Boolean | String] = js.native
  
  var includeSelf: js.UndefOr[Boolean] = js.native
  
  var main: js.UndefOr[String | js.Array[String] | js.Object] = js.native
  
  var paths: js.UndefOr[IPaths | String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckExistence(value: Boolean): Self = this.set("checkExistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckExistence: Self = this.set("checkExistence", js.undefined)
    
    @scala.inline
    def setDebugging(value: Boolean): Self = this.set("debugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugging: Self = this.set("debugging", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: String*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilterFunction1(value: /* filepath */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(value: RegExp | IFilterFunction | String | js.Array[String]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIncludeDev(value: Boolean | String): Self = this.set("includeDev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDev: Self = this.set("includeDev", js.undefined)
    
    @scala.inline
    def setIncludeSelf(value: Boolean): Self = this.set("includeSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSelf: Self = this.set("includeSelf", js.undefined)
    
    @scala.inline
    def setMainVarargs(value: String*): Self = this.set("main", js.Array(value :_*))
    
    @scala.inline
    def setMain(value: String | js.Array[String] | js.Object): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setPaths(value: IPaths | String): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
}
