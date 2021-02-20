package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The position of an embedded object such as a chart.
  */
@js.native
trait SchemaEmbeddedObjectPosition extends StObject {
  
  /**
    * If true, the embedded object is put on a new sheet whose ID is chosen for
    * you. Used only when writing.
    */
  var newSheet: js.UndefOr[Boolean] = js.native
  
  /**
    * The position at which the object is overlaid on top of a grid.
    */
  var overlayPosition: js.UndefOr[SchemaOverlayPosition] = js.native
  
  /**
    * The sheet this is on. Set only if the embedded object is on its own
    * sheet. Must be non-negative.
    */
  var sheetId: js.UndefOr[Double] = js.native
}
object SchemaEmbeddedObjectPosition {
  
  @scala.inline
  def apply(): SchemaEmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectPosition]
  }
  
  @scala.inline
  implicit class SchemaEmbeddedObjectPositionMutableBuilder[Self <: SchemaEmbeddedObjectPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewSheet(value: Boolean): Self = StObject.set(x, "newSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSheetUndefined: Self = StObject.set(x, "newSheet", js.undefined)
    
    @scala.inline
    def setOverlayPosition(value: SchemaOverlayPosition): Self = StObject.set(x, "overlayPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayPositionUndefined: Self = StObject.set(x, "overlayPosition", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
