package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a dimension.
  */
trait SchemaDimension extends StObject {
  
  /**
    * The kind of resource this is, in this case dfareporting#dimension.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The dimension name, e.g. dfa:advertiser
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaDimension {
  
  @scala.inline
  def apply(): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimension]
  }
  
  @scala.inline
  implicit class SchemaDimensionMutableBuilder[Self <: SchemaDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
