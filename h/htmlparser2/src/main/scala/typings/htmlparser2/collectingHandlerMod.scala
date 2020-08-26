package typings.htmlparser2

import typings.htmlparser2.anon.PartialHandler
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
import typings.htmlparser2.multiplexHandlerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2/lib/CollectingHandler", JSImport.Namespace)
@js.native
object collectingHandlerMod extends js.Object {
  @js.native
  class CollectingHandler () extends default {
    def this(cbs: PartialHandler) = this()
    var _cbs: PartialHandler = js.native
    var events: js.Array[
        Array[
          onparserinit | onreset | onend | onerror | onclosetag | onopentagname | onattribute | onopentag | ontext | oncomment | oncdatastart | oncdataend | oncommentend | onprocessinginstruction | _
        ]
      ] = js.native
    def restart(): Unit = js.native
  }
  
}

