package typings.hlsDashParser

import typings.hlsDashParser.hlsDashParserMod.Byterange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ByterangeUri extends js.Object {
  var byterange: js.UndefOr[Byterange] = js.undefined
  var uri: String
}

object Anon_ByterangeUri {
  @scala.inline
  def apply(uri: String, byterange: Byterange = null): Anon_ByterangeUri = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (byterange != null) __obj.updateDynamic("byterange")(byterange)
    __obj.asInstanceOf[Anon_ByterangeUri]
  }
}

