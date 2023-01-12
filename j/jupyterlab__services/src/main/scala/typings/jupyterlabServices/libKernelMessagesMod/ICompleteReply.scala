package typings.jupyterlabServices.libKernelMessagesMod

import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `'complete_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
  *
  * **See also:** [[ICompleteRequest]], [[IKernel.complete]]
  */
trait ICompleteReply
  extends StObject
     with IReplyOkContent {
  
  var cursor_end: Double
  
  var cursor_start: Double
  
  var matches: js.Array[String]
  
  var metadata: JSONObject
}
object ICompleteReply {
  
  inline def apply(cursor_end: Double, cursor_start: Double, matches: js.Array[String], metadata: JSONObject): ICompleteReply = {
    val __obj = js.Dynamic.literal(cursor_end = cursor_end.asInstanceOf[js.Any], cursor_start = cursor_start.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = "ok")
    __obj.asInstanceOf[ICompleteReply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompleteReply] (val x: Self) extends AnyVal {
    
    inline def setCursor_end(value: Double): Self = StObject.set(x, "cursor_end", value.asInstanceOf[js.Any])
    
    inline def setCursor_start(value: Double): Self = StObject.set(x, "cursor_start", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
