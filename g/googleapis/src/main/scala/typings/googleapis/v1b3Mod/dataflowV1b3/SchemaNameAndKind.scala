package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic metadata about a counter.
  */
trait SchemaNameAndKind extends StObject {
  
  /**
    * Counter aggregation kind.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the counter.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaNameAndKind {
  
  @scala.inline
  def apply(): SchemaNameAndKind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNameAndKind]
  }
  
  @scala.inline
  implicit class SchemaNameAndKindMutableBuilder[Self <: SchemaNameAndKind] (val x: Self) extends AnyVal {
    
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
