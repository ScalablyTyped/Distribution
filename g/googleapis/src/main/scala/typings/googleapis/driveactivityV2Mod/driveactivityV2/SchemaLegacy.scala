package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A strategy which consolidates activities using the grouping rules from the
  * legacy V1 Activity API. Similar actions occurring within a window of time
  * can be grouped across multiple targets (such as moving a set of files at
  * once) or multiple actors (such as several users editing the same item).
  * Grouping rules for this strategy are specific to each type of action.
  */
@js.native
trait SchemaLegacy extends js.Object

