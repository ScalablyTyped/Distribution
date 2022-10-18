package typings.inferno.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  P extends any ? string extends keyof P ? P : std.Pick<P, std.Exclude<keyof P, keyof D>> & std.Partial<std.Pick<P, std.Extract<keyof P, keyof D>>> & std.Partial<std.Pick<D, std.Exclude<keyof D, keyof P>>> : never
  }}}
  */
@js.native
trait Defaultize[P, D] extends StObject
