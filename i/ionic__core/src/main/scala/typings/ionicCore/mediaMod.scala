package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaMod {
  
  @JSImport("@ionic/core/dist/types/utils/media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/media", "SIZE_TO_MEDIA")
  @js.native
  val SIZE_TO_MEDIA: js.Any = js.native
  
  inline def matchBreakpoint(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchBreakpoint")().asInstanceOf[Boolean]
  inline def matchBreakpoint(breakpoint: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchBreakpoint")(breakpoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
