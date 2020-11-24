package typings.jsgraph.mod

import typings.jsgraph.jsgraphNumbers.`0`
import typings.jsgraph.jsgraphNumbers.`1`
import typings.jsgraph.jsgraphNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait colors extends js.Object {
  
  var black: `2` = js.native
  
  var gray: `1` = js.native
  
  var white: `0` = js.native
}
object colors {
  
  @scala.inline
  def apply(black: `2`, gray: `1`, white: `0`): colors = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
    __obj.asInstanceOf[colors]
  }
  
  @scala.inline
  implicit class colorsOps[Self <: colors] (val x: Self) extends AnyVal {
    
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
    def setBlack(value: `2`): Self = this.set("black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGray(value: `1`): Self = this.set("gray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhite(value: `0`): Self = this.set("white", value.asInstanceOf[js.Any])
  }
}
