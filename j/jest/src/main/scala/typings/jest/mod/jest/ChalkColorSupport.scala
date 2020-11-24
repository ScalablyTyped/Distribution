package typings.jest.mod.jest

import typings.jest.jestNumbers.`0`
import typings.jest.jestNumbers.`1`
import typings.jest.jestNumbers.`2`
import typings.jest.jestNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChalkColorSupport extends js.Object {
  
  var has16m: Boolean = js.native
  
  var has256: Boolean = js.native
  
  var hasBasic: Boolean = js.native
  
  var level: `0` | `1` | `2` | `3` = js.native
}
object ChalkColorSupport {
  
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: `0` | `1` | `2` | `3`): ChalkColorSupport = {
    val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChalkColorSupport]
  }
  
  @scala.inline
  implicit class ChalkColorSupportOps[Self <: ChalkColorSupport] (val x: Self) extends AnyVal {
    
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
    def setHas16m(value: Boolean): Self = this.set("has16m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas256(value: Boolean): Self = this.set("has256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBasic(value: Boolean): Self = this.set("hasBasic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: `0` | `1` | `2` | `3`): Self = this.set("level", value.asInstanceOf[js.Any])
  }
}
