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

