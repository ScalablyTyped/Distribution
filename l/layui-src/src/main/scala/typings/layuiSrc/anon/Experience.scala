package typings.layuiSrc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Experience extends js.Object {
  
  var experience: String = js.native
  
  var score: Double | String = js.native
}
object Experience {
  
  @scala.inline
  def apply(experience: String, score: Double | String): Experience = {
    val __obj = js.Dynamic.literal(experience = experience.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experience]
  }
  
  @scala.inline
  implicit class ExperienceOps[Self <: Experience] (val x: Self) extends AnyVal {
    
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
    def setExperience(value: String): Self = this.set("experience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double | String): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
