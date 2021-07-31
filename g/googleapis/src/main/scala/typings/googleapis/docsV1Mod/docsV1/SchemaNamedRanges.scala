package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of all the NamedRanges in the document that share a given
  * name.
  */
trait SchemaNamedRanges extends StObject {
  
  /**
    * The name that all the named ranges share.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The NamedRanges that share the same name.
    */
  var namedRanges: js.UndefOr[js.Array[SchemaNamedRange]] = js.undefined
}
object SchemaNamedRanges {
  
  @scala.inline
  def apply(): SchemaNamedRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedRanges]
  }
  
  @scala.inline
  implicit class SchemaNamedRangesMutableBuilder[Self <: SchemaNamedRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamedRanges(value: js.Array[SchemaNamedRange]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
    
    @scala.inline
    def setNamedRangesVarargs(value: SchemaNamedRange*): Self = StObject.set(x, "namedRanges", js.Array(value :_*))
  }
}
