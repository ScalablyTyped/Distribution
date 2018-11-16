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
  
  val ipBoth: ipBoth with java.lang.String = js.native
  val ipLeft: ipLeft with java.lang.String = js.native
  val ipNone: ipNone with java.lang.String = js.native
  val ipRight: ipRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jsDashClipperLib.ClipperLibNs.Protects with java.lang.String] = js.native
}

