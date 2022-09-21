package typings.gulpHash

import org.scalablytyped.runtime.Shortcut
import typings.gulpHash.mod.GulpHash.ManifestOptions
import typings.gulpHash.mod.GulpHash.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-hash", JSImport.Namespace)
  @js.native
  val ^ : GulpHash = js.native
  
  @js.native
  trait GulpHash extends StObject {
    
    def apply(): Any = js.native
    def apply(options: Options): Any = js.native
    
    def manifest(manifestPath: String): Any = js.native
    def manifest(manifestPath: String, append: Boolean): Any = js.native
    def manifest(manifestPath: String, append: Boolean, space: String): Any = js.native
    def manifest(manifestPath: String, append: Unit, space: String): Any = js.native
    def manifest(manifestPath: String, options: ManifestOptions): Any = js.native
  }
  object GulpHash {
    
    trait ManifestOptions extends StObject {
      
      /**
        * Whether to merge the new manifest with an existing one's contents (same filename, doesn't have to exist before first run)
        *
        * @default true
        */
      var append: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If set to true, deletes old versions of hashed files
        *
        * @default false
        */
      var deleteOld: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Used with deleteOld. Specifies where to search for old files to delete.
        *
        * @default __dirname
        */
      var sourceDir: js.UndefOr[String] = js.undefined
      
      /**
        * The space parameter for JSON.stringify()
        *
        * @default null
        */
      var space: js.UndefOr[String | Null] = js.undefined
    }
    object ManifestOptions {
      
      inline def apply(): ManifestOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ManifestOptions]
      }
      
      extension [Self <: ManifestOptions](x: Self) {
        
        inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
        
        inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
        
        inline def setDeleteOld(value: Boolean): Self = StObject.set(x, "deleteOld", value.asInstanceOf[js.Any])
        
        inline def setDeleteOldUndefined: Self = StObject.set(x, "deleteOld", js.undefined)
        
        inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
        
        inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
        
        inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        inline def setSpaceNull: Self = StObject.set(x, "space", null)
        
        inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      }
    }
    
    trait Options extends StObject {
      
      /**
        * A hashing algorithm for crypto.createHash
        *
        * @default 'sha1'
        */
      var algorithm: js.UndefOr[String] = js.undefined
      
      /**
        * The length of the hash to add to the file's name (slice from the start of the full hash)
        *
        * @default 8
        */
      var hashLength: js.UndefOr[Double] = js.undefined
      
      /**
        * The template used when adding the hash
        *
        * @default '<%= name %>-<%= hash %><%= ext %>'
        */
      var template: js.UndefOr[String] = js.undefined
      
      /**
        * A key to change the files' hashes without actually changing their content; appended to the contents when hashing
        */
      var version: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
        
        inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
        
        inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
        
        inline def setHashLengthUndefined: Self = StObject.set(x, "hashLength", js.undefined)
        
        inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
  }
  
  type _To = GulpHash
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpHash = ^
}
