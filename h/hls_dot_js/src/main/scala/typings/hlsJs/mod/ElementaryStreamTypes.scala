package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementaryStreamTypes extends StObject
@JSImport("hls.js", "ElementaryStreamTypes")
@js.native
object ElementaryStreamTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ElementaryStreamTypes & String] = js.native
  
  @js.native
  sealed trait AUDIO
    extends StObject
       with ElementaryStreamTypes
  /* "audio" */ val AUDIO: typings.hlsJs.mod.ElementaryStreamTypes.AUDIO & String = js.native
  
  @js.native
  sealed trait AUDIOVIDEO
    extends StObject
       with ElementaryStreamTypes
  /* "audiovideo" */ val AUDIOVIDEO: typings.hlsJs.mod.ElementaryStreamTypes.AUDIOVIDEO & String = js.native
  
  @js.native
  sealed trait VIDEO
    extends StObject
       with ElementaryStreamTypes
  /* "video" */ val VIDEO: typings.hlsJs.mod.ElementaryStreamTypes.VIDEO & String = js.native
}
