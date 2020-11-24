package typings.jestSnapshot.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchSnapshotConfig extends js.Object {
  
  var context: Context = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var inlineSnapshot: js.UndefOr[String] = js.native
  
  var isInline: Boolean = js.native
  
  var matcherName: String = js.native
  
  var properties: js.UndefOr[js.Object] = js.native
  
  var received: js.Any = js.native
}
object MatchSnapshotConfig {
  
  @scala.inline
  def apply(context: Context, isInline: Boolean, matcherName: String, received: js.Any): MatchSnapshotConfig = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], matcherName = matcherName.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchSnapshotConfig]
  }
  
  @scala.inline
  implicit class MatchSnapshotConfigOps[Self <: MatchSnapshotConfig] (val x: Self) extends AnyVal {
    
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
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherName(value: String): Self = this.set("matcherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceived(value: js.Any): Self = this.set("received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setInlineSnapshot(value: String): Self = this.set("inlineSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineSnapshot: Self = this.set("inlineSnapshot", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Object): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
