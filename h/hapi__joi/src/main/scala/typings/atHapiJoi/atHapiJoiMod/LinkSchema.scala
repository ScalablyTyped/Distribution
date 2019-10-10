package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atHapiJoi.atHapiJoiMod._SchemaLike because Already inherited
- typings.atHapiJoi.atHapiJoiMod.Schema because Already inherited */ @js.native
trait LinkSchema extends AnySchema {
  /**
    * Same as `any.concat()` but the schema is merged after the link is resolved which allows merging with schemas of the same type as the resolved link.
    * Will throw an exception during validation if the merged types are not compatible.
    */
  def concat(schema: Schema): this.type = js.native
  /**
    * Initializes the schema after constructions for cases where the schema has to be constructed first and then initialized.
    * If `ref` was not passed to the constructor, `link.ref()` must be called prior to usaged.
    */
  def ref(ref: String): this.type = js.native
}

