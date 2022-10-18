package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Following extends StObject {
  
  var following: Boolean
}
object Following {
  
  inline def apply(following: Boolean): Following = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any])
    __obj.asInstanceOf[Following]
  }
  
  extension [Self <: Following](x: Self) {
    
    inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
  }
}
