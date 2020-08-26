package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'gun' | '$' | 'root' | 'id' | 'back' | 'on' | 'tag' | 'get' | 'soul' | 'ack' | 'put', any> */
@js.native
trait Recordgunrootidbackontagg extends js.Object {
  @JSName("$")
  var $: js.Any = js.native
  var ack: js.Any = js.native
  var back: js.Any = js.native
  var get: js.Any = js.native
  var gun: js.Any = js.native
  var id: js.Any = js.native
  var on: js.Any = js.native
  var put: js.Any = js.native
  var root: js.Any = js.native
  var soul: js.Any = js.native
  var tag: js.Any = js.native
}

object Recordgunrootidbackontagg {
  @scala.inline
  def apply(
    $: js.Any,
    ack: js.Any,
    back: js.Any,
    get: js.Any,
    gun: js.Any,
    id: js.Any,
    on: js.Any,
    put: js.Any,
    root: js.Any,
    soul: js.Any,
    tag: js.Any
  ): Recordgunrootidbackontagg = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], ack = ack.asInstanceOf[js.Any], back = back.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], gun = gun.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], soul = soul.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordgunrootidbackontagg]
  }
  @scala.inline
  implicit class RecordgunrootidbackontaggOps[Self <: Recordgunrootidbackontagg] (val x: Self) extends AnyVal {
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
    def set$(value: js.Any): Self = this.set("$", value.asInstanceOf[js.Any])
    @scala.inline
    def setAck(value: js.Any): Self = this.set("ack", value.asInstanceOf[js.Any])
    @scala.inline
    def setBack(value: js.Any): Self = this.set("back", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: js.Any): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setGun(value: js.Any): Self = this.set("gun", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(value: js.Any): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setPut(value: js.Any): Self = this.set("put", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoul(value: js.Any): Self = this.set("soul", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

