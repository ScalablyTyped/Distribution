package typings
package mailparserLib.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mailparser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def simpleParser(source: mailparserLib.mailparserMod.Source): js.Promise[mailparserLib.mailparserMod.ParsedMail] = js.native
  def simpleParser(
    source: mailparserLib.mailparserMod.Source,
    callback: js.Function2[/* err */ js.Any, /* mail */ mailparserLib.mailparserMod.ParsedMail, scala.Unit]
  ): scala.Unit = js.native
}

