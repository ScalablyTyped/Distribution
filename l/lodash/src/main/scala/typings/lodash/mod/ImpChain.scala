package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends {  __trapAny :any} ? lodash.lodash.Collection<any> & lodash.lodash.Function<any> & lodash.lodash.Object<any> & lodash.lodash.Primitive<any> & lodash.lodash.String : T extends null | undefined ? never : T extends string | null | undefined ? lodash.lodash.String : T extends (args : any): any ? lodash.lodash.Function<T> : T extends lodash.lodash.List<infer U> | null | undefined ? lodash.lodash.Collection<U> : T extends object | null | undefined ? lodash.lodash.Object<T> : lodash.lodash.Primitive<T>
  }}}
  */
@js.native
trait ImpChain[T] extends StObject
