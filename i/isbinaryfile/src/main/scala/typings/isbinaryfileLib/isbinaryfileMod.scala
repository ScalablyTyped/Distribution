package typings
package isbinaryfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isbinaryfile", JSImport.Namespace)
@js.native
object isbinaryfileMod extends js.Object {
  def isBinaryFile(file: java.lang.String): js.Promise[scala.Boolean] = js.native
  def isBinaryFile(file: java.lang.String, size: scala.Double): js.Promise[scala.Boolean] = js.native
  def isBinaryFile(file: nodeLib.Buffer): js.Promise[scala.Boolean] = js.native
  def isBinaryFile(file: nodeLib.Buffer, size: scala.Double): js.Promise[scala.Boolean] = js.native
  def isBinaryFileSync(file: java.lang.String): scala.Boolean = js.native
  def isBinaryFileSync(file: java.lang.String, size: scala.Double): scala.Boolean = js.native
  def isBinaryFileSync(file: nodeLib.Buffer): scala.Boolean = js.native
  def isBinaryFileSync(file: nodeLib.Buffer, size: scala.Double): scala.Boolean = js.native
}

