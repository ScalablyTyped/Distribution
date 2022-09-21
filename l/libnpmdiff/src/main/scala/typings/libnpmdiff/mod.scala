package typings.libnpmdiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Fetches the registry tarballs and compare files between a spec a and spec b.
    *
    * Returns a Promise that fullfils with a String containing the resulting patch diffs.
    *
    * Throws an error if either `a` or `b` are missing or if trying to diff more than two specs.
    *
    * ### Read more
    * * https://github.com/npm/libnpmdiff#api
    */
  inline def apply(
    /**
    * `npm` spec types are usually described in `<pkg-name>@<version>` form
    * but multiple other types are alsos supported, for more info on valid specs
    * take a look at [`npm-package-arg`](https://github.com/npm/npm-package-arg)
    */
  specs: Specs
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(specs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(
    /**
    * `npm` spec types are usually described in `<pkg-name>@<version>` form
    * but multiple other types are alsos supported, for more info on valid specs
    * take a look at [`npm-package-arg`](https://github.com/npm/npm-package-arg)
    */
  specs: Specs,
    /**
    * Options for `libnpmdiff`.
    *
    * ### Read more
    * * https://github.com/npm/libnpmdiff#api
    */
  options: Options
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(specs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("libnpmdiff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DiffOptions extends StObject {
    
    /**
      * Should add ANSI colors to string ouput?
      *
      * Default: `false`
      *
      * ## Read more
      * * https://github.com/npm/libnpmdiff#api
      * *  [ANSI colors](https://en.wikipedia.org/wiki/ANSI_escape_code#Colors)
      */
    var color: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Destination prefix to be used in output.
      *
      * Default: `"b/"`
      *
      * ### Read more
      * * https://github.com/npm/libnpmdiff#api
      * * https://docs.npmjs.com/cli/v7/commands/npm-diff#diff-dst-prefix
      */
    var diffDstPrefix: js.UndefOr[String] = js.undefined
    
    /**
      *  If set only prints patches for the files listed in this array
      * (also accepts globs).
      *
      * Defaults: `undefined`
      *
      * ### Read more
      * * https://github.com/npm/libnpmdiff#api
      */
    var diffFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Ignore whitespace when comparing lines
      *
      * Default: `false`
      *
      * ### Read more
      * * https://docs.npmjs.com/cli/v7/commands/npm-diff#diff-ignore-all-space
      */
    var diffIgnoreAllSpace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prints only filenames
      *
      * Default: `false`
      *
      * ### Read more
      * * https://github.com/npm/libnpmdiff#api
      * * https://docs.npmjs.com/cli/v7/commands/npm-diff#diff-name-only
      */
    var diffNameOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not show any source or destination prefix in output.
      *
      * > Note: This causes `libnpmdiff` to ignore `diffSrcPrefix` and `diffDstPrefix` options.
      *
      * ### Read more
      * * https://github.com/npm/libnpmdiff#api
      * * https://docs.npmjs.com/cli/v7/commands/npm-diff#diff-no-prefix
      */
    var diffNoPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Source prefix to be used in output.
      *
      * Default: `"a/"`
      *
      * ### Read more
      * * https://github.com/npm/libnpmdiff#api
      * * https://docs.npmjs.com/cli/v7/commands/npm-diff#diff-src-prefix
      */
    var diffSrcPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * The number of lines of context to return.
      *
      * Default: `3`
      *
      * ### Read more
      *  * https://github.com/npm/libnpmdiff#api
      *  * https://docs.npmjs.com/cli/v7/commands/npm-diff#diff-unified
      */
    var diffUnified: js.UndefOr[Double] = js.undefined
    
    /**
      * What prefix should be used to define version numbers.
      *
      * Default: `'v'`
      *
      * ## Read more
      * * https://github.com/npm/libnpmdiff#api
      */
    var tagVersionPrefix: js.UndefOr[String] = js.undefined
  }
  object DiffOptions {
    
    inline def apply(): DiffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffOptions]
    }
    
    extension [Self <: DiffOptions](x: Self) {
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDiffDstPrefix(value: String): Self = StObject.set(x, "diffDstPrefix", value.asInstanceOf[js.Any])
      
      inline def setDiffDstPrefixUndefined: Self = StObject.set(x, "diffDstPrefix", js.undefined)
      
      inline def setDiffFiles(value: js.Array[String]): Self = StObject.set(x, "diffFiles", value.asInstanceOf[js.Any])
      
      inline def setDiffFilesUndefined: Self = StObject.set(x, "diffFiles", js.undefined)
      
      inline def setDiffFilesVarargs(value: String*): Self = StObject.set(x, "diffFiles", js.Array(value*))
      
      inline def setDiffIgnoreAllSpace(value: Boolean): Self = StObject.set(x, "diffIgnoreAllSpace", value.asInstanceOf[js.Any])
      
      inline def setDiffIgnoreAllSpaceUndefined: Self = StObject.set(x, "diffIgnoreAllSpace", js.undefined)
      
      inline def setDiffNameOnly(value: Boolean): Self = StObject.set(x, "diffNameOnly", value.asInstanceOf[js.Any])
      
      inline def setDiffNameOnlyUndefined: Self = StObject.set(x, "diffNameOnly", js.undefined)
      
      inline def setDiffNoPrefix(value: Boolean): Self = StObject.set(x, "diffNoPrefix", value.asInstanceOf[js.Any])
      
      inline def setDiffNoPrefixUndefined: Self = StObject.set(x, "diffNoPrefix", js.undefined)
      
      inline def setDiffSrcPrefix(value: String): Self = StObject.set(x, "diffSrcPrefix", value.asInstanceOf[js.Any])
      
      inline def setDiffSrcPrefixUndefined: Self = StObject.set(x, "diffSrcPrefix", js.undefined)
      
      inline def setDiffUnified(value: Double): Self = StObject.set(x, "diffUnified", value.asInstanceOf[js.Any])
      
      inline def setDiffUnifiedUndefined: Self = StObject.set(x, "diffUnified", js.undefined)
      
      inline def setTagVersionPrefix(value: String): Self = StObject.set(x, "tagVersionPrefix", value.asInstanceOf[js.Any])
      
      inline def setTagVersionPrefixUndefined: Self = StObject.set(x, "tagVersionPrefix", js.undefined)
    }
  }
  
  /**
    * Options for `libnpmdiff`.
    *
    * ### Read more
    * * https://github.com/npm/libnpmdiff#api
    */
  trait Options
    extends StObject
       with typings.pacote.mod.Options
       with DiffOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  /**
    * `npm` spec types are usually described in `<pkg-name>@<version>` form
    * but multiple other types are alsos supported, for more info on valid specs
    * take a look at [`npm-package-arg`](https://github.com/npm/npm-package-arg)
    */
  type Specs = js.Tuple2[String, String]
}
