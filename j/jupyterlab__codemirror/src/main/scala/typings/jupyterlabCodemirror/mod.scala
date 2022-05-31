package typings.jupyterlabCodemirror

import typings.codemirror.mod.Editor
import typings.codemirror.mod.StyleActiveLine
import typings.jupyterlabCodeeditor.tokensMod.IEditorServices
import typings.jupyterlabCodemirror.anon.PartialIConfig
import typings.jupyterlabCodemirror.editorMod.CodeMirrorEditor.IOptions
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typings.jupyterlabCodemirror.modeMod.Mode.IMode
import typings.jupyterlabCodemirror.modeMod.Mode.ISpec
import typings.jupyterlabCodemirror.modeMod.Mode.ISpecLoader
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor")
  @js.native
  class CodeMirrorEditor protected ()
    extends typings.jupyterlabCodemirror.editorMod.CodeMirrorEditor {
    /**
      * Construct a CodeMirror editor.
      */
    def this(options: IOptions) = this()
  }
  object CodeMirrorEditor {
    
    @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add a command to CodeMirror.
      *
      * @param name - The name of the command to add.
      *
      * @param command - The command function.
      */
    inline def addCommand(name: String, command: js.Function1[/* cm */ Editor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommand")(name.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * The default configuration options for an editor.
      */
    /* Inlined std.Required<@jupyterlab/codemirror.@jupyterlab/codemirror/lib/editor.CodeMirrorEditor.IConfig> */
    object defaultConfig {
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.autoClosingBrackets")
      @js.native
      def autoClosingBrackets: Boolean = js.native
      inline def autoClosingBrackets_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.codeFolding")
      @js.native
      def codeFolding: Boolean = js.native
      inline def codeFolding_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeFolding")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.coverGutterNextToScrollbar")
      @js.native
      def coverGutterNextToScrollbar: Boolean = js.native
      inline def coverGutterNextToScrollbar_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coverGutterNextToScrollbar")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.dragDrop")
      @js.native
      def dragDrop: Boolean = js.native
      inline def dragDrop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.electricChars")
      @js.native
      def electricChars: Boolean = js.native
      inline def electricChars_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("electricChars")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.extraKeys")
      @js.native
      def extraKeys: js.Any = js.native
      inline def extraKeys_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.fixedGutter")
      @js.native
      def fixedGutter: Boolean = js.native
      inline def fixedGutter_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedGutter")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.foldGutter")
      @js.native
      def foldGutter: Boolean = js.native
      inline def foldGutter_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldGutter")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.fontFamily")
      @js.native
      def fontFamily: String = js.native
      inline def fontFamily_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.fontSize")
      @js.native
      def fontSize: Double = js.native
      inline def fontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.gutters")
      @js.native
      def gutters: js.Array[String] = js.native
      inline def gutters_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gutters")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.handlePaste")
      @js.native
      def handlePaste: Boolean = js.native
      inline def handlePaste_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handlePaste")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.insertSpaces")
      @js.native
      def insertSpaces: Boolean = js.native
      inline def insertSpaces_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.keyMap")
      @js.native
      def keyMap: String = js.native
      inline def keyMap_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.lineHeight")
      @js.native
      def lineHeight: Double = js.native
      inline def lineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.lineNumbers")
      @js.native
      def lineNumbers: Boolean = js.native
      inline def lineNumbers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.lineSeparator")
      @js.native
      def lineSeparator: String = js.native
      inline def lineSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSeparator")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.lineWiseCopyCut")
      @js.native
      def lineWiseCopyCut: Boolean = js.native
      inline def lineWiseCopyCut_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWiseCopyCut")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.lineWrap")
      @js.native
      def lineWrap: off | on | wordWrapColumn | bounded = js.native
      inline def lineWrap_=(x: off | on | wordWrapColumn | bounded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.matchBrackets")
      @js.native
      def matchBrackets: Boolean = js.native
      inline def matchBrackets_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.mode")
      @js.native
      def mode: String | IMode = js.native
      inline def mode_=(x: String | IMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.rulers")
      @js.native
      def rulers: js.Array[Double] = js.native
      inline def rulers_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rulers")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.scrollPastEnd")
      @js.native
      def scrollPastEnd: Boolean = js.native
      inline def scrollPastEnd_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollPastEnd")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.scrollbarStyle")
      @js.native
      def scrollbarStyle: String = js.native
      inline def scrollbarStyle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarStyle")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.selectionPointer")
      @js.native
      def selectionPointer: Boolean | String = js.native
      inline def selectionPointer_=(x: Boolean | String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionPointer")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.showCursorWhenSelecting")
      @js.native
      def showCursorWhenSelecting: Boolean = js.native
      inline def showCursorWhenSelecting_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCursorWhenSelecting")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.smartIndent")
      @js.native
      def smartIndent: Boolean = js.native
      inline def smartIndent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartIndent")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.styleActiveLine")
      @js.native
      def styleActiveLine: Boolean | StyleActiveLine = js.native
      inline def styleActiveLine_=(x: Boolean | StyleActiveLine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleActiveLine")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.styleSelectedText")
      @js.native
      def styleSelectedText: Boolean = js.native
      inline def styleSelectedText_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleSelectedText")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.tabSize")
      @js.native
      def tabSize: Double = js.native
      inline def tabSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.theme")
      @js.native
      def theme: String = js.native
      inline def theme_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror", "CodeMirrorEditor.defaultConfig.wordWrapColumn")
      @js.native
      def wordWrapColumn: Double = js.native
      inline def wordWrapColumn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapColumn")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@jupyterlab/codemirror", "CodeMirrorEditorFactory")
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory ()
    extends typings.jupyterlabCodemirror.factoryMod.CodeMirrorEditorFactory {
    def this(defaults: PartialIConfig) = this()
  }
  
  @JSImport("@jupyterlab/codemirror", "CodeMirrorMimeTypeService")
  @js.native
  class CodeMirrorMimeTypeService ()
    extends typings.jupyterlabCodemirror.mimetypeMod.CodeMirrorMimeTypeService
  
  @JSImport("@jupyterlab/codemirror", "EditorSyntaxStatus")
  @js.native
  class EditorSyntaxStatus protected ()
    extends typings.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus {
    /**
      * Construct a new VDomRenderer for the status item.
      */
    def this(opts: typings.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.IOptions) = this()
  }
  object EditorSyntaxStatus {
    
    /**
      * A VDomModel for the current editor/mode combination.
      */
    @JSImport("@jupyterlab/codemirror", "EditorSyntaxStatus.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.Model
  }
  
  object Mode {
    
    @JSImport("@jupyterlab/codemirror", "Mode")
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
  }
  
  @JSImport("@jupyterlab/codemirror", "editorServices")
  @js.native
  val editorServices: IEditorServices = js.native
}
