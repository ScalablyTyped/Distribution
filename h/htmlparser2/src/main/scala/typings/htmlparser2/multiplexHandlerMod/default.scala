package typings.htmlparser2.multiplexHandlerMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2/lib/MultiplexHandler", JSImport.Default)
@js.native
class default protected () extends MultiplexHandler {
  def this(func: js.Function2[
        /* keyof htmlparser2.htmlparser2/lib/Parser.Handler */ /* event */ onparserinit | onreset | onend | onerror | onclosetag | onopentagname | onattribute | onopentag | ontext | oncomment | oncdatastart | oncdataend | oncommentend | onprocessinginstruction, 
        /* repeated */ js.Any, 
        Unit
      ]) = this()
}

