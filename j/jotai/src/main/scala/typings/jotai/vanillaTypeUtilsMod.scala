package typings.jotai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaTypeUtilsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    AtomType extends jotai.jotai/vanilla/atom.WritableAtom<any, infer Args, any> ? Args : never
    }}}
    */
  @js.native
  trait ExtractAtomArgs[AtomType] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    AtomType extends jotai.jotai/vanilla/atom.WritableAtom<any, std.Array<any>, infer Result> ? Result : never
    }}}
    */
  @js.native
  trait ExtractAtomResult[AtomType] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    AtomType extends jotai.jotai/vanilla/atom.Atom<infer Value> ? Value : never
    }}}
    */
  @js.native
  trait ExtractAtomValue[AtomType] extends StObject
  
  type Getter = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jotai.jotai/vanilla/atom.Read<unknown, never>>[0] */ js.Any
  
  type SetStateAction[Value] = /* import warning: importer.ImportType#apply Failed type conversion: jotai.jotai/vanilla/typeUtils.ExtractAtomArgs<jotai.jotai/vanilla/atom.PrimitiveAtom<Value>>[0] */ js.Any
  
  type Setter = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jotai.jotai/vanilla/atom.Write<std.Array<unknown>, unknown>>[1] */ js.Any
}
