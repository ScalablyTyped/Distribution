package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rule parameters.
  */
@js.native
trait RuleParams extends js.Object {
  
  /**
    * Rule configuration.
    */
  var config: RuleConfiguration = js.native
  
  /**
    * Front matter lines.
    */
  var frontMatterLines: js.Array[String] = js.native
  
  /**
    * File/string lines.
    */
  var lines: js.Array[String] = js.native
  
  /**
    * File/string name.
    */
  var name: String = js.native
  
  /**
    * markdown-it token objects.
    */
  var tokens: js.Array[MarkdownItToken] = js.native
}
object RuleParams {
  
  @scala.inline
  def apply(
    config: RuleConfiguration,
    frontMatterLines: js.Array[String],
    lines: js.Array[String],
    name: String,
    tokens: js.Array[MarkdownItToken]
  ): RuleParams = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], frontMatterLines = frontMatterLines.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleParams]
  }
  
  @scala.inline
  implicit class RuleParamsOps[Self <: RuleParams] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: RuleConfiguration): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontMatterLinesVarargs(value: String*): Self = this.set("frontMatterLines", js.Array(value :_*))
    
    @scala.inline
    def setFrontMatterLines(value: js.Array[String]): Self = this.set("frontMatterLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: String*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[String]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: MarkdownItToken*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[MarkdownItToken]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
}
