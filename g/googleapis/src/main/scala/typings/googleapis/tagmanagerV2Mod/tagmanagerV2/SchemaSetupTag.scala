package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a reference to atag that fires before another tag in order to
  * set up dependencies.
  */
trait SchemaSetupTag extends StObject {
  
  /**
    * If true, fire the main tag if and only if the setup tag fires
    * successfully. If false, fire the main tag regardless of setup tag firing
    * status.
    */
  var stopOnSetupFailure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the setup tag.
    */
  var tagName: js.UndefOr[String] = js.undefined
}
object SchemaSetupTag {
  
  @scala.inline
  def apply(): SchemaSetupTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetupTag]
  }
  
  @scala.inline
  implicit class SchemaSetupTagMutableBuilder[Self <: SchemaSetupTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStopOnSetupFailure(value: Boolean): Self = StObject.set(x, "stopOnSetupFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOnSetupFailureUndefined: Self = StObject.set(x, "stopOnSetupFailure", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
