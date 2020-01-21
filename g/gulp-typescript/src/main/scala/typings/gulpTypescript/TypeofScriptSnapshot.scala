package typings.gulpTypescript

import typings.typescript.mod.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofScriptSnapshot extends js.Object {
  def fromString(text: String): IScriptSnapshot
}

object TypeofScriptSnapshot {
  @scala.inline
  def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshot = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
  
    __obj.asInstanceOf[TypeofScriptSnapshot]
  }
}

