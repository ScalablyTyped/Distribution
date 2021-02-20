package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IplaypausestopVoice extends BaseParams {
  
  var localId: String = js.native
}
object IplaypausestopVoice {
  
  @scala.inline
  def apply(localId: String): IplaypausestopVoice = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IplaypausestopVoice]
  }
  
  @scala.inline
  implicit class IplaypausestopVoiceMutableBuilder[Self <: IplaypausestopVoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
  }
}
