package typings.htmlCodesniffer.mod.Util

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestTableHeadersResult extends js.Object {
  
  /** Whether scope is allowed to satisfy the association requirement (ie. max one row/one column). */
  var allowScope: Boolean = js.native
  
  /** Whether headers have been correctly used. */
  var correct: Boolean = js.native
  
  /** Array of elements without headers attribute. */
  var missingTd: js.Array[Element] = js.native
  
  /** Array of th elements without IDs. */
  var missingThId: js.Array[Element] = js.native
  
  /** Whether header association at all is required. */
  var required: Boolean = js.native
  
  /** Whether headers attribute has been used on at least one table data (td) cell. */
  var used: Boolean = js.native
  
  /** Array of elements where headers attr is incorrect. */
  var wrongHeaders: js.Array[HeaderInfo] = js.native
}
object TestTableHeadersResult {
  
  @scala.inline
  def apply(
    allowScope: Boolean,
    correct: Boolean,
    missingTd: js.Array[Element],
    missingThId: js.Array[Element],
    required: Boolean,
    used: Boolean,
    wrongHeaders: js.Array[HeaderInfo]
  ): TestTableHeadersResult = {
    val __obj = js.Dynamic.literal(allowScope = allowScope.asInstanceOf[js.Any], correct = correct.asInstanceOf[js.Any], missingTd = missingTd.asInstanceOf[js.Any], missingThId = missingThId.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any], wrongHeaders = wrongHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestTableHeadersResult]
  }
  
  @scala.inline
  implicit class TestTableHeadersResultOps[Self <: TestTableHeadersResult] (val x: Self) extends AnyVal {
    
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
    def setAllowScope(value: Boolean): Self = this.set("allowScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrect(value: Boolean): Self = this.set("correct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingTdVarargs(value: Element*): Self = this.set("missingTd", js.Array(value :_*))
    
    @scala.inline
    def setMissingTd(value: js.Array[Element]): Self = this.set("missingTd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingThIdVarargs(value: Element*): Self = this.set("missingThId", js.Array(value :_*))
    
    @scala.inline
    def setMissingThId(value: js.Array[Element]): Self = this.set("missingThId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsed(value: Boolean): Self = this.set("used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrongHeadersVarargs(value: HeaderInfo*): Self = this.set("wrongHeaders", js.Array(value :_*))
    
    @scala.inline
    def setWrongHeaders(value: js.Array[HeaderInfo]): Self = this.set("wrongHeaders", value.asInstanceOf[js.Any])
  }
}
