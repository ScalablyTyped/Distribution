package typings.grommet

import typings.grommet.anon.Items
import typings.grommet.anon.PauseButton
import typings.grommet.grommetBooleans.`false`
import typings.grommet.grommetStrings.below
import typings.grommet.grommetStrings.contain
import typings.grommet.grommetStrings.cover
import typings.grommet.grommetStrings.over
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsVideoMod {
  
  @JSImport("grommet/components/Video", "Video")
  @js.native
  val Video: FC[VideoExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.VideoHTMLAttributes<std.HTMLVideoElement>, std.HTMLVideoElement>, 'controls'> ]: react.react.DetailedHTMLProps<react.react.VideoHTMLAttributes<std.HTMLVideoElement>, std.HTMLVideoElement>[P]} */ trait VideoExtendedProps
    extends StObject
       with VideoProps
  object VideoExtendedProps {
    
    inline def apply(): VideoExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoExtendedProps]
    }
  }
  
  trait VideoProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var controls: js.UndefOr[`false` | over | below | Items] = js.undefined
    
    var fit: js.UndefOr[cover | contain] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var messages: js.UndefOr[PauseButton] = js.undefined
    
    var mute: js.UndefOr[Boolean] = js.undefined
    
    var skipInterval: js.UndefOr[Double] = js.undefined
  }
  object VideoProps {
    
    inline def apply(): VideoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoProps] (val x: Self) extends AnyVal {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setControls(value: `false` | over | below | Items): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setFit(value: cover | contain): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMessages(value: PauseButton): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setSkipInterval(value: Double): Self = StObject.set(x, "skipInterval", value.asInstanceOf[js.Any])
      
      inline def setSkipIntervalUndefined: Self = StObject.set(x, "skipInterval", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.captions
    - typings.grommet.grommetStrings.descriptions
    - typings.grommet.grommetStrings.fullScreen
    - typings.grommet.grommetStrings.play
    - typings.grommet.grommetStrings.pause
    - typings.grommet.grommetStrings.volume
    - typings.grommet.anon.A11yTitle
  */
  trait controlsItems extends StObject
}
