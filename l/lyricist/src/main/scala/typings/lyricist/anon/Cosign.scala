package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cosign extends StObject {
  
  var cosign: Boolean = js.native
  
  var pyong: Boolean = js.native
  
  var vote: js.UndefOr[js.Any] = js.native
}
object Cosign {
  
  @scala.inline
  def apply(cosign: Boolean, pyong: Boolean): Cosign = {
    val __obj = js.Dynamic.literal(cosign = cosign.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cosign]
  }
  
  @scala.inline
  implicit class CosignMutableBuilder[Self <: Cosign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCosign(value: Boolean): Self = StObject.set(x, "cosign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyong(value: Boolean): Self = StObject.set(x, "pyong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: js.Any): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoteUndefined: Self = StObject.set(x, "vote", js.undefined)
  }
}
