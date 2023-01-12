package typings.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Experience extends StObject {
  
  var experience: String
  
  var score: Double | String
}
object Experience {
  
  inline def apply(experience: String, score: Double | String): Experience = {
    val __obj = js.Dynamic.literal(experience = experience.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experience]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Experience] (val x: Self) extends AnyVal {
    
    inline def setExperience(value: String): Self = StObject.set(x, "experience", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double | String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
