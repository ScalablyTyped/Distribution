package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeySystems extends StObject
@JSImport("hls.js", "KeySystems")
@js.native
object KeySystems extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KeySystems & String] = js.native
  
  @js.native
  sealed trait PLAYREADY
    extends StObject
       with KeySystems
  /* "com.microsoft.playready" */ val PLAYREADY: typings.hlsJs.mod.KeySystems.PLAYREADY & String = js.native
  
  @js.native
  sealed trait WIDEVINE
    extends StObject
       with KeySystems
  /* "com.widevine.alpha" */ val WIDEVINE: typings.hlsJs.mod.KeySystems.WIDEVINE & String = js.native
}
