package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClipType extends js.Object
@JSGlobal("ClipperLib.ClipType")
@js.native
object ClipType extends js.Object {
  
  @js.native
  sealed trait ctDifference extends ClipType
  
  @js.native
  sealed trait ctIntersection extends ClipType
  
  @js.native
  sealed trait ctUnion extends ClipType
  
  @js.native
  sealed trait ctXor extends ClipType
}
