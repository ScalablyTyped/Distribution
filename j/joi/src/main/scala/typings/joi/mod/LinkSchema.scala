package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.joi.mod.Schema because Already inherited */ @js.native
trait LinkSchema[TSchema]
  extends StObject
     with AnySchema[TSchema] {
  
  /**
    * Same as `any.concat()` but the schema is merged after the link is resolved which allows merging with schemas of the same type as the resolved link.
    * Will throw an exception during validation if the merged types are not compatible.
    */
  def concat(schema: Schema[Any]): this.type = js.native
  
  /**
    * Initializes the schema after constructions for cases where the schema has to be constructed first and then initialized.
    * If `ref` was not passed to the constructor, `link.ref()` must be called prior to usage.
    */
  def ref(ref: String): this.type = js.native
}
