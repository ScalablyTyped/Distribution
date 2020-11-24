package typings.konva.nodeMod

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KonvaEventObject[EventType] extends js.Object {
  
  var cancelBubble: Boolean = js.native
  
  var child: js.UndefOr[Node[NodeConfig]] = js.native
  
  var currentTarget: Node[NodeConfig] = js.native
  
  var evt: EventType = js.native
  
  var target: Shape[ShapeConfig] | Stage = js.native
}
object KonvaEventObject {
  
  @scala.inline
  def apply[EventType](
    cancelBubble: Boolean,
    currentTarget: Node[NodeConfig],
    evt: EventType,
    target: Shape[ShapeConfig] | Stage
  ): KonvaEventObject[EventType] = {
    val __obj = js.Dynamic.literal(cancelBubble = cancelBubble.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], evt = evt.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[KonvaEventObject[EventType]]
  }
  
  @scala.inline
  implicit class KonvaEventObjectOps[Self <: KonvaEventObject[_], EventType] (val x: Self with KonvaEventObject[EventType]) extends AnyVal {
    
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
    def setCancelBubble(value: Boolean): Self = this.set("cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: Node[NodeConfig]): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvt(value: EventType): Self = this.set("evt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Shape[ShapeConfig] | Stage): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChild(value: Node[NodeConfig]): Self = this.set("child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
  }
}
