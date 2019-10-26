package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsBoxMod {
  import typings.react.reactMod.DetailedHTMLProps
  import typings.react.reactMod.HTMLAttributes
  import typings.std.HTMLDivElement

  type BoxTypes = BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type SizeType = _SizeType | String
}
