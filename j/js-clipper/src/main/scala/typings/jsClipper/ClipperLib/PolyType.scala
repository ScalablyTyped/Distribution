package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PolyType extends StObject
@JSGlobal("ClipperLib.PolyType")
@js.native
object PolyType extends StObject {
  
  @js.native
  sealed trait ptClip
    extends StObject
       with PolyType
  
  @js.native
  sealed trait ptSubject
    extends StObject
       with PolyType
}
