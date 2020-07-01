package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of links, which are references from this span to a span in the
  * same or different trace.
  */
@js.native
trait SchemaLinks extends js.Object {
  /**
    * The number of dropped links after the maximum size was enforced. If this
    * value is 0, then no links were dropped.
    */
  var droppedLinksCount: js.UndefOr[Double] = js.native
  /**
    * A collection of links.
    */
  var link: js.UndefOr[js.Array[SchemaLink]] = js.native
}

object SchemaLinks {
  @scala.inline
  def apply(droppedLinksCount: js.UndefOr[Double] = js.undefined, link: js.Array[SchemaLink] = null): SchemaLinks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(droppedLinksCount)) __obj.updateDynamic("droppedLinksCount")(droppedLinksCount.get.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLinks]
  }
}

