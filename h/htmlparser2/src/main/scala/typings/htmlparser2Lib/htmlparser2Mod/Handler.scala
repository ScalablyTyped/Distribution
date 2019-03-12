package typings
package htmlparser2Lib.htmlparser2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler extends js.Object {
  var onattribute: js.UndefOr[
    js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit]
  ] = js.undefined
  var oncdataend: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var oncdatastart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onclosetag: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  var oncomment: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Unit]] = js.undefined
  var oncommentend: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onend: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onopentag: js.UndefOr[
    js.Function2[
      /* name */ java.lang.String, 
      /* attribs */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var onopentagname: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Unit]] = js.undefined
  var onprocessinginstruction: js.UndefOr[
    js.Function2[/* name */ java.lang.String, /* data */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onreset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ontext: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
}

object Handler {
  @scala.inline
  def apply(
    onattribute: (/* name */ java.lang.String, /* value */ java.lang.String) => scala.Unit = null,
    oncdataend: () => scala.Unit = null,
    oncdatastart: () => scala.Unit = null,
    onclosetag: /* text */ java.lang.String => scala.Unit = null,
    oncomment: /* data */ java.lang.String => scala.Unit = null,
    oncommentend: () => scala.Unit = null,
    onend: () => scala.Unit = null,
    onerror: /* error */ stdLib.Error => scala.Unit = null,
    onopentag: (/* name */ java.lang.String, /* attribs */ org.scalablytyped.runtime.StringDictionary[java.lang.String]) => scala.Unit = null,
    onopentagname: /* name */ java.lang.String => scala.Unit = null,
    onprocessinginstruction: (/* name */ java.lang.String, /* data */ java.lang.String) => scala.Unit = null,
    onreset: () => scala.Unit = null,
    ontext: /* text */ java.lang.String => scala.Unit = null
  ): Handler = {
    val __obj = js.Dynamic.literal()
    if (onattribute != null) __obj.updateDynamic("onattribute")(js.Any.fromFunction2(onattribute))
    if (oncdataend != null) __obj.updateDynamic("oncdataend")(js.Any.fromFunction0(oncdataend))
    if (oncdatastart != null) __obj.updateDynamic("oncdatastart")(js.Any.fromFunction0(oncdatastart))
    if (onclosetag != null) __obj.updateDynamic("onclosetag")(js.Any.fromFunction1(onclosetag))
    if (oncomment != null) __obj.updateDynamic("oncomment")(js.Any.fromFunction1(oncomment))
    if (oncommentend != null) __obj.updateDynamic("oncommentend")(js.Any.fromFunction0(oncommentend))
    if (onend != null) __obj.updateDynamic("onend")(js.Any.fromFunction0(onend))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onopentag != null) __obj.updateDynamic("onopentag")(js.Any.fromFunction2(onopentag))
    if (onopentagname != null) __obj.updateDynamic("onopentagname")(js.Any.fromFunction1(onopentagname))
    if (onprocessinginstruction != null) __obj.updateDynamic("onprocessinginstruction")(js.Any.fromFunction2(onprocessinginstruction))
    if (onreset != null) __obj.updateDynamic("onreset")(js.Any.fromFunction0(onreset))
    if (ontext != null) __obj.updateDynamic("ontext")(js.Any.fromFunction1(ontext))
    __obj.asInstanceOf[Handler]
  }
}

