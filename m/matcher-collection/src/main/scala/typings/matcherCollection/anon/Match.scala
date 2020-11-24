package typings.matcherCollection.anon

import typings.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match extends js.Object {
  
  def `match`(value: String): Boolean = js.native
  
  var matchers: js.Array[IMinimatch] = js.native
  
  def mayContain(value: String): Boolean = js.native
}
object Match {
  
  @scala.inline
  def apply(`match`: String => Boolean, matchers: js.Array[IMinimatch], mayContain: String => Boolean): Match = {
    val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], mayContain = js.Any.fromFunction1(mayContain))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit class MatchOps[Self <: Match] (val x: Self) extends AnyVal {
    
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
    def setMatch(value: String => Boolean): Self = this.set("match", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchersVarargs(value: IMinimatch*): Self = this.set("matchers", js.Array(value :_*))
    
    @scala.inline
    def setMatchers(value: js.Array[IMinimatch]): Self = this.set("matchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMayContain(value: String => Boolean): Self = this.set("mayContain", js.Any.fromFunction1(value))
  }
}
