package typings.jsqrcode.global

import typings.jsqrcode.ResultPointCallback
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AlignmentPatternFinder")
@js.native
class AlignmentPatternFinder protected ()
  extends typings.jsqrcode.AlignmentPatternFinder {
  def this(
    image: Uint8Array,
    startX: Double,
    startY: Double,
    width: Double,
    height: Double,
    moduleSize: Double,
    resultPointCallback: ResultPointCallback
  ) = this()
}
