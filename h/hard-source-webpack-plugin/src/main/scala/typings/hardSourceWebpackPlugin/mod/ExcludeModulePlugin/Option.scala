package typings.hardSourceWebpackPlugin.mod.ExcludeModulePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  var exclude: js.UndefOr[TestElement] = js.native
  
  var include: js.UndefOr[TestElement] = js.native
  
  var test: TestElement = js.native
}
object Option {
  
  @scala.inline
  def apply(test: TestElement): Option = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    
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
    def setTestVarargs(value: Option*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTestFunction1(value: /* source */ String => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTest(value: TestElement): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeVarargs(value: Option*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFunction1(value: /* source */ String => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: TestElement): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: Option*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setIncludeFunction1(value: /* source */ String => Boolean): Self = this.set("include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInclude(value: TestElement): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
}
