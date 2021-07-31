package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Offset Position.
  */
trait SchemaOffsetPosition extends StObject {
  
  /**
    * Offset distance from left side of an asset or a window.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset distance from top side of an asset or a window.
    */
  var top: js.UndefOr[Double] = js.undefined
}
object SchemaOffsetPosition {
  
  @scala.inline
  def apply(): SchemaOffsetPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOffsetPosition]
  }
  
  @scala.inline
  implicit class SchemaOffsetPositionMutableBuilder[Self <: SchemaOffsetPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
