package typings.grommet

import typings.grommet.boxMod.BoxProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("grommet/components/Avatar", "Avatar")
  @js.native
  val Avatar: FC[
    BoxProps & AvatarProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  trait AvatarProps extends StObject {
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object AvatarProps {
    
    @scala.inline
    def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit class AvatarPropsMutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
