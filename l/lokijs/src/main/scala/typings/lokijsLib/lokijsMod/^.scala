package typings
package lokijsLib.lokijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LokiJS
  * A lightweight document oriented javascript database
  * @author Joe Minichino <joe.minichino@gmail.com>
  */
@JSImport("lokijs", JSImport.Namespace)
@js.native
class ^ protected ()
  extends lokijsLib.LokiConstructor {
  def this(filename: java.lang.String) = this()
  def this(filename: java.lang.String, options: stdLib.Partial[lokijsLib.LokiConstructorOptions] with stdLib.Partial[lokijsLib.LokiConfigOptions] with stdLib.Partial[lokijsLib.ThrottledSaveDrainOptions]) = this()
}

@JSImport("lokijs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LokiOps: lokijsLib.LokiOps = js.native
  def aeq(prop1: js.Any, prop2: js.Any): scala.Boolean = js.native
  def gt(prop1: js.Any, prop2: js.Any): scala.Boolean = js.native
  def gt(prop1: js.Any, prop2: js.Any, equal: scala.Boolean): scala.Boolean = js.native
  def lt(prop1: js.Any, prop2: js.Any): scala.Boolean = js.native
  def lt(prop1: js.Any, prop2: js.Any, equal: scala.Boolean): scala.Boolean = js.native
}

