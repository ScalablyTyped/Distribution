package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerboseLevel extends StObject
@JSImport("hls.js", "VerboseLevel")
@js.native
object VerboseLevel extends StObject {
  
  @js.native
  sealed trait DATA
    extends StObject
       with VerboseLevel
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with VerboseLevel
  
  @js.native
  sealed trait ERROR
    extends StObject
       with VerboseLevel
  
  @js.native
  sealed trait INFO
    extends StObject
       with VerboseLevel
  
  @js.native
  sealed trait TEXT
    extends StObject
       with VerboseLevel
  
  @js.native
  sealed trait WARNING
    extends StObject
       with VerboseLevel
}
