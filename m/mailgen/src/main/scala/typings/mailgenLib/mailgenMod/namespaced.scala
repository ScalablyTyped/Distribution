package typings
package mailgenLib.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Created by kiettv on 7/24/16.
 */
@JSImport("mailgen", JSImport.Namespace)
@js.native
class namespaced protected () extends Mailgen {
  def this(opts: mailgenLib.mailgenMod.MailgenNs.Option) = this()
  /* CompleteClass */
  override def cacheThemes(): scala.Unit = js.native
  /* CompleteClass */
  override def generate(params: mailgenLib.mailgenMod.MailgenNs.Content): js.Any = js.native
  /* CompleteClass */
  override def generatePlaintext(params: mailgenLib.mailgenMod.MailgenNs.Content): js.Any = js.native
  /* CompleteClass */
  override def parseParams(params: js.Any): js.Any = js.native
}

