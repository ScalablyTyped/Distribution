package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.imageMod.ImageProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "Image")
@js.native
object Image extends TopLevel[
      FC[
        ImageProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
      ]
    ]

