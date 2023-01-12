package typings.grommet

import typings.grommet.grommetStrings.horizontal
import typings.grommet.utilsMod.BackgroundObject
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPageContentMod {
  
  @JSImport("grommet/components/PageContent", "PageContent")
  @js.native
  val PageContent: FC[PageContentExtendedProps] = js.native
  
  trait PageBackground
    extends StObject
       with BackgroundObject {
    
    var fill: js.UndefOr[horizontal] = js.undefined
  }
  object PageBackground {
    
    inline def apply(): PageBackground = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageBackground]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageBackground] (val x: Self) extends AnyVal {
      
      inline def setFill(value: horizontal): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof grommet.grommet/components/Box.BoxExtendedProps, 'background'> ]: grommet.grommet/components/Box.BoxExtendedProps[P]} */ trait PageContentExtendedProps
    extends StObject
       with PageContentProps
  object PageContentExtendedProps {
    
    inline def apply(): PageContentExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageContentExtendedProps]
    }
  }
  
  trait PageContentProps extends StObject {
    
    var background: js.UndefOr[String | PageBackground] = js.undefined
  }
  object PageContentProps {
    
    inline def apply(): PageContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageContentProps] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String | PageBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    }
  }
}
