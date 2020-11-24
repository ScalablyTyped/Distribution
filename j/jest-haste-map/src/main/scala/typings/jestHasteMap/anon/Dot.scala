package typings.jestHasteMap.anon

import typings.anymatch.mod.Matcher
import typings.anymatch.mod.MatcherType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dot extends js.Object {
  
  var dot: Boolean = js.native
  
  var glob: String | js.Array[String] = js.native
  
  var ignored: js.UndefOr[Matcher] = js.native
  
  var root: String = js.native
}
object Dot {
  
  @scala.inline
  def apply(dot: Boolean, glob: String | js.Array[String], root: String): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
  
  @scala.inline
  implicit class DotOps[Self <: Dot] (val x: Self) extends AnyVal {
    
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
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobVarargs(value: String*): Self = this.set("glob", js.Array(value :_*))
    
    @scala.inline
    def setGlob(value: String | js.Array[String]): Self = this.set("glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredVarargs(value: MatcherType*): Self = this.set("ignored", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredFunction1(value: /* repeated */ String => Boolean): Self = this.set("ignored", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnored(value: Matcher): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
  }
}
