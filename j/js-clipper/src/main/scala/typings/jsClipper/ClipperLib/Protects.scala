package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Protects extends StObject
@JSGlobal("ClipperLib.Protects")
@js.native
object Protects extends StObject {
  
  @js.native
  sealed trait ipBoth
    extends StObject
       with Protects
  
  @js.native
  sealed trait ipLeft
    extends StObject
       with Protects
  
  @js.native
  sealed trait ipNone
    extends StObject
       with Protects
  
  @js.native
  sealed trait ipRight
    extends StObject
       with Protects
}
