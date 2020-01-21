package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of all the NamedRanges in the document that share a given
  * name.
  */
@js.native
trait SchemaNamedRanges extends js.Object {
  /**
    * The name that all the named ranges share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The NamedRanges that share the same name.
    */
  var namedRanges: js.UndefOr[js.Array[SchemaNamedRange]] = js.native
}

object SchemaNamedRanges {
  @scala.inline
  def apply(name: String = null, namedRanges: js.Array[SchemaNamedRange] = null): SchemaNamedRanges = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNamedRanges]
  }
}

