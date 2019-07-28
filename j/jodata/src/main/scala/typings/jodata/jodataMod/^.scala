package typings.jodata.jodataMod

import typings.jodata.jo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jodata", JSImport.Namespace)
@js.native
class ^ protected () extends jo {
  def this(baseUri: String) = this()
}

@JSImport("jodata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def datetime(stringLiteral: String): String = js.native
  def decimal(stringLiteral: Double): String = js.native
  def double(stringLiteral: Double): String = js.native
  def guid(stringLiteral: String): String = js.native
  // Casts
  def literal(stringLiteral: String): String = js.native
  def loadLocal(): jo = js.native
  def loadLocal(key: String): jo = js.native
  def single(stringLiteral: Double): String = js.native
}

