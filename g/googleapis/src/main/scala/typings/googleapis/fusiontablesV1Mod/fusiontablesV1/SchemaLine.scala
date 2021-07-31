package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a line geometry.
  */
trait SchemaLine extends StObject {
  
  /**
    * The coordinates that define the line.
    */
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * Type: A line geometry.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaLine {
  
  @scala.inline
  def apply(): SchemaLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLine]
  }
  
  @scala.inline
  implicit class SchemaLineMutableBuilder[Self <: SchemaLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
