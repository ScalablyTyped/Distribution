package typings.jupyterlabServices.messagesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabServices.anon.TargetnameString
import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommInfoReply extends IReplyOkContent {
  
  /**
    * Mapping of comm ids to target names.
    */
  var comms: StringDictionary[TargetnameString] = js.native
}
object ICommInfoReply {
  
  @scala.inline
  def apply(comms: StringDictionary[TargetnameString], status: ok): ICommInfoReply = {
    val __obj = js.Dynamic.literal(comms = comms.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoReply]
  }
  
  @scala.inline
  implicit class ICommInfoReplyMutableBuilder[Self <: ICommInfoReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComms(value: StringDictionary[TargetnameString]): Self = StObject.set(x, "comms", value.asInstanceOf[js.Any])
  }
}
