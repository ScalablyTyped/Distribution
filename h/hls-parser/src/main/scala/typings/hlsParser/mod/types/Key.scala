package typings.hlsParser.mod.types

import typings.hlsParser.anon.Format
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.Key")
@js.native
class Key protected () extends js.Object {
  def this(properties: Format) = this()
  var format: js.UndefOr[String] = js.native
  var formatVersion: js.UndefOr[String] = js.native
  var iv: js.UndefOr[Buffer] = js.native
  var method: String = js.native
  var uri: js.UndefOr[String] = js.native
}

