package typings.istanbul.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter
  extends Instantiable0[Reporter]
     with Instantiable1[/* cfg */ Configuration, Reporter]
     with Instantiable2[/* cfg */ Configuration, /* dir */ String, Reporter] {
  def add(fmt: String): Unit = js.native
  def addAll(fmts: js.Array[String]): Unit = js.native
  def write(collector: Collector, sync: Boolean, callback: js.Function): Unit = js.native
}

