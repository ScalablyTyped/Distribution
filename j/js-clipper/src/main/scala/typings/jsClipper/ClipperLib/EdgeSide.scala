package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EdgeSide extends StObject
@JSGlobal("ClipperLib.EdgeSide")
@js.native
object EdgeSide extends StObject {
  
  @js.native
  sealed trait esLeft
    extends StObject
       with EdgeSide
  
  @js.native
  sealed trait esRight
    extends StObject
       with EdgeSide
}
