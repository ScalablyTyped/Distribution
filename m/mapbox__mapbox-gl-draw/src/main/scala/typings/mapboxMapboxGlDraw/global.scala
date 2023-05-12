package typings.mapboxMapboxGlDraw

import typings.mapboxMapboxGlDraw.mod.Constants_
import typings.mapboxMapboxGlDraw.mod.Lib_
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
    @JSGlobal("MapboxDraw.constants")
    @js.native
    def constants: Constants_ = js.native
    inline def constants_=(x: Constants_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constants")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("MapboxDraw.lib")
    @js.native
    def lib: Lib_ = js.native
    inline def lib_=(x: Lib_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lib")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("MapboxDraw.modes")
    @js.native
    def modes: Modes_ = js.native
    inline def modes_=(x: Modes_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
  }
}
