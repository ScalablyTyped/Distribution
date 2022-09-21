package typings.humps

import typings.humps.mod.CamelToSnakeCase
import typings.humps.mod.Camelized
import typings.humps.mod.Decamelized
import typings.humps.mod.Depascalized
import typings.humps.mod.OptionOrProcessor
import typings.humps.mod.PascalToSnakeCase
import typings.humps.mod.Pascalized
import typings.humps.mod.SnakeToCamelCase
import typings.humps.mod.SnakeToPascalCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object humps {
    
    @JSGlobal("humps")
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
  }
}
