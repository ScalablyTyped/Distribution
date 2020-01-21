package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of Ranges with the same named range ID.  Named ranges allow
  * developers to associate parts of a document with an arbitrary user-defined
  * label so their contents can be programmatically read or edited at a later
  * time. A document can contain multiple named ranges with the same name, but
  * every named range has a unique ID.  A named range is created with a single
  * Range, and content inserted inside a named range generally expands that
  * range. However, certain document changes can cause the range to be split
  * into multiple ranges.  Named ranges are not private. All applications and
  * collaborators that have access to the document can see its named ranges.
  */
@js.native
trait SchemaNamedRange extends js.Object {
  /**
    * The name of the named range.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  /**
    * The ranges that belong to this named range.
    */
  var ranges: js.UndefOr[js.Array[SchemaRange]] = js.native
}

object SchemaNamedRange {
  @scala.inline
  def apply(name: String = null, namedRangeId: String = null, ranges: js.Array[SchemaRange] = null): SchemaNamedRange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNamedRange]
  }
}

