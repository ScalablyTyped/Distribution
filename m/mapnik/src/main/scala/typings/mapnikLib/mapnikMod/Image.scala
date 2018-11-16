package typings
package mapnikLib.mapnikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapnik", "Image")
@js.native
class Image protected ()
  extends // constructor(x: number, y: number)
ScalablyTyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, js.Function0[scala.Unit]] {
  def this(x: scala.Double, y: scala.Double) = this()
  def encode(`type`: java.lang.String): scala.Unit = js.native
  def encode(
    `type`: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* buffer */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def getData(): nodeLib.Buffer = js.native
  def open(fp: java.lang.String): js.Function0[scala.Unit] = js.native
  def save(fp: java.lang.String): js.Function0[scala.Unit] = js.native
}

