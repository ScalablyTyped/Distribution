package typings.kebabcaseKeys

import typings.kebabcaseKeys.kebabcaseKeysBooleans.`false`
import typings.kebabcaseKeys.kebabcaseKeysBooleans.`true`
import typings.kebabcaseKeys.kebabcaseKeysStrings.`-_`
import typings.std.Uncapitalize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Convert object keys to kebabcase.
    * @param input - Object or array of objects to snake-case.
    * @param options - Options of conversion.
    */
  inline def apply[T /* <: CustomJsonObject | js.Array[CustomJsonObject] */, OptionsType /* <: Options */](input: T): KebabCasedProperties[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      js.Array[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[KebabCasedProperties[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      js.Array[Any]
    ]
  ]]
  inline def apply[T /* <: CustomJsonObject | js.Array[CustomJsonObject] */, OptionsType /* <: Options */](input: T, options: OptionsType): KebabCasedProperties[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      js.Array[Any]
    ]
  ] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KebabCasedProperties[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      js.Array[Any]
    ]
  ]]
  
  @JSImport("kebabcase-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferT}${WordSeparators}${inferU} * / string ? kebabcase-keys.kebabcase-keys.ContainWordSeparatorsToKebab<S> : S extends std.Uppercase<S> ? std.Lowercase<S> : S extends std.Capitalize<S> ? kebabcase-keys.kebabcase-keys.PascalToKebab<S> : kebabcase-keys.kebabcase-keys.CamelToKebab<S>
    }}}
    */
  type AnyCaseToKebab[S /* <: String */] = S
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferT}${inferU} * / string ? / * template literal string: ${TextendsCapitalize<T>?-:}${Lowercase<T>}${CamelToKebab<U>} * / string : S
    }}}
    */
  type CamelToKebab[S /* <: String */] = S
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferT}-${inferU} * / string ? S : S extends / * template literal string: ${inferT}_${inferU} * / string ? kebabcase-keys.kebabcase-keys.SnakeToKebab<std.Lowercase<S>> : kebabcase-keys.kebabcase-keys.SpaceToKebab<S>
    }}}
    */
  type ContainWordSeparatorsToKebab[S /* <: String */] = S
  
  type CustomJsonArray = js.Array[CustomJsonValue]
  
  // Extended versions of https://github.com/sindresorhus/type-fest#json
  @js.native
  trait CustomJsonObject extends StObject
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type CustomJsonValue = kebabcase-keys.kebabcase-keys.JsonPrimitive | object | kebabcase-keys.kebabcase-keys.CustomJsonObject | kebabcase-keys.kebabcase-keys.CustomJsonArray
  }}}
  to avoid circular code involving: 
  - kebabcase-keys.kebabcase-keys.CustomJsonArray
  - kebabcase-keys.kebabcase-keys.CustomJsonValue
  */
  type CustomJsonValue = JsonPrimitive | js.Object | CustomJsonObject | Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Value extends [Value[0], ...infer rest] ? kebabcase-keys.kebabcase-keys.IsEqual<Value[0], Item> extends true ? true : kebabcase-keys.kebabcase-keys.Includes<rest, Item> : false
    }}}
    */
  type Includes[Value /* <: js.Array[Any] */, Item] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    std.Array<A> extends std.Array<B> ? std.Array<B> extends std.Array<A> ? true : false : false
    }}}
    */
  type IsEqual[A, B] = `true`
  
  // based on https://github.com/DefinitelyTyped/DefinitelyTyped/pull/59806#pullrequestreview-942584759
  // Copied from https://github.com/sindresorhus/type-fest
  type JsonPrimitive = String | Double | Boolean | Null
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends number ? / * template literal string: ${S} * / string : S extends symbol ? never : S extends string ? kebabcase-keys.kebabcase-keys.AnyCaseToKebab<S> : S
    }}}
    */
  type KebabCase[S /* <: String | Double | js.Symbol */] = S
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<kebabcase-keys.kebabcase-keys.CustomJsonObject> ? {[ Key in keyof T ]: kebabcase-keys.kebabcase-keys.KebabCasedProperties<T[Key], Deep, Exclude>} : T extends kebabcase-keys.kebabcase-keys.CustomJsonObject ? {[ Key in keyof T as std.Array<kebabcase-keys.kebabcase-keys.Includes<Exclude, Key>> extends std.Array<true>? Key : kebabcase-keys.kebabcase-keys.KebabCase<Key> ]: T[Key] extends kebabcase-keys.kebabcase-keys.CustomJsonObject | std.Array<kebabcase-keys.kebabcase-keys.CustomJsonObject>? std.Array<Deep> extends std.Array<true>? kebabcase-keys.kebabcase-keys.KebabCasedProperties<T[Key], Deep, Exclude> : T[Key] : T[Key]} : T
    }}}
    */
  type KebabCasedProperties[T, Deep /* <: Boolean */, Exclude /* <: js.Array[String | js.RegExp] */] = T
  
  trait Options extends StObject {
    
    /**
      * Recurse nested objects and objects in arrays.
      * @default false
      */
    val deep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Exclude keys from being kebab-cased.
      * @default []
      */
    val exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setExclude(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
  
  type PascalToKebab[S /* <: String */] = CamelToKebab[Uncapitalize[S]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferT}_${inferU} * / string ? / * template literal string: ${T}-${SnakeToKebab<U>} * / string : S
    }}}
    */
  type SnakeToKebab[S /* <: String */] = S
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferT}${Whitespace}${inferU} * / string ? / * template literal string: ${T}-${SnakeToKebab<U>} * / string : S
    }}}
    */
  type SpaceToKebab[S /* <: String */] = S
  
  /* Rewritten from type alias, can be one of: 
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket9Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketARightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketBRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketCRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketDRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket20Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket85Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketA0Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket1680Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2000Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2001Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2002Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2003Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2004Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2005Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2006Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2007Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2008Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2009Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket200ARightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2028Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2029Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket202FRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket205FRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket3000Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketFEFFRightcurlybracket
  */
  trait Whitespace extends StObject
  object Whitespace {
    
    inline def uLeftcurlybracket1680Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket1680Rightcurlybracket = "u{1680}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket1680Rightcurlybracket]
    
    inline def uLeftcurlybracket2000Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2000Rightcurlybracket = "u{2000}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2000Rightcurlybracket]
    
    inline def uLeftcurlybracket2001Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2001Rightcurlybracket = "u{2001}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2001Rightcurlybracket]
    
    inline def uLeftcurlybracket2002Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2002Rightcurlybracket = "u{2002}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2002Rightcurlybracket]
    
    inline def uLeftcurlybracket2003Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2003Rightcurlybracket = "u{2003}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2003Rightcurlybracket]
    
    inline def uLeftcurlybracket2004Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2004Rightcurlybracket = "u{2004}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2004Rightcurlybracket]
    
    inline def uLeftcurlybracket2005Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2005Rightcurlybracket = "u{2005}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2005Rightcurlybracket]
    
    inline def uLeftcurlybracket2006Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2006Rightcurlybracket = "u{2006}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2006Rightcurlybracket]
    
    inline def uLeftcurlybracket2007Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2007Rightcurlybracket = "u{2007}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2007Rightcurlybracket]
    
    inline def uLeftcurlybracket2008Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2008Rightcurlybracket = "u{2008}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2008Rightcurlybracket]
    
    inline def uLeftcurlybracket2009Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2009Rightcurlybracket = "u{2009}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2009Rightcurlybracket]
    
    inline def uLeftcurlybracket200ARightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket200ARightcurlybracket = "u{200A}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket200ARightcurlybracket]
    
    inline def uLeftcurlybracket2028Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2028Rightcurlybracket = "u{2028}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2028Rightcurlybracket]
    
    inline def uLeftcurlybracket2029Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2029Rightcurlybracket = "u{2029}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2029Rightcurlybracket]
    
    inline def uLeftcurlybracket202FRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket202FRightcurlybracket = "u{202F}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket202FRightcurlybracket]
    
    inline def uLeftcurlybracket205FRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket205FRightcurlybracket = "u{205F}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket205FRightcurlybracket]
    
    inline def uLeftcurlybracket20Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket20Rightcurlybracket = "u{20}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket20Rightcurlybracket]
    
    inline def uLeftcurlybracket3000Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket3000Rightcurlybracket = "u{3000}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket3000Rightcurlybracket]
    
    inline def uLeftcurlybracket85Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket85Rightcurlybracket = "u{85}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket85Rightcurlybracket]
    
    inline def uLeftcurlybracket9Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket9Rightcurlybracket = "u{9}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket9Rightcurlybracket]
    
    inline def uLeftcurlybracketA0Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketA0Rightcurlybracket = "u{A0}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketA0Rightcurlybracket]
    
    inline def uLeftcurlybracketARightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketARightcurlybracket = "u{A}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketARightcurlybracket]
    
    inline def uLeftcurlybracketBRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketBRightcurlybracket = "u{B}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketBRightcurlybracket]
    
    inline def uLeftcurlybracketCRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketCRightcurlybracket = "u{C}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketCRightcurlybracket]
    
    inline def uLeftcurlybracketDRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketDRightcurlybracket = "u{D}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketDRightcurlybracket]
    
    inline def uLeftcurlybracketFEFFRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketFEFFRightcurlybracket = "u{FEFF}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketFEFFRightcurlybracket]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends undefined ? U : T
    }}}
    */
  type WithDefault[T, U] = U
  
  /* Rewritten from type alias, can be one of: 
    - typings.kebabcaseKeys.kebabcaseKeysStrings.`-_`
    - typings.kebabcaseKeys.kebabcaseKeysStrings._underscore
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket9Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketARightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketBRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketCRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketDRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket20Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket85Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketA0Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket1680Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2000Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2001Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2002Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2003Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2004Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2005Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2006Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2007Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2008Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2009Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket200ARightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2028Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2029Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket202FRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket205FRightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket3000Rightcurlybracket
    - typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketFEFFRightcurlybracket
  */
  trait WordSeparators extends StObject
  object WordSeparators {
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def _underscore: typings.kebabcaseKeys.kebabcaseKeysStrings._underscore = "_".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings._underscore]
    
    inline def uLeftcurlybracket1680Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket1680Rightcurlybracket = "u{1680}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket1680Rightcurlybracket]
    
    inline def uLeftcurlybracket2000Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2000Rightcurlybracket = "u{2000}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2000Rightcurlybracket]
    
    inline def uLeftcurlybracket2001Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2001Rightcurlybracket = "u{2001}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2001Rightcurlybracket]
    
    inline def uLeftcurlybracket2002Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2002Rightcurlybracket = "u{2002}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2002Rightcurlybracket]
    
    inline def uLeftcurlybracket2003Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2003Rightcurlybracket = "u{2003}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2003Rightcurlybracket]
    
    inline def uLeftcurlybracket2004Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2004Rightcurlybracket = "u{2004}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2004Rightcurlybracket]
    
    inline def uLeftcurlybracket2005Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2005Rightcurlybracket = "u{2005}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2005Rightcurlybracket]
    
    inline def uLeftcurlybracket2006Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2006Rightcurlybracket = "u{2006}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2006Rightcurlybracket]
    
    inline def uLeftcurlybracket2007Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2007Rightcurlybracket = "u{2007}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2007Rightcurlybracket]
    
    inline def uLeftcurlybracket2008Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2008Rightcurlybracket = "u{2008}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2008Rightcurlybracket]
    
    inline def uLeftcurlybracket2009Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2009Rightcurlybracket = "u{2009}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2009Rightcurlybracket]
    
    inline def uLeftcurlybracket200ARightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket200ARightcurlybracket = "u{200A}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket200ARightcurlybracket]
    
    inline def uLeftcurlybracket2028Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2028Rightcurlybracket = "u{2028}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2028Rightcurlybracket]
    
    inline def uLeftcurlybracket2029Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2029Rightcurlybracket = "u{2029}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket2029Rightcurlybracket]
    
    inline def uLeftcurlybracket202FRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket202FRightcurlybracket = "u{202F}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket202FRightcurlybracket]
    
    inline def uLeftcurlybracket205FRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket205FRightcurlybracket = "u{205F}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket205FRightcurlybracket]
    
    inline def uLeftcurlybracket20Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket20Rightcurlybracket = "u{20}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket20Rightcurlybracket]
    
    inline def uLeftcurlybracket3000Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket3000Rightcurlybracket = "u{3000}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket3000Rightcurlybracket]
    
    inline def uLeftcurlybracket85Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket85Rightcurlybracket = "u{85}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket85Rightcurlybracket]
    
    inline def uLeftcurlybracket9Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket9Rightcurlybracket = "u{9}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracket9Rightcurlybracket]
    
    inline def uLeftcurlybracketA0Rightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketA0Rightcurlybracket = "u{A0}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketA0Rightcurlybracket]
    
    inline def uLeftcurlybracketARightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketARightcurlybracket = "u{A}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketARightcurlybracket]
    
    inline def uLeftcurlybracketBRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketBRightcurlybracket = "u{B}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketBRightcurlybracket]
    
    inline def uLeftcurlybracketCRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketCRightcurlybracket = "u{C}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketCRightcurlybracket]
    
    inline def uLeftcurlybracketDRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketDRightcurlybracket = "u{D}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketDRightcurlybracket]
    
    inline def uLeftcurlybracketFEFFRightcurlybracket: typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketFEFFRightcurlybracket = "u{FEFF}".asInstanceOf[typings.kebabcaseKeys.kebabcaseKeysStrings.uLeftcurlybracketFEFFRightcurlybracket]
  }
}
