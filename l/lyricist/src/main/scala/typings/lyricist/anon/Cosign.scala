package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cosign extends StObject {
  
  var cosign: Boolean
  
  var pyong: Boolean
  
  var vote: js.UndefOr[Any] = js.undefined
}
object Cosign {
  
  inline def apply(cosign: Boolean, pyong: Boolean): Cosign = {
    val __obj = js.Dynamic.literal(cosign = cosign.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cosign]
  }
  
  extension [Self <: Cosign](x: Self) {
    
    inline def setCosign(value: Boolean): Self = StObject.set(x, "cosign", value.asInstanceOf[js.Any])
    
    inline def setPyong(value: Boolean): Self = StObject.set(x, "pyong", value.asInstanceOf[js.Any])
    
    inline def setVote(value: Any): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    
    inline def setVoteUndefined: Self = StObject.set(x, "vote", js.undefined)
  }
}
