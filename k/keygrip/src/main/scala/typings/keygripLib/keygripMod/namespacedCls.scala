package typings
package keygripLib.keygripMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keygrip", JSImport.Namespace)
@js.native
class namespacedCls protected () extends Keygrip {
  def this(keys: js.Array[java.lang.String]) = this()
  def this(keys: js.Array[java.lang.String], algorithm: java.lang.String) = this()
  def this(keys: js.Array[java.lang.String], algorithm: java.lang.String, encoding: java.lang.String) = this()
  /* CompleteClass */
  override def index(data: js.Any, digest: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def sign(data: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def verify(data: js.Any, digest: java.lang.String): scala.Boolean = js.native
}

