package typings.mapnik.mapnikMod

import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapnik", "Image")
@js.native
class Image protected ()
  extends // constructor(x: number, y: number)
Instantiable2[/* x */ Double, /* y */ Double, js.Function0[Unit]] {
  def this(x: Double, y: Double) = this()
  def encode(`type`: String): Unit = js.native
  def encode(`type`: String, callback: js.Function2[/* err */ Error, /* buffer */ Buffer, Unit]): Unit = js.native
  def getData(): Buffer = js.native
  def open(fp: String): js.Function0[Unit] = js.native
  def save(fp: String): js.Function0[Unit] = js.native
}

