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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.native
  
  var container: js.UndefOr[`14`] = js.native
  
  var control: js.UndefOr[Open] = js.native
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
  
  var icons: js.UndefOr[Up] = js.native
  
  var options: js.UndefOr[ContainerText] = js.native
  
  // https://github.com/DefinitelyTyped/DefinitelyTyped/issues/37506
  var searchInput: js.UndefOr[
    ReactComponentElement[
      _, 
      Pick[
        ComponentProps[_], 
        Exclude[/* keyof react.react.ComponentProps<any> */ String, key | ref]
      ]
    ]
  ] = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object Control {
  
  @scala.inline
  def apply(): Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit class ControlMutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setContainer(value: `14`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setControl(value: Open): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setIcons(value: Up): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setOptions(value: ContainerText): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSearchInput(
      value: ReactComponentElement[
          _, 
          Pick[
            ComponentProps[_], 
            Exclude[/* keyof react.react.ComponentProps<any> */ String, key | ref]
          ]
        ]
    ): Self = StObject.set(x, "searchInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchInputUndefined: Self = StObject.set(x, "searchInput", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
