package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JoinType extends StObject
@JSGlobal("ClipperLib.JoinType")
@js.native
object JoinType extends StObject {
  
  @js.native
  sealed trait jtMiter
    extends StObject
       with JoinType
  
  @js.native
  sealed trait jtRound
    extends StObject
       with JoinType
  
  @js.native
  sealed trait jtSquare
    extends StObject
       with JoinType
}
