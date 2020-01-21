package typings.levelJs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelConstructor
  extends Instantiable1[/* location */ String, Level]
     with Instantiable2[/* location */ String, /* options */ LevelOptions, Level] {
  def apply(location: String): Level = js.native
  def apply(location: String, options: LevelOptions): Level = js.native
}

