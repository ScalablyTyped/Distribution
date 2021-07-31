package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter used to match traffic data in your report.
  */
trait SchemaFilterPair extends StObject {
  
  /**
    * Filter type.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Filter value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaFilterPair {
  
  @scala.inline
  def apply(): SchemaFilterPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterPair]
  }
  
  @scala.inline
  implicit class SchemaFilterPairMutableBuilder[Self <: SchemaFilterPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
