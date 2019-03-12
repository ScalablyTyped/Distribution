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
    cacheThemes: () => scala.Unit,
    generate: mailgenLib.mailgenMod.MailgenNs.Content => js.Any,
    generatePlaintext: mailgenLib.mailgenMod.MailgenNs.Content => js.Any,
    parseParams: js.Any => js.Any
  ): Mailgen = {
    val __obj = js.Dynamic.literal(cacheThemes = js.Any.fromFunction0(cacheThemes), generate = js.Any.fromFunction1(generate), generatePlaintext = js.Any.fromFunction1(generatePlaintext), parseParams = js.Any.fromFunction1(parseParams))
  
    __obj.asInstanceOf[Mailgen]
  }
}

