package typings.htmlparser2

import org.scalablytyped.runtime.StringDictionary
import typings.domhandler.mod.DomElement
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<domhandler.domhandler.DomHandler> */
trait PartialDomHandler extends js.Object {
  var constructor: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _], 
      js.Any
    ]
  ] = js.undefined
  var oncdatastart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onclosetag: js.UndefOr[js.Function0[Unit]] = js.undefined
  var oncomment: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  var oncommentend: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onend: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onopentag: js.UndefOr[js.Function2[/* name */ String, /* attribs */ StringDictionary[String], Unit]] = js.undefined
  var onparserinit: js.UndefOr[js.Function1[/* parser */ js.Any, Unit]] = js.undefined
  var onprocessinginstruction: js.UndefOr[js.Function2[/* name */ String, /* data */ String, Unit]] = js.undefined
  var onreset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ontext: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
}

object PartialDomHandler {
  @scala.inline
  def apply(
    constructor: /* callback */ js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _] => js.Any = null,
    oncdatastart: () => Unit = null,
    onclosetag: () => Unit = null,
    oncomment: /* data */ String => Unit = null,
    oncommentend: () => Unit = null,
    onend: () => Unit = null,
    onerror: /* error */ Error => Unit = null,
    onopentag: (/* name */ String, /* attribs */ StringDictionary[String]) => Unit = null,
    onparserinit: /* parser */ js.Any => Unit = null,
    onprocessinginstruction: (/* name */ String, /* data */ String) => Unit = null,
    onreset: () => Unit = null,
    ontext: /* data */ String => Unit = null
  ): PartialDomHandler = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (oncdatastart != null) __obj.updateDynamic("oncdatastart")(js.Any.fromFunction0(oncdatastart))
    if (onclosetag != null) __obj.updateDynamic("onclosetag")(js.Any.fromFunction0(onclosetag))
    if (oncomment != null) __obj.updateDynamic("oncomment")(js.Any.fromFunction1(oncomment))
    if (oncommentend != null) __obj.updateDynamic("oncommentend")(js.Any.fromFunction0(oncommentend))
    if (onend != null) __obj.updateDynamic("onend")(js.Any.fromFunction0(onend))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onopentag != null) __obj.updateDynamic("onopentag")(js.Any.fromFunction2(onopentag))
    if (onparserinit != null) __obj.updateDynamic("onparserinit")(js.Any.fromFunction1(onparserinit))
    if (onprocessinginstruction != null) __obj.updateDynamic("onprocessinginstruction")(js.Any.fromFunction2(onprocessinginstruction))
    if (onreset != null) __obj.updateDynamic("onreset")(js.Any.fromFunction0(onreset))
    if (ontext != null) __obj.updateDynamic("ontext")(js.Any.fromFunction1(ontext))
    __obj.asInstanceOf[PartialDomHandler]
  }
}

