package typings.matchmediaquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mql extends js.Object {
  
  def dispose(): Unit = js.native
  
  var matches: Boolean = js.native
  
  var media: String = js.native
  
  def update(evt: Mql): Unit = js.native
}
object Mql {
  
  @scala.inline
  def apply(dispose: () => Unit, matches: Boolean, media: String, update: Mql => Unit): Mql = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), matches = matches.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Mql]
  }
  
  @scala.inline
  implicit class MqlOps[Self <: Mql] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMatches(value: Boolean): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Mql => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
