package typings.humps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("humps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelize[T /* <: String */](value: T): SnakeToCamelCase[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(value.asInstanceOf[js.Any]).asInstanceOf[SnakeToCamelCase[T]]
  
  inline def camelizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def camelizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def camelizeKeys(str: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def camelizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def camelizeKeys[T](str: T): Camelized[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[Camelized[T]]
  inline def camelizeKeys[T](str: T, optionsOrProcessor: OptionOrProcessor): Camelized[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[Camelized[T]]
  
  inline def decamelize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decamelize(value: String, optionsOrProcessor: OptionOrProcessor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(value.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decamelize[T /* <: String */](value: T): CamelToSnakeCase[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(value.asInstanceOf[js.Any]).asInstanceOf[CamelToSnakeCase[T]]
  
  inline def decamelizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def decamelizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def decamelizeKeys(str: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def decamelizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def decamelizeKeys[T](str: T): Decamelized[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[Decamelized[T]]
  inline def decamelizeKeys[T](str: T, optionsOrProcessor: OptionOrProcessor): Decamelized[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[Decamelized[T]]
  
  inline def depascalize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def depascalize(value: String, optionsOrProcessor: OptionOrProcessor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalize")(value.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def depascalize[T /* <: String */](value: T): PascalToSnakeCase[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalize")(value.asInstanceOf[js.Any]).asInstanceOf[PascalToSnakeCase[T]]
  
  inline def depascalizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def depascalizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def depascalizeKeys(str: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def depascalizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def depascalizeKeys[T](str: T): Depascalized[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[Depascalized[T]]
  inline def depascalizeKeys[T](str: T, optionsOrProcessor: OptionOrProcessor): Depascalized[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[Depascalized[T]]
  
  inline def pascalize[T /* <: String */](value: T): SnakeToPascalCase[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalize")(value.asInstanceOf[js.Any]).asInstanceOf[SnakeToPascalCase[T]]
  
  inline def pascalizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def pascalizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def pascalizeKeys(str: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def pascalizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def pascalizeKeys[T](str: T): Pascalized[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[Pascalized[T]]
  inline def pascalizeKeys[T](str: T, optionsOrProcessor: OptionOrProcessor): Pascalized[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[Pascalized[T]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferT}${inferU} * / string ? / * template literal string: ${TextendsCapitalize<T>?_:}${Lowercase<T>}${CamelToSnakeCase<U>} * / string : S
    }}}
    */
  @js.native
  trait CamelToSnakeCase[S /* <: String */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as humps.humps.SnakeToCamelCase<string & K> ]: T[K] extends std.Array<infer U>? U extends {}? std.Array<humps.humps.Camelized<U>> : T[K] : T[K] extends {}? humps.humps.Camelized<T[K]> : T[K]}
    }}}
    */
  @js.native
  trait Camelized[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as humps.humps.CamelToSnakeCase<string & K> ]: T[K] extends std.Array<infer U>? U extends {}? std.Array<humps.humps.Decamelized<U>> : T[K] : T[K] extends {}? humps.humps.Decamelized<T[K]> : T[K]}
    }}}
    */
  @js.native
  trait Decamelized[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as humps.humps.CamelToSnakeCase<string & K> ]: T[K] extends std.Array<infer U>? U extends {}? std.Array<humps.humps.Decamelized<U>> : T[K] : T[K] extends {}? humps.humps.Decamelized<T[K]> : T[K]}
    }}}
    */
  @js.native
  trait Depascalized[T] extends StObject
  
  trait HumpsOptions extends StObject {
    
    var process: js.UndefOr[HumpsProcessor] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var split: js.UndefOr[js.RegExp] = js.undefined
  }
  object HumpsOptions {
    
    inline def apply(): HumpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HumpsOptions]
    }
    
    extension [Self <: HumpsOptions](x: Self) {
      
      inline def setProcess(
        value: (/* key */ String, /* convert */ HumpsProcessorParameter, /* options */ js.UndefOr[HumpsOptions]) => String
      ): Self = StObject.set(x, "process", js.Any.fromFunction3(value))
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSplit(value: js.RegExp): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  type HumpsProcessor = js.Function3[
    /* key */ String, 
    /* convert */ HumpsProcessorParameter, 
    /* options */ js.UndefOr[HumpsOptions], 
    String
  ]
  
  type HumpsProcessorParameter = js.Function2[/* key */ String, /* options */ js.UndefOr[HumpsOptions], String]
  
  type OptionOrProcessor = HumpsOptions | HumpsProcessor
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferT1}${inferT2}${inferU} * / string ? / * template literal string: ${T2extendsCapitalize<T2>?_:}${Lowercase<T1>}${Lowercase<T2>}${CamelToSnakeCase<U>} * / string : S
    }}}
    */
  @js.native
  trait PascalToSnakeCase[S /* <: String */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as humps.humps.SnakeToPascalCase<string & K> ]: T[K] extends std.Array<infer U>? U extends {}? std.Array<humps.humps.Pascalized<U>> : T[K] : T[K] extends {}? humps.humps.Pascalized<T[K]> : T[K]}
    }}}
    */
  @js.native
  trait Pascalized[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferP1}_${inferP2}${inferP3} * / string ? / * template literal string: ${P1}${Uppercase<P2>}${SnakeToCamelCase<P3>} * / string : S
    }}}
    */
  @js.native
  trait SnakeToCamelCase[S /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferP1}_${inferP2}${inferP3} * / string ? / * template literal string: ${Capitalize<P1>}${Uppercase<P2>}${SnakeToPascalCase<P3>} * / string : S
    }}}
    */
  @js.native
  trait SnakeToPascalCase[S /* <: String */] extends StObject
}
