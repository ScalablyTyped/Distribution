package typings.jupyterlabInspector.handlerMod.InspectionHandler

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reply to an inspection request.
  */
@js.native
trait IReply extends js.Object {
  
  /**
    * The MIME bundle data returned from an inspection request.
    */
  var data: ReadonlyJSONObject = js.native
  
  /**
    * Any metadata that accompanies the MIME bundle returning from a request.
    */
  var metadata: ReadonlyJSONObject = js.native
}
object IReply {
  
  @scala.inline
  def apply(data: ReadonlyJSONObject, metadata: ReadonlyJSONObject): IReply = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReply]
  }
  
  @scala.inline
  implicit class IReplyOps[Self <: IReply] (val x: Self) extends AnyVal {
    
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
    def setData(value: ReadonlyJSONObject): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ReadonlyJSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
}
