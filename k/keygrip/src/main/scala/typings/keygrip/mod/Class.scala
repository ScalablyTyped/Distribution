package typings.keygrip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keygrip", JSImport.Namespace)
@js.native
class Class protected () extends Keygrip {
  def this(keys: js.Array[String]) = this()
  def this(keys: js.Array[String], algorithm: String) = this()
  def this(keys: js.Array[String], algorithm: String, encoding: String) = this()
  /* CompleteClass */
  override def index(data: js.Any, digest: String): Double = js.native
  /* CompleteClass */
  override def sign(data: js.Any): String = js.native
  /* CompleteClass */
  override def verify(data: js.Any, digest: String): Boolean = js.native
}

