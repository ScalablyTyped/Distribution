package typings.htmlDashParser.htmlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbacksOption extends js.Object {
  var attribute: js.UndefOr[js.Function2[/* name */ String, /* value */ js.Any, Unit]] = js.undefined
  var cdata: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
  var closeElement: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  var closeOpenedElement: js.UndefOr[
    js.Function3[/* tagName */ String, /* token */ Token, /* isUnary */ Boolean, Unit]
  ] = js.undefined
  var comment: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
  var docType: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
  var openElement: js.UndefOr[js.Function1[/* tagName */ String, Unit]] = js.undefined
  var text: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var xmlProlog: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CallbacksOption {
  @scala.inline
  def apply(
    attribute: (/* name */ String, /* value */ js.Any) => Unit = null,
    cdata: /* content */ String => Unit = null,
    closeElement: /* name */ String => Unit = null,
    closeOpenedElement: (/* tagName */ String, /* token */ Token, /* isUnary */ Boolean) => Unit = null,
    comment: /* content */ String => Unit = null,
    docType: /* content */ String => Unit = null,
    openElement: /* tagName */ String => Unit = null,
    text: /* value */ String => Unit = null,
    xmlProlog: () => Unit = null
  ): CallbacksOption = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(js.Any.fromFunction2(attribute))
    if (cdata != null) __obj.updateDynamic("cdata")(js.Any.fromFunction1(cdata))
    if (closeElement != null) __obj.updateDynamic("closeElement")(js.Any.fromFunction1(closeElement))
    if (closeOpenedElement != null) __obj.updateDynamic("closeOpenedElement")(js.Any.fromFunction3(closeOpenedElement))
    if (comment != null) __obj.updateDynamic("comment")(js.Any.fromFunction1(comment))
    if (docType != null) __obj.updateDynamic("docType")(js.Any.fromFunction1(docType))
    if (openElement != null) __obj.updateDynamic("openElement")(js.Any.fromFunction1(openElement))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction1(text))
    if (xmlProlog != null) __obj.updateDynamic("xmlProlog")(js.Any.fromFunction0(xmlProlog))
    __obj.asInstanceOf[CallbacksOption]
  }
}

