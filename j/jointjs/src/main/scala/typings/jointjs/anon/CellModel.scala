package typings.jointjs.anon

import org.scalablytyped.runtime.Instantiable2
import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.Cell.Attributes
import typings.jointjs.mod.dia.Graph.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellModel extends StObject {
  
  var cellModel: js.UndefOr[
    TypeofCell & (Instantiable2[/* attributes */ js.UndefOr[Attributes], /* opt */ js.UndefOr[Options], Cell])
  ] = js.undefined
  
  var cellNamespace: js.UndefOr[js.Any] = js.undefined
}
object CellModel {
  
  @scala.inline
  def apply(): CellModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellModel]
  }
  
  @scala.inline
  implicit class CellModelMutableBuilder[Self <: CellModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellModel(
      value: TypeofCell & (Instantiable2[/* attributes */ js.UndefOr[Attributes], /* opt */ js.UndefOr[Options], Cell])
    ): Self = StObject.set(x, "cellModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellModelUndefined: Self = StObject.set(x, "cellModel", js.undefined)
    
    @scala.inline
    def setCellNamespace(value: js.Any): Self = StObject.set(x, "cellNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellNamespaceUndefined: Self = StObject.set(x, "cellNamespace", js.undefined)
  }
}
