package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The borders of the cell.
  */
@js.native
trait SchemaBorders extends StObject {
  
  /**
    * The bottom border of the cell.
    */
  var bottom: js.UndefOr[SchemaBorder] = js.native
  
  /**
    * The left border of the cell.
    */
  var left: js.UndefOr[SchemaBorder] = js.native
  
  /**
    * The right border of the cell.
    */
  var right: js.UndefOr[SchemaBorder] = js.native
  
  /**
    * The top border of the cell.
    */
  var top: js.UndefOr[SchemaBorder] = js.native
}
object SchemaBorders {
  
  @scala.inline
  def apply(): SchemaBorders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBorders]
  }
  
  @scala.inline
  implicit class SchemaBordersMutableBuilder[Self <: SchemaBorders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: SchemaBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: SchemaBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: SchemaBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: SchemaBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
