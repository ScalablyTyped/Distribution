package typings.grommet.anon

import typings.grommet.boxMod.BoxProps
import typings.grommet.grommetStrings.color
import typings.grommet.textMod.TextProps
import typings.grommet.utilsMod.Omit
import typings.grommet.utilsMod.PropsOf
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerText extends StObject {
  
  var container: js.UndefOr[
    PropsOf[
      FC[BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])]
    ]
  ] = js.undefined
  
  var text: js.UndefOr[
    PropsOf[
      FC[
        TextProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
      ]
    ]
  ] = js.undefined
}
object ContainerText {
  
  inline def apply(): ContainerText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerText]
  }
  
  extension [Self <: ContainerText](x: Self) {
    
    inline def setContainer(
      value: PropsOf[
          FC[BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])]
        ]
    ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setText(
      value: PropsOf[
          FC[
            TextProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
          ]
        ]
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
