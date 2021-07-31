package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Following extends StObject {
  
  var following: Boolean
  
  var pyong: Boolean
}
object Following {
  
  @scala.inline
  def apply(following: Boolean, pyong: Boolean): Following = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Following]
  }
  
  @scala.inline
  implicit class FollowingMutableBuilder[Self <: Following] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyong(value: Boolean): Self = StObject.set(x, "pyong", value.asInstanceOf[js.Any])
  }
}
