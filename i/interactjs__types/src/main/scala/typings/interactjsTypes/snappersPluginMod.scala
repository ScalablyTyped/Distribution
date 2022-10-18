package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.anon.CoordFields
import typings.interactjsTypes.anon.TypeofallSnappers
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.modifiersSnapPointerMod.SnapFunction
import typings.interactjsTypes.snappersGridMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snappersPluginMod extends Shortcut {
  
  @JSImport("@interactjs/snappers/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `snappersPluginMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractStaticAugmentingMod {
    
    trait InteractStatic extends StObject {
      
      def createSnapGrid(grid: GridOptions): SnapFunction & CoordFields
      @JSName("createSnapGrid")
      var createSnapGrid_Original: js.Function1[/* grid */ GridOptions, SnapFunction & CoordFields]
      
      var snappers: TypeofallSnappers
    }
    object InteractStatic {
      
      inline def apply(createSnapGrid: /* grid */ GridOptions => SnapFunction & CoordFields, snappers: TypeofallSnappers): InteractStatic = {
        val __obj = js.Dynamic.literal(createSnapGrid = js.Any.fromFunction1(createSnapGrid), snappers = snappers.asInstanceOf[js.Any])
        __obj.asInstanceOf[InteractStatic]
      }
      
      extension [Self <: InteractStatic](x: Self) {
        
        inline def setCreateSnapGrid(value: /* grid */ GridOptions => SnapFunction & CoordFields): Self = StObject.set(x, "createSnapGrid", js.Any.fromFunction1(value))
        
        inline def setSnappers(value: TypeofallSnappers): Self = StObject.set(x, "snappers", value.asInstanceOf[js.Any])
      }
    }
  }
}
