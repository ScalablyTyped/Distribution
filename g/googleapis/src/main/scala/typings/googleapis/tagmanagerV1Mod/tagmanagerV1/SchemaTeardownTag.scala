package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTeardownTag extends StObject {
  
  /**
    * If true, fire the teardown tag if and only if the main tag fires
    * successfully. If false, fire the teardown tag regardless of main tag
    * firing status.
    */
  var stopTeardownOnFailure: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the teardown tag.
    */
  var tagName: js.UndefOr[String] = js.native
}
object SchemaTeardownTag {
  
  @scala.inline
  def apply(): SchemaTeardownTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeardownTag]
  }
  
  @scala.inline
  implicit class SchemaTeardownTagMutableBuilder[Self <: SchemaTeardownTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStopTeardownOnFailure(value: Boolean): Self = StObject.set(x, "stopTeardownOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTeardownOnFailureUndefined: Self = StObject.set(x, "stopTeardownOnFailure", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
