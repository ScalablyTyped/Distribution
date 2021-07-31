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
  
  @scala.inline
  def jest(): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("jest")().asInstanceOf[Aliases]
  @scala.inline
  def jest(options: Options): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("jest")(options.asInstanceOf[js.Any]).asInstanceOf[Aliases]
  
  @scala.inline
  def rollup(): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("rollup")().asInstanceOf[Aliases]
  @scala.inline
  def rollup(options: Options): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(options.asInstanceOf[js.Any]).asInstanceOf[Aliases]
  
  @scala.inline
  def webpack(): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("webpack")().asInstanceOf[Aliases]
  @scala.inline
  def webpack(options: Options): Aliases = ^.asInstanceOf[js.Dynamic].applyDynamic("webpack")(options.asInstanceOf[js.Any]).asInstanceOf[Aliases]
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      @scala.inline
      def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
      
      @scala.inline
      def setSourceDirectory(value: String | `false`): Self = StObject.set(x, "sourceDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirectoryUndefined: Self = StObject.set(x, "sourceDirectory", js.undefined)
    }
  }
}
