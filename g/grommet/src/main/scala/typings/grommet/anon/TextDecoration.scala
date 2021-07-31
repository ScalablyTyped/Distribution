package typings.grommet.anon

import typings.grommet.anchorMod.AnchorProps
import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.grommet.utilsMod.PropsOf
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoration extends StObject {
  
  var extend: js.UndefOr[
    ExtendType[
      PropsOf[
        FC[
          AnchorProps & (Omit[
            DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
            color
          ])
        ]
      ]
    ]
  ] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
}
object TextDecoration {
  
  @scala.inline
  def apply(): TextDecoration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoration]
  }
  
  @scala.inline
  implicit class TextDecorationMutableBuilder[Self <: TextDecoration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(
      value: ExtendType[
          PropsOf[
            FC[
              AnchorProps & (Omit[
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
              AnchorProps & (Omit[
                DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
                color
              ])
            ]
          ]
        ] => ExtendValue[
          PropsOf[
            FC[
              AnchorProps & (Omit[
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
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
