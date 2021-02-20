package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The amount of padding around the cell, in pixels. When updating padding,
  * every field must be specified.
  */
@js.native
trait SchemaPadding extends StObject {
  
  /**
    * The bottom padding of the cell.
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * The left padding of the cell.
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * The right padding of the cell.
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    * The top padding of the cell.
    */
  var top: js.UndefOr[Double] = js.native
}
object SchemaPadding {
  
  @scala.inline
  def apply(): SchemaPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPadding]
  }
  
  @scala.inline
  implicit class SchemaPaddingMutableBuilder[Self <: SchemaPadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
