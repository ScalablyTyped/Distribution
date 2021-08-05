package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mail search advanced options
  */
trait SchemaMailOptions extends StObject {
  
  /**
    * Set to true to exclude drafts.
    */
  var excludeDrafts: js.UndefOr[Boolean] = js.undefined
}
object SchemaMailOptions {
  
  inline def apply(): SchemaMailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailOptions]
  }
  
  extension [Self <: SchemaMailOptions](x: Self) {
    
    inline def setExcludeDrafts(value: Boolean): Self = StObject.set(x, "excludeDrafts", value.asInstanceOf[js.Any])
    
    inline def setExcludeDraftsUndefined: Self = StObject.set(x, "excludeDrafts", js.undefined)
  }
}
