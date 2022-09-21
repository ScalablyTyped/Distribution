package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WritingMode extends StObject
@JSImport("maplibre-gl", "WritingMode")
@js.native
object WritingMode extends StObject {
  
  @js.native
  sealed trait horizontal
    extends StObject
       with WritingMode
  
  @js.native
  sealed trait horizontalOnly
    extends StObject
       with WritingMode
  
  @js.native
  sealed trait none
    extends StObject
       with WritingMode
  
  @js.native
  sealed trait vertical
    extends StObject
       with WritingMode
}
