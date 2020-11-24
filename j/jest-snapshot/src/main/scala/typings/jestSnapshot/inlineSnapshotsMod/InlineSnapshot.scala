package typings.jestSnapshot.inlineSnapshotsMod

import typings.jestMessageUtil.typesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineSnapshot extends js.Object {
  
  var frame: Frame = js.native
  
  var snapshot: String = js.native
}
object InlineSnapshot {
  
  @scala.inline
  def apply(frame: Frame, snapshot: String): InlineSnapshot = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineSnapshot]
  }
  
  @scala.inline
  implicit class InlineSnapshotOps[Self <: InlineSnapshot] (val x: Self) extends AnyVal {
    
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
    def setFrame(value: Frame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: String): Self = this.set("snapshot", value.asInstanceOf[js.Any])
  }
}
