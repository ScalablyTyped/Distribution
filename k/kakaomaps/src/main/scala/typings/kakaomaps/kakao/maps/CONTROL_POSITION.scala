package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CONTROL_POSITION extends StObject
// NOTE: SDK에 kakao.maps.ProjectionId 구현없음. 없어진것 같음
@JSGlobal("kakao.maps.CONTROL_POSITION")
@js.native
object CONTROL_POSITION extends StObject {
  
  @js.native
  sealed trait BOTTOM
    extends StObject
       with CONTROL_POSITION
  
  @js.native
  sealed trait BOTTOMLEFT
    extends StObject
       with CONTROL_POSITION
  
  @js.native
  sealed trait BOTTOMRIGHT
    extends StObject
       with CONTROL_POSITION
  
  @js.native
  sealed trait LEFT
    extends StObject
       with CONTROL_POSITION
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with CONTROL_POSITION
  
  @js.native
  sealed trait TOP
    extends StObject
       with CONTROL_POSITION
  
  @js.native
  sealed trait TOPLEFT
    extends StObject
       with CONTROL_POSITION
  
  @js.native
  sealed trait TOPRIGHT
    extends StObject
       with CONTROL_POSITION
}
