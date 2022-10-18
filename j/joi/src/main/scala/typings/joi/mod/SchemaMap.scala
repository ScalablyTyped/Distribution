package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  isStrict extends true ? joi.joi.StrictSchemaMap<TSchema> : joi.joi.PartialSchemaMap<TSchema>
  }}}
  */
@js.native
trait SchemaMap[TSchema, isStrict] extends StObject
