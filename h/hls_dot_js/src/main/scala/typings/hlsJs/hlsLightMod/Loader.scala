package typings.hlsJs.hlsLightMod

import typings.hlsJs.mod.LoaderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls.js/dist/hls.light", "Loader")
@js.native
class Loader protected ()
  extends typings.hlsJs.mod.Loader {
  def this(config: LoaderConfig) = this()
}

