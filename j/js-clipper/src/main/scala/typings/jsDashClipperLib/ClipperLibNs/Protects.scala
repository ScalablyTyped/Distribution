package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Protects extends js.Object

@JSGlobal("ClipperLib.Protects")
@js.native
object Protects extends js.Object {
  @js.native
  sealed trait ipBoth
    extends jsDashClipperLib.ClipperLibNs.Protects
  
  @js.native
  sealed trait ipLeft
    extends jsDashClipperLib.ClipperLibNs.Protects
  
  @js.native
  sealed trait ipNone
    extends jsDashClipperLib.ClipperLibNs.Protects
  
  @js.native
  sealed trait ipRight
    extends jsDashClipperLib.ClipperLibNs.Protects
  
  /* 3 */ val ipBoth: ipBoth with scala.Double = js.native
  /* 1 */ val ipLeft: ipLeft with scala.Double = js.native
  /* 0 */ val ipNone: ipNone with scala.Double = js.native
  /* 2 */ val ipRight: ipRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jsDashClipperLib.ClipperLibNs.Protects with scala.Double] = js.native
}

