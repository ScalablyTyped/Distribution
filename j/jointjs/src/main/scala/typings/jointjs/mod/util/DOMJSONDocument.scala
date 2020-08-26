package typings.jointjs.mod.util

import org.scalablytyped.runtime.StringDictionary
import typings.std.DocumentFragment
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMJSONDocument extends js.Object {
  var fragment: DocumentFragment = js.native
  var groupSelectors: StringDictionary[js.Array[Element]] = js.native
  var selectors: StringDictionary[Element] = js.native
}

object DOMJSONDocument {
  @scala.inline
  def apply(
    fragment: DocumentFragment,
    groupSelectors: StringDictionary[js.Array[Element]],
    selectors: StringDictionary[Element]
  ): DOMJSONDocument = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], groupSelectors = groupSelectors.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMJSONDocument]
  }
  @scala.inline
  implicit class DOMJSONDocumentOps[Self <: DOMJSONDocument] (val x: Self) extends AnyVal {
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
    def setFragment(value: DocumentFragment): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupSelectors(value: StringDictionary[js.Array[Element]]): Self = this.set("groupSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectors(value: StringDictionary[Element]): Self = this.set("selectors", value.asInstanceOf[js.Any])
  }
  
}

