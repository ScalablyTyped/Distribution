package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Etag extends StObject {
  
  var etag: js.UndefOr[String] = js.native
  
  var modified: js.UndefOr[String] = js.native
  
  var vary: js.UndefOr[Boolean] = js.native
}
object Etag {
  
  @scala.inline
  def apply(): Etag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Etag]
  }
  
  @scala.inline
  implicit class EtagMutableBuilder[Self <: Etag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setVary(value: Boolean): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaryUndefined: Self = StObject.set(x, "vary", js.undefined)
  }
}
