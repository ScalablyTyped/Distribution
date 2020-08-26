package typings.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbacksOption extends js.Object {
  var attribute: js.UndefOr[js.Function2[/* name */ String, /* value */ js.Any, Unit]] = js.native
  var cdata: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
  var closeElement: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  var closeOpenedElement: js.UndefOr[
    js.Function3[/* tagName */ String, /* token */ Token, /* isUnary */ Boolean, Unit]
  ] = js.native
  var comment: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
  var docType: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
  var openElement: js.UndefOr[js.Function1[/* tagName */ String, Unit]] = js.native
  var text: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var xmlProlog: js.UndefOr[js.Function0[Unit]] = js.native
}

object CallbacksOption {
  @scala.inline
  def apply(): CallbacksOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksOption]
  }
  @scala.inline
  implicit class CallbacksOptionOps[Self <: CallbacksOption] (val x: Self) extends AnyVal {
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
    def setAttribute(value: (/* name */ String, /* value */ js.Any) => Unit): Self = this.set("attribute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setCdata(value: /* content */ String => Unit): Self = this.set("cdata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCdata: Self = this.set("cdata", js.undefined)
    @scala.inline
    def setCloseElement(value: /* name */ String => Unit): Self = this.set("closeElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCloseElement: Self = this.set("closeElement", js.undefined)
    @scala.inline
    def setCloseOpenedElement(value: (/* tagName */ String, /* token */ Token, /* isUnary */ Boolean) => Unit): Self = this.set("closeOpenedElement", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCloseOpenedElement: Self = this.set("closeOpenedElement", js.undefined)
    @scala.inline
    def setComment(value: /* content */ String => Unit): Self = this.set("comment", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setDocType(value: /* content */ String => Unit): Self = this.set("docType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDocType: Self = this.set("docType", js.undefined)
    @scala.inline
    def setOpenElement(value: /* tagName */ String => Unit): Self = this.set("openElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpenElement: Self = this.set("openElement", js.undefined)
    @scala.inline
    def setText(value: /* value */ String => Unit): Self = this.set("text", js.Any.fromFunction1(value))
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setXmlProlog(value: () => Unit): Self = this.set("xmlProlog", js.Any.fromFunction0(value))
    @scala.inline
    def deleteXmlProlog: Self = this.set("xmlProlog", js.undefined)
  }
  
}

