package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetupTag extends StObject {
  
  /**
    * If true, fire the main tag if and only if the setup tag fires successfully. If false, fire the main tag regardless of setup tag firing status.
    */
  var stopOnSetupFailure: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the setup tag.
    */
  var tagName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSetupTag {
  
  inline def apply(): SchemaSetupTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetupTag]
  }
  
  extension [Self <: SchemaSetupTag](x: Self) {
    
    inline def setStopOnSetupFailure(value: Boolean): Self = StObject.set(x, "stopOnSetupFailure", value.asInstanceOf[js.Any])
    
    inline def setStopOnSetupFailureNull: Self = StObject.set(x, "stopOnSetupFailure", null)
    
    inline def setStopOnSetupFailureUndefined: Self = StObject.set(x, "stopOnSetupFailure", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameNull: Self = StObject.set(x, "tagName", null)
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
