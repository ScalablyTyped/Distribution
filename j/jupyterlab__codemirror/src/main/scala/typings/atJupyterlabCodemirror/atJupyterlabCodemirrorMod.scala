package typings.atJupyterlabCodemirror

import typings.atJupyterlabCodeeditor.libTokensMod.IEditorServices
import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor.IConfig
import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor.IOptions
import typings.atJupyterlabCodemirror.libModeMod.Mode.ISpec
import typings.atJupyterlabCodemirror.libModeMod.Mode.ISpecLoader
import typings.codemirror.codemirrorMod.Editor
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror", JSImport.Namespace)
@js.native
object atJupyterlabCodemirrorMod extends js.Object {
  @js.native
  class CodeMirrorEditor protected ()
    extends typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor {
    /**
      * Construct a CodeMirror editor.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory ()
    extends typings.atJupyterlabCodemirror.libFactoryMod.CodeMirrorEditorFactory {
    def this(defaults: Partial[IConfig]) = this()
  }
  
  @js.native
  class CodeMirrorMimeTypeService ()
    extends typings.atJupyterlabCodemirror.libMimetypeMod.CodeMirrorMimeTypeService
  
  @js.native
  class EditorSyntaxStatus protected ()
    extends typings.atJupyterlabCodemirror.libSyntaxstatusMod.EditorSyntaxStatus {
    /**
      * Construct a new VDomRenderer for the status item.
      */
    def this(opts: typings.atJupyterlabCodemirror.libSyntaxstatusMod.EditorSyntaxStatus.IOptions) = this()
  }
  
  val editorServices: IEditorServices = js.native
  @js.native
  object CodeMirrorEditor extends js.Object {
    /**
      * The default configuration options for an editor.
      */
    var defaultConfig: IConfig = js.native
    /**
      * Add a command to CodeMirror.
      *
      * @param name - The name of the command to add.
      *
      * @param command - The command function.
      */
    def addCommand(name: String, command: js.Function1[/* cm */ Editor, Unit]): Unit = js.native
  }
  
  @js.native
  object EditorSyntaxStatus extends js.Object {
    /**
      * A VDomModel for the current editor/mode combination.
      */
    @js.native
    class Model ()
      extends typings.atJupyterlabCodemirror.libSyntaxstatusMod.EditorSyntaxStatus.Model
    
  }
  
  @js.native
  object Mode extends js.Object {
    def addSpecLoader(loader: ISpecLoader, rank: Double): Unit = js.native
    /**
      * Ensure a codemirror mode is available by name or Codemirror spec.
      *
      * @param mode - The mode to ensure.  If it is a string, uses [findBest]
      *   to get the appropriate spec.
      *
      * @returns A promise that resolves when the mode is available.
      */
    def ensure(mode: String): js.Promise[ISpec] = js.native
    def ensure(mode: ISpec): js.Promise[ISpec] = js.native
    /**
      * Find a codemirror mode by name or CodeMirror spec.
      */
    def findBest(mode: String): ISpec = js.native
    def findBest(mode: ISpec): ISpec = js.native
    /**
      * Find a codemirror mode by extension.
      */
    def findByExtension(ext: String): ISpec = js.native
    def findByExtension(ext: js.Array[String]): ISpec = js.native
    /**
      * Find a codemirror mode by filename.
      */
    def findByFileName(name: String): ISpec = js.native
    /**
      * Find a codemirror mode by MIME.
      */
    def findByMIME(mime: String): ISpec = js.native
    /**
      * Find a codemirror mode by name.
      */
    def findByName(name: String): ISpec = js.native
    /**
      * Get the raw list of available modes specs.
      */
    def getModeInfo(): js.Array[ISpec] = js.native
    /**
      * Running a CodeMirror mode outside of an editor.
      */
    def run(code: String, mode: String, el: HTMLElement): Unit = js.native
    def run(code: String, mode: ISpec, el: HTMLElement): Unit = js.native
  }
  
}

