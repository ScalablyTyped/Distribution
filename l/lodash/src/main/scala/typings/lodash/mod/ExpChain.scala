package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends {  __trapAny :any} ? lodash.lodash.CollectionChain<any> & lodash.lodash.FunctionChain<any> & lodash.lodash.ObjectChain<any> & lodash.lodash.PrimitiveChain<any> & lodash.lodash.StringChain : T extends null | undefined ? never : T extends string ? lodash.lodash.StringChain : T extends string | null | undefined ? lodash.lodash.StringNullableChain : T extends (args : any): any ? lodash.lodash.FunctionChain<T> : T extends lodash.lodash.List<infer U> | null | undefined ? lodash.lodash.CollectionChain<U> : T extends object | null | undefined ? lodash.lodash.ObjectChain<T> : lodash.lodash.PrimitiveChain<T>
  }}}
  */
@js.native
trait ExpChain[T] extends StObject
