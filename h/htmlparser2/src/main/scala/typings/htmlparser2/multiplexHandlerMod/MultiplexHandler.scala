package typings.htmlparser2.multiplexHandlerMod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlparser2.htmlparser2Strings.onattribute
import typings.htmlparser2.htmlparser2Strings.oncdataend
import typings.htmlparser2.htmlparser2Strings.oncdatastart
import typings.htmlparser2.htmlparser2Strings.onclosetag
import typings.htmlparser2.htmlparser2Strings.oncomment
import typings.htmlparser2.htmlparser2Strings.oncommentend
import typings.htmlparser2.htmlparser2Strings.onend
import typings.htmlparser2.htmlparser2Strings.onerror
import typings.htmlparser2.htmlparser2Strings.onopentag
import typings.htmlparser2.htmlparser2Strings.onopentagname
import typings.htmlparser2.htmlparser2Strings.onparserinit
import typings.htmlparser2.htmlparser2Strings.onprocessinginstruction
import typings.htmlparser2.htmlparser2Strings.onreset
import typings.htmlparser2.htmlparser2Strings.ontext
import typings.htmlparser2.parserMod.Handler
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexHandler extends Handler {
  def _func(
    event: /* keyof htmlparser2.htmlparser2/lib/Parser.Handler */ onparserinit | onreset | onend | onerror | onclosetag | onopentagname | onattribute | onopentag | ontext | oncomment | oncdatastart | oncdataend | oncommentend | onprocessinginstruction,
    args: js.Any*
  ): Unit = js.native
  def onparserinit(parser: js.Object): Unit = js.native
}

object MultiplexHandler {
  @scala.inline
  def apply(
    _func: (/* keyof htmlparser2.htmlparser2/lib/Parser.Handler */ onparserinit | onreset | onend | onerror | onclosetag | onopentagname | onattribute | onopentag | ontext | oncomment | oncdatastart | oncdataend | oncommentend | onprocessinginstruction, /* repeated */ js.Any) => Unit,
    onattribute: (String, String) => Unit,
    oncdataend: () => Unit,
    oncdatastart: () => Unit,
    onclosetag: String => Unit,
    oncomment: String => Unit,
    oncommentend: () => Unit,
    onend: () => Unit,
    onerror: Error => Unit,
    onopentag: (String, StringDictionary[String]) => Unit,
    onopentagname: String => Unit,
    onparserinit: js.Object => Unit,
    onprocessinginstruction: (String, String) => Unit,
    onreset: () => Unit,
    ontext: String => Unit
  ): MultiplexHandler = {
    val __obj = js.Dynamic.literal(_func = js.Any.fromFunction2(_func), onattribute = js.Any.fromFunction2(onattribute), oncdataend = js.Any.fromFunction0(oncdataend), oncdatastart = js.Any.fromFunction0(oncdatastart), onclosetag = js.Any.fromFunction1(onclosetag), oncomment = js.Any.fromFunction1(oncomment), oncommentend = js.Any.fromFunction0(oncommentend), onend = js.Any.fromFunction0(onend), onerror = js.Any.fromFunction1(onerror), onopentag = js.Any.fromFunction2(onopentag), onopentagname = js.Any.fromFunction1(onopentagname), onparserinit = js.Any.fromFunction1(onparserinit), onprocessinginstruction = js.Any.fromFunction2(onprocessinginstruction), onreset = js.Any.fromFunction0(onreset), ontext = js.Any.fromFunction1(ontext))
    __obj.asInstanceOf[MultiplexHandler]
  }
  @scala.inline
  implicit class MultiplexHandlerOps[Self <: MultiplexHandler] (val x: Self) extends AnyVal {
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
    def set_func(
      value: (/* keyof htmlparser2.htmlparser2/lib/Parser.Handler */ onparserinit | onreset | onend | onerror | onclosetag | onopentagname | onattribute | onopentag | ontext | oncomment | oncdatastart | oncdataend | oncommentend | onprocessinginstruction, /* repeated */ js.Any) => Unit
    ): Self = this.set("_func", js.Any.fromFunction2(value))
    @scala.inline
    def setOnparserinit(value: js.Object => Unit): Self = this.set("onparserinit", js.Any.fromFunction1(value))
  }
  
}

