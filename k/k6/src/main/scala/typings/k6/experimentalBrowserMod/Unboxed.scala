package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  Arg extends [infer A0, infer A1] ? [k6.k6/experimental/browser.Unboxed<A0>, k6.k6/experimental/browser.Unboxed<A1>] : Arg extends [infer A0, infer A1, infer A2] ? [k6.k6/experimental/browser.Unboxed<A0>, k6.k6/experimental/browser.Unboxed<A1>, k6.k6/experimental/browser.Unboxed<A2>] : Arg extends [infer A0, infer A1, infer A2, infer A3] ? [k6.k6/experimental/browser.Unboxed<A0>, k6.k6/experimental/browser.Unboxed<A1>, k6.k6/experimental/browser.Unboxed<A2>, k6.k6/experimental/browser.Unboxed<A3>] : Arg extends std.Array<infer T> ? std.Array<k6.k6/experimental/browser.Unboxed<T>> : Arg extends object ? {[ Key in keyof Arg ]: k6.k6/experimental/browser.Unboxed<Arg[Key]>} : Arg
  }}}
  */
@js.native
trait Unboxed[Arg] extends StObject
