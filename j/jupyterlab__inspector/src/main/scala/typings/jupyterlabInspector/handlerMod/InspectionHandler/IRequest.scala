package typings.jupyterlabInspector.handlerMod.InspectionHandler

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
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRequest]
  }
}

