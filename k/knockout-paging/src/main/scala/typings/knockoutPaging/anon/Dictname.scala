package typings.knockoutPaging.anon

import org.scalablytyped.runtime.StringDictionary
import typings.knockoutPaging.KnockoutPageGenerator
import typings.knockoutPaging.KnockoutSlidingPageGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictname extends /* name */ StringDictionary[KnockoutPageGenerator] {
  
  var sliding: KnockoutSlidingPageGenerator = js.native
}
object Dictname {
  
  @scala.inline
  def apply(sliding: KnockoutSlidingPageGenerator): Dictname = {
    val __obj = js.Dynamic.literal(sliding = sliding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
  
  @scala.inline
  implicit class DictnameOps[Self <: Dictname] (val x: Self) extends AnyVal {
    
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
    def setSliding(value: KnockoutSlidingPageGenerator): Self = this.set("sliding", value.asInstanceOf[js.Any])
  }
}
