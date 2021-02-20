package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A combination of a source range and how to extend that source.
  */
@js.native
trait SchemaSourceAndDestination extends StObject {
  
  /**
    * The dimension that data should be filled into.
    */
  var dimension: js.UndefOr[String] = js.native
  
  /**
    * The number of rows or columns that data should be filled into. Positive
    * numbers expand beyond the last row or last column of the source. Negative
    * numbers expand before the first row or first column of the source.
    */
  var fillLength: js.UndefOr[Double] = js.native
  
  /**
    * The location of the data to use as the source of the autofill.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaSourceAndDestination {
  
  @scala.inline
  def apply(): SchemaSourceAndDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceAndDestination]
  }
  
  @scala.inline
  implicit class SchemaSourceAndDestinationMutableBuilder[Self <: SchemaSourceAndDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setFillLength(value: Double): Self = StObject.set(x, "fillLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillLengthUndefined: Self = StObject.set(x, "fillLength", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaGridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
