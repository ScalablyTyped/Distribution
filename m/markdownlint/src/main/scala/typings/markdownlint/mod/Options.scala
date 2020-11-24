package typings.markdownlint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options.
  */
@js.native
trait Options extends js.Object {
  
  /**
    * Configuration object.
    */
  var config: js.UndefOr[Configuration] = js.native
  
  /**
    * Custom rules.
    */
  var customRules: js.UndefOr[js.Array[Rule] | Rule] = js.native
  
  /**
    * Files to lint.
    */
  var files: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * Front matter pattern.
    */
  var frontMatter: js.UndefOr[RegExp] = js.native
  
  /**
    * True to catch exceptions.
    */
  var handleRuleFailures: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional plugins.
    */
  var markdownItPlugins: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    * True to ignore HTML directives.
    */
  var noInlineConfig: js.UndefOr[Boolean] = js.native
  
  /**
    * Results object version.
    */
  var resultVersion: js.UndefOr[Double] = js.native
  
  /**
    * Strings to lint.
    */
  var strings: js.UndefOr[StringDictionary[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: Configuration): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setCustomRulesVarargs(value: Rule*): Self = this.set("customRules", js.Array(value :_*))
    
    @scala.inline
    def setCustomRules(value: js.Array[Rule] | Rule): Self = this.set("customRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRules: Self = this.set("customRules", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String] | String): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setFrontMatter(value: RegExp): Self = this.set("frontMatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontMatter: Self = this.set("frontMatter", js.undefined)
    
    @scala.inline
    def setHandleRuleFailures(value: Boolean): Self = this.set("handleRuleFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleRuleFailures: Self = this.set("handleRuleFailures", js.undefined)
    
    @scala.inline
    def setMarkdownItPluginsVarargs(value: js.Array[js.Any]*): Self = this.set("markdownItPlugins", js.Array(value :_*))
    
    @scala.inline
    def setMarkdownItPlugins(value: js.Array[js.Array[_]]): Self = this.set("markdownItPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownItPlugins: Self = this.set("markdownItPlugins", js.undefined)
    
    @scala.inline
    def setNoInlineConfig(value: Boolean): Self = this.set("noInlineConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoInlineConfig: Self = this.set("noInlineConfig", js.undefined)
    
    @scala.inline
    def setResultVersion(value: Double): Self = this.set("resultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultVersion: Self = this.set("resultVersion", js.undefined)
    
    @scala.inline
    def setStrings(value: StringDictionary[String]): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
  }
}
