package typings.jupyterYdoc

import typings.jupyterYdoc.libApiMod.FileChange
import typings.jupyterYdoc.libYdocumentMod.YDocument
import typings.yjs.mod.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYfileMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBase because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedText because var conflicts: changed, disposed, isDisposed. Inlined source, getSource, setSource, updateSource, updateSource
  - typings.jupyterYdoc.libApiMod.ISharedDocument because Already inherited
  - typings.jupyterYdoc.libYtextMod.IYText because var conflicts: awareness, changed, disposed, isDisposed, undoManager. Inlined ysource
  - typings.jupyterYdoc.libApiMod.ISharedFile because var conflicts: changed, disposed, isDisposed, state. Inlined  */ @JSImport("@jupyter/ydoc/lib/yfile", "YFile")
  @js.native
  /**
    * Create a new file
    *
    * #### Notes
    * The document is empty and must be populated
    */
  open class YFile () extends YDocument[FileChange] {
    
    /**
      * Handle a change to the ymodel.
      */
    /* private */ var _modelObserver: Any = js.native
    
    /**
      * Get the file text.
      *
      * @returns File text.
      */
    /**
      * Get text.
      *
      * @returns Text.
      */
    def getSource(): String = js.native
    
    /**
      * Set the file text.
      *
      * @param value New text
      */
    /**
      * Set text.
      *
      * @param value New text.
      */
    def setSource(value: String): Unit = js.native
    
    /**
      * File text
      */
    def source: String = js.native
    def source_=(v: String): Unit = js.native
    /**
      * Text
      */
    @JSName("source")
    var source_FYFile: String = js.native
    
    /**
      * Replace content from `start' to `end` with `value`.
      *
      * @param start: The start index of the range to replace (inclusive).
      * @param end: The end index of the range to replace (exclusive).
      * @param value: New source (optional).
      */
    def updateSource(start: Double, end: Double): Unit = js.native
    def updateSource(start: Double, end: Double, value: String): Unit = js.native
    
    /**
      * YJS file text.
      */
    val ysource: Text = js.native
  }
  /* static members */
  object YFile {
    
    @JSImport("@jupyter/ydoc/lib/yfile", "YFile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a standalone YFile
      */
    inline def create(): YFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YFile]
  }
}
