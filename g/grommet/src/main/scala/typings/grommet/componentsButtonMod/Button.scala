package typings.grommet.componentsButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLButtonElement
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Button", "Button")
@js.native
object Button extends TopLevel[
      FC[
        ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ])
      ]
    ]

