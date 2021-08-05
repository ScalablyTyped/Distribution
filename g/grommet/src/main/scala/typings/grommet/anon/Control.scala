package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.grommetStrings.key
import typings.grommet.grommetStrings.ref
import typings.grommet.utilsMod.BackgroundType
import typings.react.mod.ComponentProps
import typings.react.mod.ReactComponentElement
import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var container: js.UndefOr[`14`] = js.undefined
  
  var control: js.UndefOr[Open] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, js.Any]]] = js.undefined
  
  var icons: js.UndefOr[Up] = js.undefined
  
  var options: js.UndefOr[ContainerText] = js.undefined
  
  // https://github.com/DefinitelyTyped/DefinitelyTyped/issues/37506
  var searchInput: js.UndefOr[
    ReactComponentElement[
      js.Any, 
      Pick[
        ComponentProps[js.Any], 
        Exclude[/* keyof react.react.ComponentProps<any> */ String, key | ref]
      ]
    ]
  ] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
}
object Control {
  
  inline def apply(): Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Control]
  }
  
  extension [Self <: Control](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContainer(value: `14`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setControl(value: Open): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setExtend(value: ExtendType[Record[String, js.Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, js.Any]] => ExtendValue[Record[String, js.Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setIcons(value: Up): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setOptions(value: ContainerText): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSearchInput(
      value: ReactComponentElement[
          js.Any, 
          Pick[
            ComponentProps[js.Any], 
            Exclude[/* keyof react.react.ComponentProps<any> */ String, key | ref]
          ]
        ]
    ): Self = StObject.set(x, "searchInput", value.asInstanceOf[js.Any])
    
    inline def setSearchInputUndefined: Self = StObject.set(x, "searchInput", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
