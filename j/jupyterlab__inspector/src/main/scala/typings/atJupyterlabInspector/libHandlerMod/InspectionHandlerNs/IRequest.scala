package typings.atJupyterlabInspector.libHandlerMod.InspectionHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details of an inspection request.
  */
trait IRequest extends js.Object {
  /**
    * The cursor offset position within the text being inspected.
    */
  var offset: Double
  /**
    * The text being inspected.
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

