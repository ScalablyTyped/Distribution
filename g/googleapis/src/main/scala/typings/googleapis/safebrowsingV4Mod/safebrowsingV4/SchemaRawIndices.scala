package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of raw indices to remove from a local list.
  */
trait SchemaRawIndices extends StObject {
  
  /**
    * The indices to remove from a lexicographically-sorted local list.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
}
object SchemaRawIndices {
  
  @scala.inline
  def apply(): SchemaRawIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRawIndices]
  }
  
  @scala.inline
  implicit class SchemaRawIndicesMutableBuilder[Self <: SchemaRawIndices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
  }
}
