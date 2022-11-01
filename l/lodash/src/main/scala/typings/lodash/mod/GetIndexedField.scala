package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  K extends keyof T ? T[K] : K extends / * template literal string: ${number} * / string ? '0' extends keyof T ? undefined : number extends keyof T ? T[number] : undefined : undefined
  }}}
  */
@js.native
trait GetIndexedField[T, K] extends StObject
