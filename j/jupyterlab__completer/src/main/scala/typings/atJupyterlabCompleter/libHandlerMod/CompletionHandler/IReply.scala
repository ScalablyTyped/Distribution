package typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler

import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to a completion request.
  */
trait IReply extends js.Object {
  /**
    * The end index for the substring being replaced by completion.
    */
  var end: Double
  /**
    * A list of matching completion strings.
    */
  var matches: js.Array[String]
  /**
    * Any metadata that accompanies the completion reply.
    */
  var metadata: ReadonlyJSONObject
  /**
    * The starting index for the substring being replaced by completion.
    */
  var start: Double
}

object IReply {
  @scala.inline
  def apply(end: Double, matches: js.Array[String], metadata: ReadonlyJSONObject, start: Double): IReply = {
    val __obj = js.Dynamic.literal(end = end, matches = matches, metadata = metadata, start = start)
  
    __obj.asInstanceOf[IReply]
  }
}

