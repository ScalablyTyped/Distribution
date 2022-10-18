package typings.gulpReplace

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Searches and replaces a portion of text using a `string` or a `RegExp`.
    *
    * @param search       The `string` or `RegExp` to search for.
    *
    * @param replacement  The replacement string or a function for generating a replacement.
    *
    *                     If `replacement` is a function, it will be called once for each match and will be passed the string
    *                     that is to be replaced. The value of `this.file` will be equal to the vinyl instance for the file
    *                     being processed.
    *
    *                     Read more at [`String.prototype.replace()` at MDN web docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace#Specifying_a_string_as_a_parameter").
    *
    * @param options      `options.skipBinary` will be equal to `true` by default.
    *
    *                     Skip binary files. This option is `true` by default. If
    *                     you want to replace content in binary files, you must explicitly set it to `false`.
    */
  inline def apply(search: String, replacement: String): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(search: String, replacement: String, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(search: String, replacement: Replacer): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(search: String, replacement: Replacer, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(search: js.RegExp, replacement: String): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(search: js.RegExp, replacement: String, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(search: js.RegExp, replacement: Replacer): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(search: js.RegExp, replacement: Replacer, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents options for `gulp-replace`.
    */
  trait Options extends StObject {
    
    /**
      * A value indicating whether binary files should be skipped.
      */
    var skipBinary: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSkipBinary(value: Boolean): Self = StObject.set(x, "skipBinary", value.asInstanceOf[js.Any])
      
      inline def setSkipBinaryUndefined: Self = StObject.set(x, "skipBinary", js.undefined)
    }
  }
  
  /**
    * Represents a method for replacing contents of a vinyl-file.
    */
  @js.native
  trait Replacer extends StObject {
    
    def apply(`match`: String, args: Any*): String = js.native
  }
  
  /**
    * The context of the replacer-function.
    */
  trait ReplacerContext extends StObject {
    
    /**
      * The file being processed.
      */
    var file: File
  }
  object ReplacerContext {
    
    inline def apply(file: File): ReplacerContext = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplacerContext]
    }
    
    extension [Self <: ReplacerContext](x: Self) {
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
