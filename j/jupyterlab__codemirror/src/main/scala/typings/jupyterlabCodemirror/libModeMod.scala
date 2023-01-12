package typings.jupyterlabCodemirror

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.typesJsonMod.JSONValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModeMod {
  
  object Mode {
    
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addSpecLoader(loader: ISpecLoader, rank: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSpecLoader")(loader.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Ensure a codemirror mode is available by name or Codemirror spec.
      *
      * @param mode - The mode to ensure.  If it is a string, uses [findBest]
      *   to get the appropriate spec.
      *
      * @returns A promise that resolves when the mode is available.
      */
    inline def ensure(mode: String): js.Promise[ISpec | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISpec | Null]]
    inline def ensure(mode: ISpec): js.Promise[ISpec | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISpec | Null]]
    
    /**
      * Find a codemirror mode by name or CodeMirror spec.
      */
    inline def findBest(mode: String): ISpec = ^.asInstanceOf[js.Dynamic].applyDynamic("findBest")(mode.asInstanceOf[js.Any]).asInstanceOf[ISpec]
    inline def findBest(mode: ISpec): ISpec = ^.asInstanceOf[js.Dynamic].applyDynamic("findBest")(mode.asInstanceOf[js.Any]).asInstanceOf[ISpec]
    
    /**
      * Find a codemirror mode by extension.
      */
    inline def findByExtension(ext: String): ISpec | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findByExtension")(ext.asInstanceOf[js.Any]).asInstanceOf[ISpec | Null]
    inline def findByExtension(ext: js.Array[String]): ISpec | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findByExtension")(ext.asInstanceOf[js.Any]).asInstanceOf[ISpec | Null]
    
    /**
      * Find a codemirror mode by filename.
      */
    inline def findByFileName(name: String): ISpec = ^.asInstanceOf[js.Dynamic].applyDynamic("findByFileName")(name.asInstanceOf[js.Any]).asInstanceOf[ISpec]
    
    /**
      * Find a codemirror mode by MIME.
      */
    inline def findByMIME(mime: String): ISpec = ^.asInstanceOf[js.Dynamic].applyDynamic("findByMIME")(mime.asInstanceOf[js.Any]).asInstanceOf[ISpec]
    
    /**
      * Find a codemirror mode by name.
      */
    inline def findByName(name: String): ISpec = ^.asInstanceOf[js.Dynamic].applyDynamic("findByName")(name.asInstanceOf[js.Any]).asInstanceOf[ISpec]
    
    /**
      * Get the raw list of available modes specs.
      */
    inline def getModeInfo(): js.Array[ISpec] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModeInfo")().asInstanceOf[js.Array[ISpec]]
    
    /**
      * Running a CodeMirror mode outside of an editor.
      */
    inline def run(code: String, mode: String, el: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(code.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def run(code: String, mode: ISpec, el: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(code.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * The interface of a codemirror mode spec.
      */
    trait IMode
      extends StObject
         with /* key */ StringDictionary[JSONValue] {
      
      var name: String
    }
    object IMode {
      
      inline def apply(name: String): IMode = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[IMode]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IMode] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The interface of a codemirror modeInfo spec.
      */
    trait ISpec extends StObject {
      
      var ext: js.UndefOr[js.Array[String]] = js.undefined
      
      var mime: String
      
      var mode: String
      
      var name: js.UndefOr[String] = js.undefined
    }
    object ISpec {
      
      inline def apply(mime: String, mode: String): ISpec = {
        val __obj = js.Dynamic.literal(mime = mime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISpec]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ISpec] (val x: Self) extends AnyVal {
        
        inline def setExt(value: js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
        
        inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value*))
        
        inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    /**
      * The interface for a codemirror spec resolver.
      */
    type ISpecLoader = js.Function1[/* spec */ ISpec, js.Promise[Boolean]]
  }
}
