package typings.jupyterlabSharedModels

import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.code
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.markdown
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.raw
import typings.jupyterlabSharedModels.libApiMod.ISharedBaseCellMetadata
import typings.jupyterlabSharedModels.libApiMod.ISharedNotebook
import typings.jupyterlabSharedModels.libApiMod.ISharedNotebook.IOptions
import typings.jupyterlabSharedModels.libApiMod.MapChange
import typings.jupyterlabSharedModels.libYmodelsMod.YCellType
import typings.yjs.mod.Map
import typings.yjs.mod.YMapEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/shared-models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/shared-models", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.jupyterlabSharedModels.libYmodelsMod.default {
    def this(options: IOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@jupyterlab/shared-models", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YNotebook.
      */
    inline def create(disableDocumentWideUndoRedo: Boolean): ISharedNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disableDocumentWideUndoRedo.asInstanceOf[js.Any]).asInstanceOf[ISharedNotebook]
  }
  
  @JSImport("@jupyterlab/shared-models", "YBaseCell")
  @js.native
  open class YBaseCell[Metadata /* <: ISharedBaseCellMetadata */] protected ()
    extends typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Metadata] {
    def this(ymodel: Map[Any]) = this()
  }
  /* static members */
  object YBaseCell {
    
    @JSImport("@jupyterlab/shared-models", "YBaseCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YRawCell that can be inserted into a YNotebook
      */
    inline def create(): typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any]]
    inline def create(id: String): typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any]]
    
    /**
      * Create a new YRawCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any]]
    inline def createStandalone(id: String): typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YBaseCell[Any]]
  }
  
  @JSImport("@jupyterlab/shared-models", "YCodeCell")
  @js.native
  open class YCodeCell protected ()
    extends typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell {
    def this(ymodel: Map[Any]) = this()
  }
  /* static members */
  object YCodeCell {
    
    @JSImport("@jupyterlab/shared-models", "YCodeCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YCodeCell that can be inserted into a YNotebook
      */
    inline def create(): typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell]
    inline def create(id: String): typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell]
    
    /**
      * Create a new YCodeCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell]
    inline def createStandalone(id: String): typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell]
  }
  
  @JSImport("@jupyterlab/shared-models", "YDocument")
  @js.native
  open class YDocument[T] ()
    extends typings.jupyterlabSharedModels.libYmodelsMod.YDocument[T]
  
  @JSImport("@jupyterlab/shared-models", "YFile")
  @js.native
  open class YFile ()
    extends typings.jupyterlabSharedModels.libYmodelsMod.YFile
  /* static members */
  object YFile {
    
    @JSImport("@jupyterlab/shared-models", "YFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): typings.jupyterlabSharedModels.libYmodelsMod.YFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YFile]
  }
  
  @JSImport("@jupyterlab/shared-models", "YMarkdownCell")
  @js.native
  open class YMarkdownCell protected ()
    extends typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell {
    def this(ymodel: Map[Any]) = this()
  }
  /* static members */
  object YMarkdownCell {
    
    @JSImport("@jupyterlab/shared-models", "YMarkdownCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YMarkdownCell that can be inserted into a YNotebook
      */
    inline def create(): typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell]
    inline def create(id: String): typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell]
    
    /**
      * Create a new YMarkdownCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell]
    inline def createStandalone(id: String): typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell]
  }
  
  @JSImport("@jupyterlab/shared-models", "YNotebook")
  @js.native
  open class YNotebook protected ()
    extends typings.jupyterlabSharedModels.libYmodelsMod.YNotebook {
    def this(options: IOptions) = this()
  }
  /* static members */
  object YNotebook {
    
    @JSImport("@jupyterlab/shared-models", "YNotebook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YNotebook.
      */
    inline def create(disableDocumentWideUndoRedo: Boolean): ISharedNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disableDocumentWideUndoRedo.asInstanceOf[js.Any]).asInstanceOf[ISharedNotebook]
  }
  
  @JSImport("@jupyterlab/shared-models", "YRawCell")
  @js.native
  open class YRawCell protected ()
    extends typings.jupyterlabSharedModels.libYmodelsMod.YRawCell {
    def this(ymodel: Map[Any]) = this()
  }
  /* static members */
  object YRawCell {
    
    @JSImport("@jupyterlab/shared-models", "YRawCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YRawCell that can be inserted into a YNotebook
      */
    inline def create(): typings.jupyterlabSharedModels.libYmodelsMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YRawCell]
    inline def create(id: String): typings.jupyterlabSharedModels.libYmodelsMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YRawCell]
    
    /**
      * Create a new YRawCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): typings.jupyterlabSharedModels.libYmodelsMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YRawCell]
    inline def createStandalone(id: String): typings.jupyterlabSharedModels.libYmodelsMod.YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabSharedModels.libYmodelsMod.YRawCell]
  }
  
  inline def convertYMapEventToMapChange(event: YMapEvent[Any]): MapChange = ^.asInstanceOf[js.Dynamic].applyDynamic("convertYMapEventToMapChange")(event.asInstanceOf[js.Any]).asInstanceOf[MapChange]
  
  inline def createCellFromType(`type`: Map[Any]): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createCellFromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[YCellType]
  
  inline def createMutex(): js.Function1[/* f */ js.Function0[Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMutex")().asInstanceOf[js.Function1[/* f */ js.Function0[Unit], Unit]]
  
  inline def createStandaloneCell(cellType: raw | code | markdown): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandaloneCell")(cellType.asInstanceOf[js.Any]).asInstanceOf[YCellType]
  inline def createStandaloneCell(cellType: raw | code | markdown, id: String): YCellType = (^.asInstanceOf[js.Dynamic].applyDynamic("createStandaloneCell")(cellType.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[YCellType]
}
