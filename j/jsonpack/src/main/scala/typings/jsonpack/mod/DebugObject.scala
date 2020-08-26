package typings.jsonpack.mod

import typings.jsonpack.anon.Floats
import typings.jsonpack.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugObject extends js.Object {
  var ast: js.Array[Index] = js.native
  var dictionary: Floats = js.native
  var packed: String = js.native
}

object DebugObject {
  @scala.inline
  def apply(ast: js.Array[Index], dictionary: Floats, packed: String): DebugObject = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugObject]
  }
  @scala.inline
  implicit class DebugObjectOps[Self <: DebugObject] (val x: Self) extends AnyVal {
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
    def setAstVarargs(value: Index*): Self = this.set("ast", js.Array(value :_*))
    @scala.inline
    def setAst(value: js.Array[Index]): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionary(value: Floats): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacked(value: String): Self = this.set("packed", value.asInstanceOf[js.Any])
  }
  
}

