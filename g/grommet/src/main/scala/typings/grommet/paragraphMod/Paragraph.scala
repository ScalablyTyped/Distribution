package typings.grommet.paragraphMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLParagraphElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6/components/Paragraph", "Paragraph")
@js.native
object Paragraph extends TopLevel[
      FC[
        ParagraphProps with (Omit[
          DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
          color
        ])
      ]
    ]

