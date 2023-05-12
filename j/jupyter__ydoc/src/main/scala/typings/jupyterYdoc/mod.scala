package typings.jupyterYdoc

import typings.jupyterYdoc.anon.OmitIOptionsdata
import typings.jupyterYdoc.libApiMod.DocumentChange
import typings.jupyterYdoc.libApiMod.MapChange
import typings.jupyterYdoc.libApiMod.SharedCell.Cell
import typings.jupyterYdoc.libApiMod.SharedCell.IOptions
import typings.jupyterYdoc.libYcellMod.YCellType
import typings.jupyterlabNbformat.mod.IBaseCellMetadata
import typings.yjs.mod.Array
import typings.yjs.mod.Map
import typings.yjs.mod.Text
import typings.yjs.mod.YMapEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyter/ydoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyter/ydoc", "YBaseCell")
  @js.native
  open class YBaseCell[Metadata /* <: IBaseCellMetadata */] protected ()
    extends typings.jupyterYdoc.libYcellMod.YBaseCell[Metadata] {
    /**
      * Base cell constructor
      *
      * ### Notes
      * Don't use the constructor directly - prefer using ``YNotebook.insertCell``
      *
      * The ``ysource`` is needed because ``ymodel.get('source')`` will
      * not return the real source if the model is not yet attached to
      * a document. Requesting it explicitly allows to introspect a non-empty
      * source before the cell is attached to the document.
      *
      * @param ymodel Cell map
      * @param ysource Cell source
      * @param options \{ notebook?: The notebook the cell is attached to \}
      * @param ymetadata Cell metadata
      */
    def this(ymodel: Map[Any], ysource: Text) = this()
    def this(ymodel: Map[Any], ysource: Text, options: IOptions) = this()
    def this(ymodel: Map[Any], ysource: Text, options: Unit, ymetadata: Map[Any]) = this()
    def this(ymodel: Map[Any], ysource: Text, options: IOptions, ymetadata: Map[Any]) = this()
  }
  /* static members */
  object YBaseCell {
    
    @JSImport("@jupyter/ydoc", "YBaseCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def create(): typings.jupyterYdoc.libYcellMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterYdoc.libYcellMod.YBaseCell[Any]]
    inline def create(id: String): typings.jupyterYdoc.libYcellMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterYdoc.libYcellMod.YBaseCell[Any]]
  }
  
  @JSImport("@jupyter/ydoc", "YCodeCell")
  @js.native
  open class YCodeCell protected ()
    extends typings.jupyterYdoc.libYcellMod.YCodeCell {
    /**
      * Code cell constructor
      *
      * ### Notes
      * Don't use the constructor directly - prefer using ``YNotebook.insertCell``
      *
      * The ``ysource`` is needed because ``ymodel.get('source')`` will
      * not return the real source if the model is not yet attached to
      * a document. Requesting it explicitly allows to introspect a non-empty
      * source before the cell is attached to the document.
      *
      * @param ymodel Cell map
      * @param ysource Cell source
      * @param youtputs Code cell outputs
      * @param options \{ notebook?: The notebook the cell is attached to \}
      * @param ymetadata Cell metadata
      */
    def this(ymodel: Map[Any], ysource: Text, youtputs: Array[Any]) = this()
    def this(ymodel: Map[Any], ysource: Text, youtputs: Array[Any], options: IOptions) = this()
    def this(ymodel: Map[Any], ysource: Text, youtputs: Array[Any], options: Unit, ymetadata: Map[Any]) = this()
    def this(ymodel: Map[Any], ysource: Text, youtputs: Array[Any], options: IOptions, ymetadata: Map[Any]) = this()
  }
  /* static members */
  object YCodeCell {
    
    @JSImport("@jupyter/ydoc", "YCodeCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YCodeCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def create(): typings.jupyterYdoc.libYcellMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterYdoc.libYcellMod.YCodeCell]
    inline def create(id: String): typings.jupyterYdoc.libYcellMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterYdoc.libYcellMod.YCodeCell]
  }
  
  /* note: abstract class */ @JSImport("@jupyter/ydoc", "YDocument")
  @js.native
  open class YDocument[T /* <: DocumentChange */] ()
    extends typings.jupyterYdoc.libYdocumentMod.YDocument[T] {
    def this(options: typings.jupyterYdoc.libYdocumentMod.YDocument.IOptions) = this()
  }
  
  @JSImport("@jupyter/ydoc", "YFile")
  @js.native
  /**
    * Create a new file
    *
    * #### Notes
    * The document is empty and must be populated
    */
  open class YFile ()
    extends typings.jupyterYdoc.libYfileMod.YFile
  /* static members */
  object YFile {
    
    @JSImport("@jupyter/ydoc", "YFile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a standalone YFile
      */
    inline def create(): typings.jupyterYdoc.libYfileMod.YFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterYdoc.libYfileMod.YFile]
  }
  
  @JSImport("@jupyter/ydoc", "YMarkdownCell")
  @js.native
  open class YMarkdownCell ()
    extends typings.jupyterYdoc.libYcellMod.YMarkdownCell
  /* static members */
  object YMarkdownCell {
    
    @JSImport("@jupyter/ydoc", "YMarkdownCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YMarkdownCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def create(): typings.jupyterYdoc.libYcellMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterYdoc.libYcellMod.YMarkdownCell]
    inline def create(id: String): typings.jupyterYdoc.libYcellMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterYdoc.libYcellMod.YMarkdownCell]
  }
  
  @JSImport("@jupyter/ydoc", "YNotebook")
  @js.native
  /**
    * Create a new notebook
    *
    * #### Notes
    * The document is empty and must be populated
    *
    * @param options
    */
  open class YNotebook ()
    extends typings.jupyterYdoc.libYnotebookMod.YNotebook {
    def this(options: OmitIOptionsdata) = this()
  }
  /* static members */
  object YNotebook {
    
    @JSImport("@jupyter/ydoc", "YNotebook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a standalone YNotebook
      *
      * Note: This method is useful when we need to initialize
      * the YNotebook from the JavaScript side.
      */
    inline def create(): typings.jupyterYdoc.libYnotebookMod.YNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterYdoc.libYnotebookMod.YNotebook]
    inline def create(options: typings.jupyterYdoc.libApiMod.ISharedNotebook.IOptions): typings.jupyterYdoc.libYnotebookMod.YNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterYdoc.libYnotebookMod.YNotebook]
  }
  
  @JSImport("@jupyter/ydoc", "YRawCell")
  @js.native
  open class YRawCell ()
    extends typings.jupyterYdoc.libYcellMod.YRawCell
  /* static members */
  object YRawCell {
    
    @JSImport("@jupyter/ydoc", "YRawCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YRawCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def create(): typings.jupyterYdoc.libYcellMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterYdoc.libYcellMod.YRawCell]
    inline def create(id: String): typings.jupyterYdoc.libYcellMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterYdoc.libYcellMod.YRawCell]
  }
  
  inline def convertYMapEventToMapChange(event: YMapEvent[Any]): MapChange = ^.asInstanceOf[js.Dynamic].applyDynamic("convertYMapEventToMapChange")(event.asInstanceOf[js.Any]).asInstanceOf[MapChange]
  
  inline def createMutex(): js.Function1[/* f */ js.Function0[Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMutex")().asInstanceOf[js.Function1[/* f */ js.Function0[Unit], Unit]]
  
  inline def createStandaloneCell(cell: Cell): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandaloneCell")(cell.asInstanceOf[js.Any]).asInstanceOf[YCellType]
}
