package typings.jupyterlabCodemirror

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.jsonMod.JSONValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeMod {
  
  object Mode {
    
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.addSpecLoader")
    @js.native
    def addSpecLoader(loader: ISpecLoader, rank: Double): Unit = js.native
    
    /**
      * Ensure a codemirror mode is available by name or Codemirror spec.
      *
      * @param mode - The mode to ensure.  If it is a string, uses [findBest]
      *   to get the appropriate spec.
      *
      * @returns A promise that resolves when the mode is available.
      */
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.ensure")
    @js.native
    def ensure(mode: String): js.Promise[ISpec | Null] = js.native
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.ensure")
    @js.native
    def ensure(mode: ISpec): js.Promise[ISpec | Null] = js.native
    
    /**
      * Find a codemirror mode by name or CodeMirror spec.
      */
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.findBest")
    @js.native
    def findBest(mode: String): ISpec = js.native
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.findBest")
    @js.native
    def findBest(mode: ISpec): ISpec = js.native
    
    /**
      * Find a codemirror mode by extension.
      */
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.findByExtension")
    @js.native
    def findByExtension(ext: String): ISpec | Null = js.native
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.findByExtension")
    @js.native
    def findByExtension(ext: js.Array[String]): ISpec | Null = js.native
    
    /**
      * Find a codemirror mode by filename.
      */
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.findByFileName")
    @js.native
    def findByFileName(name: String): ISpec = js.native
    
    /**
      * Find a codemirror mode by MIME.
      */
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.findByMIME")
    @js.native
    def findByMIME(mime: String): ISpec = js.native
    
    /**
      * Find a codemirror mode by name.
      */
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.findByName")
    @js.native
    def findByName(name: String): ISpec = js.native
    
    /**
      * Get the raw list of available modes specs.
      */
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.getModeInfo")
    @js.native
    def getModeInfo(): js.Array[ISpec] = js.native
    
    /**
      * Running a CodeMirror mode outside of an editor.
      */
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.run")
    @js.native
    def run(code: String, mode: String, el: HTMLElement): Unit = js.native
    @JSImport("@jupyterlab/codemirror/lib/mode", "Mode.run")
    @js.native
    def run(code: String, mode: ISpec, el: HTMLElement): Unit = js.native
    
    /**
      * The interface of a codemirror mode spec.
      */
    @js.native
    trait IMode extends /* key */ StringDictionary[JSONValue] {
      
      var name: String = js.native
    }
    object IMode {
      
      @scala.inline
      def apply(name: String): IMode = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[IMode]
      }
      
      @scala.inline
      implicit class IModeMutableBuilder[Self <: IMode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The interface of a codemirror modeInfo spec.
      */
    @js.native
    trait ISpec extends StObject {
      
      var ext: js.UndefOr[js.Array[String]] = js.native
      
      var mime: String = js.native
      
      var mode: String = js.native
      
      var name: js.UndefOr[String] = js.native
    }
    object ISpec {
      
      @scala.inline
      def apply(mime: String, mode: String): ISpec = {
        val __obj = js.Dynamic.literal(mime = mime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISpec]
      }
      
      @scala.inline
      implicit class ISpecMutableBuilder[Self <: ISpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExt(value: js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
        
        @scala.inline
        def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value :_*))
        
        @scala.inline
        def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    /**
      * The interface for a codemirror spec resolver.
      */
    type ISpecLoader = js.Function1[/* spec */ ISpec, js.Promise[Boolean]]
  }
}
