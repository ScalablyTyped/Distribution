package typings.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * If false and there is no postprocessors, compiler returns the AST synchronously
    * Otherwise, a promise is returned
    *
    */
  var async: js.UndefOr[Boolean] = js.native
  
  /**
    * compiler plugins
    * If provided, compiler always compiles asynchronously
    */
  var postProcessors: js.UndefOr[js.Array[PostProcessor]] = js.native
  
  var smartquotes: js.UndefOr[Boolean] = js.native
  
  var spellcheck: js.UndefOr[Boolean] = js.native
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setPostProcessorsVarargs(value: PostProcessor*): Self = this.set("postProcessors", js.Array(value :_*))
    
    @scala.inline
    def setPostProcessors(value: js.Array[PostProcessor]): Self = this.set("postProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostProcessors: Self = this.set("postProcessors", js.undefined)
    
    @scala.inline
    def setSmartquotes(value: Boolean): Self = this.set("smartquotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartquotes: Self = this.set("smartquotes", js.undefined)
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
  }
}
