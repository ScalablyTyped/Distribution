package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector

import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabNbformat.mod.CellType
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a keyselector.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * Default value for default setters and getters if value is not found.
    */
  var default: js.UndefOr[ReadonlyPartialJSONValue] = js.native
  
  /**
    * An optional value getter for the selector.
    *
    * @param cell - The currently active cell.
    *
    * @returns The appropriate value for the selector.
    */
  var getter: js.UndefOr[js.Function1[/* cell */ Cell, js.UndefOr[ReadonlyPartialJSONValue]]] = js.native
  
  /**
    * The metadata key of interest.
    */
  var key: String = js.native
  
  /**
    * The map of options to values.
    *
    * #### Notes
    * If a value equals the default, choosing it may erase the key from the
    * metadata.
    */
  var optionsMap: ReadonlyPartialJSONObject = js.native
  
  /**
    * An optional value setter for the selector.
    *
    * @param cell - The currently active cell.
    *
    * @param value - The value of the selector.
    *
    * #### Notes
    * The setter should set the appropriate metadata value given the value of
    * the selector.
    */
  var setter: js.UndefOr[
    js.Function2[/* cell */ Cell, /* value */ js.UndefOr[ReadonlyPartialJSONValue], Unit]
  ] = js.native
  
  /**
    * The optional title of the selector - defaults to capitalized `key`.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The optional valid cell types - defaults to all valid types.
    */
  var validCellTypes: js.UndefOr[js.Array[CellType]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(key: String, optionsMap: ReadonlyPartialJSONObject): IOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optionsMap = optionsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsMap(value: ReadonlyPartialJSONObject): Self = this.set("optionsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: ReadonlyPartialJSONValue): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    
    @scala.inline
    def setGetter(value: /* cell */ Cell => js.UndefOr[ReadonlyPartialJSONValue]): Self = this.set("getter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetter: Self = this.set("getter", js.undefined)
    
    @scala.inline
    def setSetter(value: (/* cell */ Cell, /* value */ js.UndefOr[ReadonlyPartialJSONValue]) => Unit): Self = this.set("setter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetter: Self = this.set("setter", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValidCellTypesVarargs(value: CellType*): Self = this.set("validCellTypes", js.Array(value :_*))
    
    @scala.inline
    def setValidCellTypes(value: js.Array[CellType]): Self = this.set("validCellTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidCellTypes: Self = this.set("validCellTypes", js.undefined)
  }
}
