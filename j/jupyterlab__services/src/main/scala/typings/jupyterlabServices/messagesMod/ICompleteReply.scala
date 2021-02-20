package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `'complete_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
  *
  * **See also:** [[ICompleteRequest]], [[IKernel.complete]]
  */
@js.native
trait ICompleteReply extends IReplyOkContent {
  
  var cursor_end: Double = js.native
  
  var cursor_start: Double = js.native
  
  var matches: js.Array[String] = js.native
  
  var metadata: JSONObject = js.native
}
object ICompleteReply {
  
  @scala.inline
  def apply(
    cursor_end: Double,
    cursor_start: Double,
    matches: js.Array[String],
    metadata: JSONObject,
    status: ok
  ): ICompleteReply = {
    val __obj = js.Dynamic.literal(cursor_end = cursor_end.asInstanceOf[js.Any], cursor_start = cursor_start.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReply]
  }
  
  @scala.inline
  implicit class ICompleteReplyMutableBuilder[Self <: ICompleteReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor_end(value: Double): Self = StObject.set(x, "cursor_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor_start(value: Double): Self = StObject.set(x, "cursor_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
