package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StringDictionary
import typings.handsontable.mod.Handsontable._editors.Base
import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellTypeObject
  extends GridSettings
     with /**
  * Custom properties which will be accessible in `cellProperties`
  */
/* key */ StringDictionary[js.Any] {
  
  @JSName("editor")
  var editor_CellTypeObject: js.UndefOr[
    Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]
  ] = js.native
  
  @JSName("renderer")
  var renderer_CellTypeObject: js.UndefOr[typings.handsontable.mod.Handsontable.renderers.Base] = js.native
  
  @JSName("validator")
  var validator_CellTypeObject: js.UndefOr[typings.handsontable.mod.Handsontable.validators.Base] = js.native
}
object CellTypeObject {
  
  @scala.inline
  def apply(): CellTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellTypeObject]
  }
  
  @scala.inline
  implicit class CellTypeObjectOps[Self <: CellTypeObject] (val x: Self) extends AnyVal {
    
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
    def setEditor(
      value: Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]
    ): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setRenderer(
      value: (/* instance */ Core, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => HTMLTableCellElement | Unit
    ): Self = this.set("renderer", js.Any.fromFunction7(value))
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setValidator(value: typings.handsontable.mod.Handsontable.validators.Base): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
}
