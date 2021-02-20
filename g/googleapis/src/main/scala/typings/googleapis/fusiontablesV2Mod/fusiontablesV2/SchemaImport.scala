package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an import request.
  */
@js.native
trait SchemaImport extends StObject {
  
  /**
    * The kind of item this is. For an import, this is always
    * fusiontables#import.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The number of rows received from the import request.
    */
  var numRowsReceived: js.UndefOr[String] = js.native
}
object SchemaImport {
  
  @scala.inline
  def apply(): SchemaImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImport]
  }
  
  @scala.inline
  implicit class SchemaImportMutableBuilder[Self <: SchemaImport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumRowsReceived(value: String): Self = StObject.set(x, "numRowsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRowsReceivedUndefined: Self = StObject.set(x, "numRowsReceived", js.undefined)
  }
}
