package typings.grommet.anon

import typings.grommet.anchorMod.AnchorProps
import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.Omit
import typings.grommet.utilsMod.PropsOf
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontWeightHover extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var extend: js.UndefOr[
    ExtendType[
      PropsOf[
        FC[
          AnchorProps with (Omit[
            DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
            color
          ])
        ]
      ]
    ]
  ] = js.native
  
  var fontWeight: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[TextDecoration] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
}
object FontWeightHover {
  
  @scala.inline
  def apply(): FontWeightHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeightHover]
  }
  
  @scala.inline
  implicit class FontWeightHoverMutableBuilder[Self <: FontWeightHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setExtend(
      value: ExtendType[
          PropsOf[
            FC[
              AnchorProps with (Omit[
                DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
                color
              ])
            ]
          ]
        ]
    ): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(
      value: /* props */ ExtendProps[
          PropsOf[
            FC[
              AnchorProps with (Omit[
                DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
                color
              ])
            ]
          ]
        ] => ExtendValue[
          PropsOf[
            FC[
              AnchorProps with (Omit[
                DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
                color
              ])
            ]
          ]
        ]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setHover(value: TextDecoration): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
