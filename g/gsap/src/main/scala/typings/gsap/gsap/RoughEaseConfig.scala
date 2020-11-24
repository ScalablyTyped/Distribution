package typings.gsap.gsap

import typings.gsap.gsapStrings.both
import typings.gsap.gsapStrings.in
import typings.gsap.gsapStrings.none
import typings.gsap.gsapStrings.out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoughEaseConfig extends js.Object {
  
  var clamp: js.UndefOr[Boolean] = js.native
  
  var points: js.UndefOr[Double] = js.native
  
  var randomize: js.UndefOr[Boolean] = js.native
  
  var strength: js.UndefOr[Double] = js.native
  
  var taper: js.UndefOr[in | out | both | none] = js.native
  
  var template: js.UndefOr[Ease] = js.native
}
object RoughEaseConfig {
  
  @scala.inline
  def apply(): RoughEaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoughEaseConfig]
  }
  
  @scala.inline
  implicit class RoughEaseConfigOps[Self <: RoughEaseConfig] (val x: Self) extends AnyVal {
    
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
    def setClamp(value: Boolean): Self = this.set("clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClamp: Self = this.set("clamp", js.undefined)
    
    @scala.inline
    def setPoints(value: Double): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setRandomize(value: Boolean): Self = this.set("randomize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomize: Self = this.set("randomize", js.undefined)
    
    @scala.inline
    def setStrength(value: Double): Self = this.set("strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
    
    @scala.inline
    def setTaper(value: in | out | both | none): Self = this.set("taper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaper: Self = this.set("taper", js.undefined)
    
    @scala.inline
    def setTemplate(value: Ease): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
