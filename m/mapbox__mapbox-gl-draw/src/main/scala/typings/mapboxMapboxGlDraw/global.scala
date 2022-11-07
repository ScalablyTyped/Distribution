package typings.mapboxMapboxGlDraw

import typings.mapboxMapboxGlDraw.mod.MapboxDrawOptions
import typings.mapboxMapboxGlDraw.mod.Modes_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object MapboxDraw {
    
    @JSGlobal("MapboxDraw")
    @js.native
    open class ^ ()
      extends typings.mapboxMapboxGlDraw.mod.^ {
      def this(options: MapboxDrawOptions) = this()
    }
    
    @JSGlobal("MapboxDraw")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("MapboxDraw.modes")
    @js.native
    def modes: Modes_ = js.native
    inline def modes_=(x: Modes_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
  }
}
