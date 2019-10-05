package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Kinetic.Path")
@js.native
class Path protected () extends IPath {
  def this(config: PathConfig) = this()
}

@JSGlobal("Kinetic.Path")
@js.native
object Path extends Instantiable1[/* config */ PathConfig, IPath] {
  def parsePathData(data: String): js.Any = js.native
}

