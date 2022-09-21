package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaylistLevelType extends StObject
@JSImport("hls.js", "PlaylistLevelType")
@js.native
object PlaylistLevelType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlaylistLevelType & String] = js.native
  
  @js.native
  sealed trait AUDIO
    extends StObject
       with PlaylistLevelType
  /* "audio" */ val AUDIO: typings.hlsJs.mod.PlaylistLevelType.AUDIO & String = js.native
  
  @js.native
  sealed trait MAIN
    extends StObject
       with PlaylistLevelType
  /* "main" */ val MAIN: typings.hlsJs.mod.PlaylistLevelType.MAIN & String = js.native
  
  @js.native
  sealed trait SUBTITLE
    extends StObject
       with PlaylistLevelType
  /* "subtitle" */ val SUBTITLE: typings.hlsJs.mod.PlaylistLevelType.SUBTITLE & String = js.native
}
