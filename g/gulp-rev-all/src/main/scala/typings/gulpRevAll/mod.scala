package typings.gulpRevAll

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-rev-all", JSImport.Namespace)
  @js.native
  val ^ : GulpRevAll = js.native
  
  @js.native
  trait GulpRevAll extends StObject {
    
    def manifestFile(): Any = js.native
    
    def revision(): Any = js.native
    def revision(options: Options): Any = js.native
    
    def versionFile(): Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * If you set this options to true, verbose logging will be emitted to console.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't rename, search or update refrences in files matching these rules
      *
      * @default [ /^\/favicon.ico$/ ]
      */
    var dontGlobal: js.UndefOr[js.Array[js.RegExp | String]] = js.undefined
    
    /**
      * Don't rename files matching these rules
      *
      * @default []
      */
    var dontRenameFile: js.UndefOr[js.Array[js.RegExp | String]] = js.undefined
    
    /**
      * Don't search for references in files matching these rules
      *
      * @default []
      */
    var dontSearchFile: js.UndefOr[js.Array[js.RegExp | String]] = js.undefined
    
    /**
      * Don't update references matching these rules
      *
      * @default []
      */
    var dontUpdateReference: js.UndefOr[js.Array[js.RegExp | String]] = js.undefined
    
    /**
      * Set the filename of the file created by revAll.manifestFile()
      *
      * @default 'rev-version.json'
      */
    var fileNameManifest: js.UndefOr[String] = js.undefined
    
    /**
      * Set the filename of the file created by revAll.versionFile()
      *
      * @default 'rev-version.json'
      */
    var fileNameVersion: js.UndefOr[String] = js.undefined
    
    /**
      * Change the length of the hash appended to the end of each revisioned
      * file (use transformFilename for more complicated scenarios).
      *
      * @default 8
      */
    var hashLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Add only specific file types to the manifest file
      *
      * @default ['.css', '.js']
      */
    var includeFilesInManifest: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Prefixes absolute references with a string (use transformPath for
      * more complicated scenarios). Useful for adding a full url path to
      * files.
      *
      * @default none
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * If the default naming convention does not suite your needs, you can
      * specify a custom filename transform.
      *
      * @param file file to be revisioned
      * @param hash calculated hash of the file
      */
    var transformFilename: js.UndefOr[js.Function2[/* file */ Any, /* hash */ String, String]] = js.undefined
    
    /**
      * Specify a function to transform the reference path. Useful in
      * instances where the local file structure does not reflect what the
      * remote file structure will be.
      *
      * @param rev revisioned reference path
      * @param source original reference path
      * @param path path to the file
      *
      * @default none
      */
    var transformPath: js.UndefOr[js.Function3[/* rev */ String, /* source */ String, /* path */ String, String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDontGlobal(value: js.Array[js.RegExp | String]): Self = StObject.set(x, "dontGlobal", value.asInstanceOf[js.Any])
      
      inline def setDontGlobalUndefined: Self = StObject.set(x, "dontGlobal", js.undefined)
      
      inline def setDontGlobalVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "dontGlobal", js.Array(value*))
      
      inline def setDontRenameFile(value: js.Array[js.RegExp | String]): Self = StObject.set(x, "dontRenameFile", value.asInstanceOf[js.Any])
      
      inline def setDontRenameFileUndefined: Self = StObject.set(x, "dontRenameFile", js.undefined)
      
      inline def setDontRenameFileVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "dontRenameFile", js.Array(value*))
      
      inline def setDontSearchFile(value: js.Array[js.RegExp | String]): Self = StObject.set(x, "dontSearchFile", value.asInstanceOf[js.Any])
      
      inline def setDontSearchFileUndefined: Self = StObject.set(x, "dontSearchFile", js.undefined)
      
      inline def setDontSearchFileVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "dontSearchFile", js.Array(value*))
      
      inline def setDontUpdateReference(value: js.Array[js.RegExp | String]): Self = StObject.set(x, "dontUpdateReference", value.asInstanceOf[js.Any])
      
      inline def setDontUpdateReferenceUndefined: Self = StObject.set(x, "dontUpdateReference", js.undefined)
      
      inline def setDontUpdateReferenceVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "dontUpdateReference", js.Array(value*))
      
      inline def setFileNameManifest(value: String): Self = StObject.set(x, "fileNameManifest", value.asInstanceOf[js.Any])
      
      inline def setFileNameManifestUndefined: Self = StObject.set(x, "fileNameManifest", js.undefined)
      
      inline def setFileNameVersion(value: String): Self = StObject.set(x, "fileNameVersion", value.asInstanceOf[js.Any])
      
      inline def setFileNameVersionUndefined: Self = StObject.set(x, "fileNameVersion", js.undefined)
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setHashLengthUndefined: Self = StObject.set(x, "hashLength", js.undefined)
      
      inline def setIncludeFilesInManifest(value: js.Array[String]): Self = StObject.set(x, "includeFilesInManifest", value.asInstanceOf[js.Any])
      
      inline def setIncludeFilesInManifestUndefined: Self = StObject.set(x, "includeFilesInManifest", js.undefined)
      
      inline def setIncludeFilesInManifestVarargs(value: String*): Self = StObject.set(x, "includeFilesInManifest", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTransformFilename(value: (/* file */ Any, /* hash */ String) => String): Self = StObject.set(x, "transformFilename", js.Any.fromFunction2(value))
      
      inline def setTransformFilenameUndefined: Self = StObject.set(x, "transformFilename", js.undefined)
      
      inline def setTransformPath(value: (/* rev */ String, /* source */ String, /* path */ String) => String): Self = StObject.set(x, "transformPath", js.Any.fromFunction3(value))
      
      inline def setTransformPathUndefined: Self = StObject.set(x, "transformPath", js.undefined)
    }
  }
  
  type _To = GulpRevAll
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpRevAll = ^
}
