package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PolyFillType extends StObject
@JSGlobal("ClipperLib.PolyFillType")
@js.native
object PolyFillType extends StObject {
  
  @js.native
  sealed trait pftEvenOdd extends PolyFillType
  
  @js.native
  sealed trait pftNegative extends PolyFillType
  
  @js.native
  sealed trait pftNonZero extends PolyFillType
  
  @js.native
  sealed trait pftPositive extends PolyFillType
}
