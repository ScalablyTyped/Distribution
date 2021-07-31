package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowingBoolean extends StObject {
  
  var following: Boolean
}
object FollowingBoolean {
  
  @scala.inline
  def apply(following: Boolean): FollowingBoolean = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowingBoolean]
  }
  
  @scala.inline
  implicit class FollowingBooleanMutableBuilder[Self <: FollowingBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
  }
}
