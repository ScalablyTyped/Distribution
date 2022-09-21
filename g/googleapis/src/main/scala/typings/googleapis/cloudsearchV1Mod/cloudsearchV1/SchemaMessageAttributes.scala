package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessageAttributes extends StObject {
  
  /**
    * If true: message is a tombstone in the client. Default false.
    */
  var isTombstone: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMessageAttributes {
  
  inline def apply(): SchemaMessageAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageAttributes]
  }
  
  extension [Self <: SchemaMessageAttributes](x: Self) {
    
    inline def setIsTombstone(value: Boolean): Self = StObject.set(x, "isTombstone", value.asInstanceOf[js.Any])
    
    inline def setIsTombstoneNull: Self = StObject.set(x, "isTombstone", null)
    
    inline def setIsTombstoneUndefined: Self = StObject.set(x, "isTombstone", js.undefined)
  }
}
