package typings.leveldown.mod

import typings.abstractLeveldown.mod.AbstractIteratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDownIteratorOptions extends AbstractIteratorOptions[Bytes] {
  
  var fillCache: js.UndefOr[Boolean] = js.native
}
object LevelDownIteratorOptions {
  
  @scala.inline
  def apply(): LevelDownIteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDownIteratorOptions]
  }
  
  @scala.inline
  implicit class LevelDownIteratorOptionsOps[Self <: LevelDownIteratorOptions] (val x: Self) extends AnyVal {
    
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
    def setFillCache(value: Boolean): Self = this.set("fillCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillCache: Self = this.set("fillCache", js.undefined)
  }
}
