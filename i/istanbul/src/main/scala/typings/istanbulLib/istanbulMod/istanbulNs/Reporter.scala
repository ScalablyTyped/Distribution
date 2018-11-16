package typings
package istanbulLib.istanbulMod.istanbulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter
  extends ScalablyTyped.runtime.Instantiable0[Reporter]
     with ScalablyTyped.runtime.Instantiable1[/* cfg */ Configuration, Reporter]
     with ScalablyTyped.runtime.Instantiable2[/* cfg */ Configuration, /* dir */ java.lang.String, Reporter] {
  def add(fmt: java.lang.String): scala.Unit = js.native
  def addAll(fmts: js.Array[java.lang.String]): scala.Unit = js.native
  def write(collector: Collector, sync: scala.Boolean, callback: js.Function): scala.Unit = js.native
}

