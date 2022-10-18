package typings.jimpCore

import typings.jimpCore.anon.Decoders
import typings.jimpCore.typesEtcMod.Image
import typings.jimpCore.typesPluginsMod.JimpPlugin
import typings.jimpCore.typesPluginsMod.JimpType
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  type FunctionRet[T] = js.Array[js.Function1[/* props */ js.Array[Any] | scala.Nothing, T]]
  
  type GetIntersectionFromPlugins[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] = UnionToIntersection[Exclude[GetPluginFuncArrValues[PluginFuncArr], Unit]]
  
  type GetIntersectionFromPluginsStatics[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] = UnionToIntersection[GetPluginFuncArrConsts[PluginFuncArr]] & Decoders[PluginFuncArr]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Q extends / * Inlined std.Required<{  class :any}> * /
  {  class :any} | / * Inlined std.Required<{  constants :any}> * /
  {  constants :any} ? @jimp/core.@jimp/core/types/utils.WellFormedConstants<Q> : {}
    }}}
    */
  @js.native
  trait GetPluginConst[Q] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Q extends / * Inlined std.Required<{  class :any}> * /
  {  class :any} | / * Inlined std.Required<{  constants :any}> * /
  {  constants :any} ? Q extends {  decoders :infer Decoders} ? Decoders : {} : {}
    }}}
    */
  @js.native
  trait GetPluginDecoders[Q] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Q extends / * Inlined std.Required<{  class :any}> * /
  {  class :any} | / * Inlined std.Required<{  constants :any}> * /
  {  constants :any} ? Q extends {  encoders :infer Encoders} ? Encoders : {} : {}
    }}}
    */
  @js.native
  trait GetPluginEncoders[Q] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    // Given an array of types infer `Q` (Q should be the type value)
  PluginFuncArr extends std.ReadonlyArray<infer F> ? F extends (): infer Q ? // Get the plugin constants, may be ill-formed or well-formed
  @jimp/core.@jimp/core/types/utils.GetPluginConst<Q> : // This should never be reached
  undefined : undefined
    }}}
    */
  @js.native
  trait GetPluginFuncArrConsts[PluginFuncArr] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    // Given an array of types infer `Q` (Q should be the type value)
  PluginFuncArr extends std.ReadonlyArray<infer F> ? F extends (): infer Q ? // Get the plugin decoders, may be ill-formed or well-formed
  @jimp/core.@jimp/core/types/utils.GetPluginDecoders<Q> : // This should never be reached
  undefined : undefined
    }}}
    */
  @js.native
  trait GetPluginFuncArrDecoders[PluginFuncArr] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    // Given an array of types infer `Q` (Q should be the type value)
  PluginFuncArr extends std.ReadonlyArray<infer F> ? F extends (): infer Q ? // Get the plugin encoders, may be ill-formed or well-formed
  @jimp/core.@jimp/core/types/utils.GetPluginEncoders<Q> : // This should never be reached
  undefined : undefined
    }}}
    */
  @js.native
  trait GetPluginFuncArrEncoders[PluginFuncArr] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    // Given an array of types infer `Q` (Q should be the type value)
  PluginFuncArr extends std.ReadonlyArray<infer F> ? F extends (): infer Q ? // Get the plugin value, may be ill-formed or well-formed
  @jimp/core.@jimp/core/types/utils.GetPluginVal<Q> : // This should never be reached
  undefined : undefined
    }}}
    */
  @js.native
  trait GetPluginFuncArrValues[PluginFuncArr] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Q extends / * Inlined std.Required<{  class :any}> * /
  {  class :any} | / * Inlined std.Required<{  constants :any}> * /
  {  constants :any} ? @jimp/core.@jimp/core/types/utils.WellFormedValues<Q> : Q
    }}}
    */
  @js.native
  trait GetPluginVal[Q] extends StObject
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    U extends any ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {  constants :infer Constants} ? Constants : {}
    }}}
    */
  @js.native
  trait WellFormedConstants[T /* <: Any */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {  class :infer Class} ? Class : {}
    }}}
    */
  @js.native
  trait WellFormedValues[T /* <: Any */] extends StObject
}
