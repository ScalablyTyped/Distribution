package typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details of a completion request.
  */
trait IRequest extends js.Object {
  /**
    * The cursor offset position within the text being completed.
    */
  var offset: Double
  /**
    * The text being completed.
    */
  var text: String
}

object IRequest {
  @scala.inline
  def apply(offset: Double, text: String): IRequest = {
    val __obj = js.Dynamic.literal(offset = offset, text = text)
  
    __obj.asInstanceOf[IRequest]
  }
}

