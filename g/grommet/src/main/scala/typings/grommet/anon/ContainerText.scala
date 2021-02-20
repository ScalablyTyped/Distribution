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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerText extends StObject {
  
  var container: js.UndefOr[
    PropsOf[
      FC[
        BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
      ]
    ]
  ] = js.native
  
  var text: js.UndefOr[
    PropsOf[
      FC[
        TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
      ]
    ]
  ] = js.native
}
object ContainerText {
  
  @scala.inline
  def apply(): ContainerText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerText]
  }
  
  @scala.inline
  implicit class ContainerTextMutableBuilder[Self <: ContainerText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(
      value: PropsOf[
          FC[
            BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
          ]
        ]
    ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setText(
      value: PropsOf[
          FC[
            TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
          ]
        ]
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
