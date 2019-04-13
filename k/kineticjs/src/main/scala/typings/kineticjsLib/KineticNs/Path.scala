package typings
package kineticjsLib.KineticNs

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
object Path
  extends org.scalablytyped.runtime.Instantiable1[/* config */ PathConfig, IPath] {
  def parsePathData(data: java.lang.String): js.Any = js.native
}

