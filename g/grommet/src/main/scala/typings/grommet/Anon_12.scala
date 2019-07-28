package typings.grommet

import typings.grommet.grommetStrings.`1/2`
import typings.grommet.grommetStrings.`1/3`
import typings.grommet.grommetStrings.`1/4`
import typings.grommet.grommetStrings.`2/3`
import typings.grommet.grommetStrings.`2/4`
import typings.grommet.grommetStrings.`3/4`
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.fill
import typings.grommet.grommetStrings.fit
import typings.grommet.grommetStrings.flex
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_12 extends js.Object {
  var count: js.UndefOr[fit | fill | Double] = js.undefined
  var size: js.UndefOr[
    xsmall | small | medium | large | xlarge | full | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | flex | auto | String | js.Array[String]
  ] = js.undefined
}

object Anon_12 {
  @scala.inline
  def apply(
    count: fit | fill | Double = null,
    size: xsmall | small | medium | large | xlarge | full | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | flex | auto | String | js.Array[String] = null
  ): Anon_12 = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_12]
  }
}

