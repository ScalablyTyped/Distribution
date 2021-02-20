package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Creator extends StObject {
  
  /** A comment provided by the user or the application. */
  var comment: js.UndefOr[String] = js.native
  
  /** Name of the application/browser used to export the log. */
  var name: String = js.native
  
  /** Version of the application/browser used to export the log. */
  var version: String = js.native
}
object Creator {
  
  @scala.inline
  def apply(name: String, version: String): Creator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Creator]
  }
  
  @scala.inline
  implicit class CreatorMutableBuilder[Self <: Creator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
