package typings.jsClipper.global.ClipperLib

import typings.jsClipper.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ClipperLib.PolyOffsetBuilder")
@js.native
class PolyOffsetBuilder protected ()
  extends typings.jsClipper.ClipperLib.PolyOffsetBuilder {
  def this(
    pts: typings.jsClipper.ClipperLib.Polygons,
    solution: Value,
    delta: Double,
    jointype: typings.jsClipper.ClipperLib.JoinType,
    MiterLimit: Double,
    AutoFix: Boolean
  ) = this()
}
