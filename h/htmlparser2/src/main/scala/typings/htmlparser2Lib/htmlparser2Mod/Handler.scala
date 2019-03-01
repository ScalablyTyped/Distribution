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
  var onerror: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]] = js.undefined
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
    onattribute: js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit] = null,
    oncdataend: js.Function0[scala.Unit] = null,
    oncdatastart: js.Function0[scala.Unit] = null,
    onclosetag: js.Function1[/* text */ java.lang.String, scala.Unit] = null,
    oncomment: js.Function1[/* data */ java.lang.String, scala.Unit] = null,
    oncommentend: js.Function0[scala.Unit] = null,
    onend: js.Function0[scala.Unit] = null,
    onerror: js.Function1[/* error */ nodeLib.Error, scala.Unit] = null,
    onopentag: js.Function2[
      /* name */ java.lang.String, 
      /* attribs */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      scala.Unit
    ] = null,
    onopentagname: js.Function1[/* name */ java.lang.String, scala.Unit] = null,
    onprocessinginstruction: js.Function2[/* name */ java.lang.String, /* data */ java.lang.String, scala.Unit] = null,
    onreset: js.Function0[scala.Unit] = null,
    ontext: js.Function1[/* text */ java.lang.String, scala.Unit] = null
  ): Handler = {
    val __obj = js.Dynamic.literal()
    if (onattribute != null) __obj.updateDynamic("onattribute")(onattribute)
    if (oncdataend != null) __obj.updateDynamic("oncdataend")(oncdataend)
    if (oncdatastart != null) __obj.updateDynamic("oncdatastart")(oncdatastart)
    if (onclosetag != null) __obj.updateDynamic("onclosetag")(onclosetag)
    if (oncomment != null) __obj.updateDynamic("oncomment")(oncomment)
    if (oncommentend != null) __obj.updateDynamic("oncommentend")(oncommentend)
    if (onend != null) __obj.updateDynamic("onend")(onend)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onopentag != null) __obj.updateDynamic("onopentag")(onopentag)
    if (onopentagname != null) __obj.updateDynamic("onopentagname")(onopentagname)
    if (onprocessinginstruction != null) __obj.updateDynamic("onprocessinginstruction")(onprocessinginstruction)
    if (onreset != null) __obj.updateDynamic("onreset")(onreset)
    if (ontext != null) __obj.updateDynamic("ontext")(ontext)
    __obj.asInstanceOf[Handler]
  }
}

