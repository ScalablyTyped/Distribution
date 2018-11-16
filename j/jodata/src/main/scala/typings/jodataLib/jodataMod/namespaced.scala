package typings
package jodataLib.jodataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jodata", JSImport.Namespace)
@js.native
class namespaced protected ()
  extends jodataLib.jo {
  def this(baseUri: java.lang.String) = this()
}

@JSImport("jodata", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def datetime(stringLiteral: java.lang.String): java.lang.String = js.native
  def decimal(stringLiteral: scala.Double): java.lang.String = js.native
  def double(stringLiteral: scala.Double): java.lang.String = js.native
  def guid(stringLiteral: java.lang.String): java.lang.String = js.native
  // Casts
  def literal(stringLiteral: java.lang.String): java.lang.String = js.native
  def loadLocal(): jodataLib.jo = js.native
  def loadLocal(key: java.lang.String): jodataLib.jo = js.native
  def single(stringLiteral: scala.Double): java.lang.String = js.native
}

