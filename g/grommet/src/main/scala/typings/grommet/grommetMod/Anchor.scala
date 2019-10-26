package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsAnchorMod.AnchorProps
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FC
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Anchor")
@js.native
object Anchor extends TopLevel[
      FC[
        AnchorProps with (Omit[
          DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
          color
        ])
      ]
    ]

