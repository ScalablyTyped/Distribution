package typings
package mailgenLib.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Created by kiettv on 7/24/16.
  */
trait Mailgen extends js.Object {
  def cacheThemes(): scala.Unit
  def generate(params: mailgenLib.mailgenMod.MailgenNs.Content): js.Any
  def generatePlaintext(params: mailgenLib.mailgenMod.MailgenNs.Content): js.Any
  def parseParams(params: js.Any): js.Any
}

object Mailgen {
  @scala.inline
  def apply(
    cacheThemes: js.Function0[scala.Unit],
    generate: js.Function1[mailgenLib.mailgenMod.MailgenNs.Content, js.Any],
    generatePlaintext: js.Function1[mailgenLib.mailgenMod.MailgenNs.Content, js.Any],
    parseParams: js.Function1[js.Any, js.Any]
  ): Mailgen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cacheThemes")(cacheThemes)
    __obj.updateDynamic("generate")(generate)
    __obj.updateDynamic("generatePlaintext")(generatePlaintext)
    __obj.updateDynamic("parseParams")(parseParams)
    __obj.asInstanceOf[Mailgen]
  }
}

