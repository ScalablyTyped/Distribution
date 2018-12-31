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

