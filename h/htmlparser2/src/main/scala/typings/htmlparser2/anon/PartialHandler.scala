package typings.htmlparser2.anon

import org.scalablytyped.runtime.StringDictionary
import typings.htmlparser2.parserMod.Parser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<htmlparser2.htmlparser2/lib/Parser.Handler> */
@js.native
trait PartialHandler extends js.Object {
  var onattribute: js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]] = js.native
  var oncdataend: js.UndefOr[js.Function0[Unit]] = js.native
  var oncdatastart: js.UndefOr[js.Function0[Unit]] = js.native
  var onclosetag: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  var oncomment: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
  var oncommentend: js.UndefOr[js.Function0[Unit]] = js.native
  var onend: js.UndefOr[js.Function0[Unit]] = js.native
  var onerror: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  var onopentag: js.UndefOr[js.Function2[/* name */ String, /* attribs */ StringDictionary[String], Unit]] = js.native
  var onopentagname: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  var onparserinit: js.UndefOr[js.Function1[/* parser */ Parser, Unit]] = js.native
  var onprocessinginstruction: js.UndefOr[js.Function2[/* name */ String, /* data */ String, Unit]] = js.native
  var onreset: js.UndefOr[js.Function0[Unit]] = js.native
  var ontext: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
}

object PartialHandler {
  @scala.inline
  def apply(): PartialHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHandler]
  }
  @scala.inline
  implicit class PartialHandlerOps[Self <: PartialHandler] (val x: Self) extends AnyVal {
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
    def setOnattribute(value: (/* name */ String, /* value */ String) => Unit): Self = this.set("onattribute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnattribute: Self = this.set("onattribute", js.undefined)
    @scala.inline
    def setOncdataend(value: () => Unit): Self = this.set("oncdataend", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOncdataend: Self = this.set("oncdataend", js.undefined)
    @scala.inline
    def setOncdatastart(value: () => Unit): Self = this.set("oncdatastart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOncdatastart: Self = this.set("oncdatastart", js.undefined)
    @scala.inline
    def setOnclosetag(value: /* name */ String => Unit): Self = this.set("onclosetag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnclosetag: Self = this.set("onclosetag", js.undefined)
    @scala.inline
    def setOncomment(value: /* data */ String => Unit): Self = this.set("oncomment", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOncomment: Self = this.set("oncomment", js.undefined)
    @scala.inline
    def setOncommentend(value: () => Unit): Self = this.set("oncommentend", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOncommentend: Self = this.set("oncommentend", js.undefined)
    @scala.inline
    def setOnend(value: () => Unit): Self = this.set("onend", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnend: Self = this.set("onend", js.undefined)
    @scala.inline
    def setOnerror(value: /* error */ Error => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnopentag(value: (/* name */ String, /* attribs */ StringDictionary[String]) => Unit): Self = this.set("onopentag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnopentag: Self = this.set("onopentag", js.undefined)
    @scala.inline
    def setOnopentagname(value: /* name */ String => Unit): Self = this.set("onopentagname", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnopentagname: Self = this.set("onopentagname", js.undefined)
    @scala.inline
    def setOnparserinit(value: /* parser */ Parser => Unit): Self = this.set("onparserinit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnparserinit: Self = this.set("onparserinit", js.undefined)
    @scala.inline
    def setOnprocessinginstruction(value: (/* name */ String, /* data */ String) => Unit): Self = this.set("onprocessinginstruction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnprocessinginstruction: Self = this.set("onprocessinginstruction", js.undefined)
    @scala.inline
    def setOnreset(value: () => Unit): Self = this.set("onreset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnreset: Self = this.set("onreset", js.undefined)
    @scala.inline
    def setOntext(value: /* data */ String => Unit): Self = this.set("ontext", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntext: Self = this.set("ontext", js.undefined)
  }
  
}

