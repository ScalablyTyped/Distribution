package typings.jupyterlabCompleter.handlerMod.CompletionHandler

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reply to a completion request.
  */
@js.native
trait IReply extends js.Object {
  
  /**
    * The end index for the substring being replaced by completion.
    */
  var end: Double = js.native
  
  /**
    * A list of matching completion strings.
    */
  var matches: js.Array[String] = js.native
  
  /**
    * Any metadata that accompanies the completion reply.
    */
  var metadata: ReadonlyJSONObject = js.native
  
  /**
    * The starting index for the substring being replaced by completion.
    */
  var start: Double = js.native
}
object IReply {
  
  @scala.inline
  def apply(end: Double, matches: js.Array[String], metadata: ReadonlyJSONObject, start: Double): IReply = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ReadonlyJSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
