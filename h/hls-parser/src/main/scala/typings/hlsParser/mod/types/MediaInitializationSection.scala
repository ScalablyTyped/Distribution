package typings.hlsParser.mod.types

import typings.hlsParser.AnonUri
import typings.hlsParser.mod.Byterange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.MediaInitializationSection")
@js.native
class MediaInitializationSection protected () extends js.Object {
  def this(properties: AnonUri) = this()
  var byterange: js.UndefOr[Byterange] = js.native
  var uri: String = js.native
}

