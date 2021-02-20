package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mail search advanced options
  */
@js.native
trait SchemaMailOptions extends StObject {
  
  /**
    * Set to true to exclude drafts.
    */
  var excludeDrafts: js.UndefOr[Boolean] = js.native
}
object SchemaMailOptions {
  
  @scala.inline
  def apply(): SchemaMailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailOptions]
  }
  
  @scala.inline
  implicit class SchemaMailOptionsMutableBuilder[Self <: SchemaMailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeDrafts(value: Boolean): Self = StObject.set(x, "excludeDrafts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDraftsUndefined: Self = StObject.set(x, "excludeDrafts", js.undefined)
  }
}
