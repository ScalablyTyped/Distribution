package typings
package atJupyterlabInspectorLib.libHandlerMod.InspectionHandlerNs

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
  var offset: scala.Double
  /**
    * The text being inspected.
    */
  var text: java.lang.String
}

object IRequest {
  @scala.inline
  def apply(offset: scala.Double, text: java.lang.String): IRequest = {
    val __obj = js.Dynamic.literal(offset = offset, text = text)
  
    __obj.asInstanceOf[IRequest]
  }
}

