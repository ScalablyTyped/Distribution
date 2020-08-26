package typings.htmlparser2.parserMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler extends js.Object {
  def onattribute(name: String, value: String): Unit = js.native
  def oncdataend(): Unit = js.native
  def oncdatastart(): Unit = js.native
  def onclosetag(name: String): Unit = js.native
  def oncomment(data: String): Unit = js.native
  def oncommentend(): Unit = js.native
  /***
    * Signals the handler that parsing is done
    */
  def onend(): Unit = js.native
  def onerror(error: Error): Unit = js.native
  def onopentag(name: String, attribs: StringDictionary[String]): Unit = js.native
  def onopentagname(name: String): Unit = js.native
  def onparserinit(parser: Parser): Unit = js.native
  def onprocessinginstruction(name: String, data: String): Unit = js.native
  /***
    * Resets the handler back to starting state
    */
  def onreset(): Unit = js.native
  def ontext(data: String): Unit = js.native
}

object Handler {
  @scala.inline
  def apply(
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
    onparserinit: Parser => Unit,
    onprocessinginstruction: (String, String) => Unit,
    onreset: () => Unit,
    ontext: String => Unit
  ): Handler = {
    val __obj = js.Dynamic.literal(onattribute = js.Any.fromFunction2(onattribute), oncdataend = js.Any.fromFunction0(oncdataend), oncdatastart = js.Any.fromFunction0(oncdatastart), onclosetag = js.Any.fromFunction1(onclosetag), oncomment = js.Any.fromFunction1(oncomment), oncommentend = js.Any.fromFunction0(oncommentend), onend = js.Any.fromFunction0(onend), onerror = js.Any.fromFunction1(onerror), onopentag = js.Any.fromFunction2(onopentag), onopentagname = js.Any.fromFunction1(onopentagname), onparserinit = js.Any.fromFunction1(onparserinit), onprocessinginstruction = js.Any.fromFunction2(onprocessinginstruction), onreset = js.Any.fromFunction0(onreset), ontext = js.Any.fromFunction1(ontext))
    __obj.asInstanceOf[Handler]
  }
  @scala.inline
  implicit class HandlerOps[Self <: Handler] (val x: Self) extends AnyVal {
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
    def setOnattribute(value: (String, String) => Unit): Self = this.set("onattribute", js.Any.fromFunction2(value))
    @scala.inline
    def setOncdataend(value: () => Unit): Self = this.set("oncdataend", js.Any.fromFunction0(value))
    @scala.inline
    def setOncdatastart(value: () => Unit): Self = this.set("oncdatastart", js.Any.fromFunction0(value))
    @scala.inline
    def setOnclosetag(value: String => Unit): Self = this.set("onclosetag", js.Any.fromFunction1(value))
    @scala.inline
    def setOncomment(value: String => Unit): Self = this.set("oncomment", js.Any.fromFunction1(value))
    @scala.inline
    def setOncommentend(value: () => Unit): Self = this.set("oncommentend", js.Any.fromFunction0(value))
    @scala.inline
    def setOnend(value: () => Unit): Self = this.set("onend", js.Any.fromFunction0(value))
    @scala.inline
    def setOnerror(value: Error => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def setOnopentag(value: (String, StringDictionary[String]) => Unit): Self = this.set("onopentag", js.Any.fromFunction2(value))
    @scala.inline
    def setOnopentagname(value: String => Unit): Self = this.set("onopentagname", js.Any.fromFunction1(value))
    @scala.inline
    def setOnparserinit(value: Parser => Unit): Self = this.set("onparserinit", js.Any.fromFunction1(value))
    @scala.inline
    def setOnprocessinginstruction(value: (String, String) => Unit): Self = this.set("onprocessinginstruction", js.Any.fromFunction2(value))
    @scala.inline
    def setOnreset(value: () => Unit): Self = this.set("onreset", js.Any.fromFunction0(value))
    @scala.inline
    def setOntext(value: String => Unit): Self = this.set("ontext", js.Any.fromFunction1(value))
  }
  
}

