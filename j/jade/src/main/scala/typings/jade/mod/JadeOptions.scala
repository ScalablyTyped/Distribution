package typings.jade.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JadeOptions extends js.Object {
  
  var basedir: js.UndefOr[String] = js.native
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var compileDebug: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var doctype: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[StringDictionary[JadeCustomFilterFunction]] = js.native
  
  var globals: js.UndefOr[js.Array[String]] = js.native
  
  var inlineRuntimeFunctions: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pretty: js.UndefOr[Boolean | String] = js.native
  
  var self: js.UndefOr[Boolean] = js.native
}
object JadeOptions {
  
  @scala.inline
  def apply(): JadeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JadeOptions]
  }
  
  @scala.inline
  implicit class JadeOptionsOps[Self <: JadeOptions] (val x: Self) extends AnyVal {
    
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
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedir: Self = this.set("basedir", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCompileDebug(value: Boolean): Self = this.set("compileDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompileDebug: Self = this.set("compileDebug", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDoctype(value: String): Self = this.set("doctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoctype: Self = this.set("doctype", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFilters(value: StringDictionary[JadeCustomFilterFunction]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setGlobalsVarargs(value: String*): Self = this.set("globals", js.Array(value :_*))
    
    @scala.inline
    def setGlobals(value: js.Array[String]): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    
    @scala.inline
    def setInlineRuntimeFunctions(value: Boolean): Self = this.set("inlineRuntimeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineRuntimeFunctions: Self = this.set("inlineRuntimeFunctions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean | String): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    
    @scala.inline
    def setSelf(value: Boolean): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
}
