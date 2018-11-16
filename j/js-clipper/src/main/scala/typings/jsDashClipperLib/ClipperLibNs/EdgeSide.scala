package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeSide extends js.Object

@JSGlobal("ClipperLib.EdgeSide")
@js.native
object EdgeSide extends js.Object {
  @js.native
  sealed trait esLeft
    extends jsDashClipperLib.ClipperLibNs.EdgeSide
  
  @js.native
  sealed trait esRight
    extends jsDashClipperLib.ClipperLibNs.EdgeSide
  
  val esLeft: esLeft with java.lang.String = js.native
  val esRight: esRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jsDashClipperLib.ClipperLibNs.EdgeSide with java.lang.String] = js.native
}

