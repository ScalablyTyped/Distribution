package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HlsSkip extends StObject
@JSImport("hls.js", "HlsSkip")
@js.native
object HlsSkip extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HlsSkip & String] = js.native
  
  @js.native
  sealed trait No
    extends StObject
       with HlsSkip
  /* "" */ val No: typings.hlsJs.mod.HlsSkip.No & String = js.native
  
  @js.native
  sealed trait Yes
    extends StObject
       with HlsSkip
  /* "YES" */ val Yes: typings.hlsJs.mod.HlsSkip.Yes & String = js.native
  
  @js.native
  sealed trait v2
    extends StObject
       with HlsSkip
  /* "v2" */ val v2: typings.hlsJs.mod.HlsSkip.v2 & String = js.native
}
