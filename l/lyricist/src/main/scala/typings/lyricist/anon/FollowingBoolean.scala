package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowingBoolean extends StObject {
  
  var following: Boolean
}
object FollowingBoolean {
  
  inline def apply(following: Boolean): FollowingBoolean = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowingBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FollowingBoolean] (val x: Self) extends AnyVal {
    
    inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
  }
}
