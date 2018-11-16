package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolyType extends js.Object

@JSGlobal("ClipperLib.PolyType")
@js.native
object PolyType extends js.Object {
  @js.native
  sealed trait ptClip
    extends jsDashClipperLib.ClipperLibNs.PolyType
  
  @js.native
  sealed trait ptSubject
    extends jsDashClipperLib.ClipperLibNs.PolyType
  
  val ptClip: ptClip with java.lang.String = js.native
  val ptSubject: ptSubject with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jsDashClipperLib.ClipperLibNs.PolyType with java.lang.String] = js.native
}

