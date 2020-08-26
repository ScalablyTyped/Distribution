package typings.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovalCallback extends js.Object {
  var attributes: Callback | js.Array[String] = js.native
  var comments: Callback | Boolean = js.native
  var docTypes: Callback | Boolean = js.native
  var elements: Callback | js.Array[String] = js.native
}

object RemovalCallback {
  @scala.inline
  def apply(
    attributes: Callback | js.Array[String],
    comments: Callback | Boolean,
    docTypes: Callback | Boolean,
    elements: Callback | js.Array[String]
  ): RemovalCallback = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], docTypes = docTypes.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovalCallback]
  }
  @scala.inline
  implicit class RemovalCallbackOps[Self <: RemovalCallback] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributesFunction1(value: /* arg */ js.Any => js.Any): Self = this.set("attributes", js.Any.fromFunction1(value))
    @scala.inline
    def setAttributes(value: Callback | js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentsFunction1(value: /* arg */ js.Any => js.Any): Self = this.set("comments", js.Any.fromFunction1(value))
    @scala.inline
    def setComments(value: Callback | Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocTypesFunction1(value: /* arg */ js.Any => js.Any): Self = this.set("docTypes", js.Any.fromFunction1(value))
    @scala.inline
    def setDocTypes(value: Callback | Boolean): Self = this.set("docTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementsVarargs(value: String*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElementsFunction1(value: /* arg */ js.Any => js.Any): Self = this.set("elements", js.Any.fromFunction1(value))
    @scala.inline
    def setElements(value: Callback | js.Array[String]): Self = this.set("elements", value.asInstanceOf[js.Any])
  }
  
}

