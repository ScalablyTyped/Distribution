package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resouce extends StObject {
  
  var localId: String = js.native
}
object Resouce {
  
  @scala.inline
  def apply(localId: String): Resouce = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resouce]
  }
  
  @scala.inline
  implicit class ResouceMutableBuilder[Self <: Resouce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
  }
}
