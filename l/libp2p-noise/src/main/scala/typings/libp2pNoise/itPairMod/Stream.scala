package typings.libp2pNoise.itPairMod

import typings.std.Iterable
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends js.Object {
  
  def sink(source: Iterable[_]): Unit = js.native
  
  var source: Record[String, _] = js.native
}
object Stream {
  
  @scala.inline
  def apply(sink: Iterable[_] => Unit, source: Record[String, _]): Stream = {
    val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
    
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
    def setSink(value: Iterable[_] => Unit): Self = this.set("sink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSource(value: Record[String, _]): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
