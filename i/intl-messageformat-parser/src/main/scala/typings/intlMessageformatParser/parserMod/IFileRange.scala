package typings.intlMessageformatParser.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileRange extends js.Object {
  var end: IFilePosition
  var start: IFilePosition
}

object IFileRange {
  @scala.inline
  def apply(end: IFilePosition, start: IFilePosition): IFileRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileRange]
  }
}

