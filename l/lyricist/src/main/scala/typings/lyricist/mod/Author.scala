package typings.lyricist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  var attribution: Double
  
  var pinned_role: js.UndefOr[js.Any] = js.undefined
  
  var user: User
}
object Author {
  
  @scala.inline
  def apply(attribution: Double, user: User): Author = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit class AuthorMutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: Double): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned_role(value: js.Any): Self = StObject.set(x, "pinned_role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned_roleUndefined: Self = StObject.set(x, "pinned_role", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
