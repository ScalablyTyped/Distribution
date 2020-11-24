package typings.jupyterlabServices.messagesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabServices.anon.TargetnameString
import typings.jupyterlabServices.jupyterlabServicesStrings.ok
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
  implicit class ICommInfoReplyOps[Self <: ICommInfoReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComms(value: StringDictionary[TargetnameString]): Self = this.set("comms", value.asInstanceOf[js.Any])
  }
}
