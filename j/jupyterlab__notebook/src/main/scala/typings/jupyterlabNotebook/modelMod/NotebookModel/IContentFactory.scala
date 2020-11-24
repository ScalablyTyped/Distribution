package typings.jupyterlabNotebook.modelMod.NotebookModel

import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabCells.modelMod.ICodeCellModel
import typings.jupyterlabCells.modelMod.IMarkdownCellModel
import typings.jupyterlabCells.modelMod.IRawCellModel
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A factory for creating notebook model content.
  */
@js.native
trait IContentFactory extends js.Object {
  
  /**
    * Clone the content factory with a new IModelDB.
    */
  def clone(modelDB: IModelDB): IContentFactory = js.native
  
  /**
    * The factory for output area models.
    */
  val codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
  
  /**
    * Create a new cell by cell type.
    *
    * @param type:  the type of the cell to create.
    *
    * @param options: the cell creation options.
    *
    * #### Notes
    * This method is intended to be a convenience method to programmaticaly
    * call the other cell creation methods in the factory.
    */
  def createCell(`type`: CellType, opts: typings.jupyterlabCells.modelMod.CellModel.IOptions): ICellModel = js.native
  
  /**
    * Create a new code cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new code cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createCodeCell(options: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
  
  /**
    * Create a new markdown cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new markdown cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createMarkdownCell(options: typings.jupyterlabCells.modelMod.CellModel.IOptions): IMarkdownCellModel = js.native
  
  /**
    * Create a new raw cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typings.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel = js.native
  
  /**
    * The IModelDB in which to put data for the notebook model.
    */
  var modelDB: js.UndefOr[IModelDB] = js.native
}
object IContentFactory {
  
  @scala.inline
  def apply(
    clone: IModelDB => IContentFactory,
    codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory,
    createCell: (CellType, typings.jupyterlabCells.modelMod.CellModel.IOptions) => ICellModel,
    createCodeCell: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel,
    createMarkdownCell: typings.jupyterlabCells.modelMod.CellModel.IOptions => IMarkdownCellModel,
    createRawCell: typings.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCell = js.Any.fromFunction2(createCell), createCodeCell = js.Any.fromFunction1(createCodeCell), createMarkdownCell = js.Any.fromFunction1(createMarkdownCell), createRawCell = js.Any.fromFunction1(createRawCell))
    __obj.asInstanceOf[IContentFactory]
  }
  
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: IModelDB => IContentFactory): Self = this.set("clone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCodeCellContentFactory(value: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = this.set("codeCellContentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCell(value: (CellType, typings.jupyterlabCells.modelMod.CellModel.IOptions) => ICellModel): Self = this.set("createCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCodeCell(value: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel): Self = this.set("createCodeCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateMarkdownCell(value: typings.jupyterlabCells.modelMod.CellModel.IOptions => IMarkdownCellModel): Self = this.set("createMarkdownCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateRawCell(value: typings.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel): Self = this.set("createRawCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModelDB(value: IModelDB): Self = this.set("modelDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelDB: Self = this.set("modelDB", js.undefined)
  }
}
