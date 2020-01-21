package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.textAreaMod.TextAreaProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "TextArea")
@js.native
object TextArea extends TopLevel[
      FC[
        TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement])
      ]
    ]

