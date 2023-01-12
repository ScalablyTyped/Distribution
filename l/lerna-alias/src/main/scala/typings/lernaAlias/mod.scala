package typings.lernaAlias

import org.scalablytyped.runtime.StringDictionary
import typings.lernaAlias.lernaAliasBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lerna-alias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jest(): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("jest")().asInstanceOf[Aliases]
  inline def jest(options: Options): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("jest")(options.asInstanceOf[js.Any]).asInstanceOf[Aliases]
  
  inline def rollup(): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("rollup")().asInstanceOf[Aliases]
  inline def rollup(options: Options): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(options.asInstanceOf[js.Any]).asInstanceOf[Aliases]
  
  inline def webpack(): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("webpack")().asInstanceOf[Aliases]
  inline def webpack(options: Options): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("webpack")(options.asInstanceOf[js.Any]).asInstanceOf[Aliases]
  
  type Aliases = /**
    * Key is the package name or an appropriate mapping for the tool.
    * Value is a local directory path to the package resolved using
    * `sourceDirectory` and `mainFields` options.
    */
  StringDictionary[String]
  
  trait Options extends StObject {
    
    /**
      * From which directory the lerna monorepo should be searched for
      * @default `process.cwd()`
      */
    var directory: js.UndefOr[String] = js.undefined
    
    /**
      * Optional array of `mainFields` that should be used to resolve package's entry point,
      * similar to https://webpack.js.org/configuration/resolve/#resolve-mainfields .
      * Using this takes precedence over default `sourceDirectory` option.
      */
    var mainFields: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Which directory should be considered as containing source files of a package.
      * If specified as false it will use package's root.
      * @default 'src'
      */
    var sourceDirectory: js.UndefOr[String | `false`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
      
      inline def setSourceDirectory(value: String | `false`): Self = StObject.set(x, "sourceDirectory", value.asInstanceOf[js.Any])
      
      inline def setSourceDirectoryUndefined: Self = StObject.set(x, "sourceDirectory", js.undefined)
    }
  }
}
