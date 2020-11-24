package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPatternOptions extends js.Object {
  
  var fallthrough: js.UndefOr[Boolean] = js.native
  
  var matches: SchemaLike | Reference = js.native
}
object ObjectPatternOptions {
  
  @scala.inline
  def apply(): ObjectPatternOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectPatternOptions]
  }
  
  @scala.inline
  implicit class ObjectPatternOptionsOps[Self <: ObjectPatternOptions] (val x: Self) extends AnyVal {
    
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
    def setFallthrough(value: Boolean): Self = this.set("fallthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallthrough: Self = this.set("fallthrough", js.undefined)
    
    @scala.inline
    def setMatches(value: SchemaLike | Reference): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesNull: Self = this.set("matches", null)
  }
}
