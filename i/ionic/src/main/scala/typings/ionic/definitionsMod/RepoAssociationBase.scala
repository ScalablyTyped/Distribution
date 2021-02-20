package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoAssociationBase extends StObject {
  
  var clone_url: String = js.native
  
  var full_name: String = js.native
  
  var html_url: String = js.native
}
object RepoAssociationBase {
  
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String): RepoAssociationBase = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoAssociationBase]
  }
  
  @scala.inline
  implicit class RepoAssociationBaseMutableBuilder[Self <: RepoAssociationBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone_url(value: String): Self = StObject.set(x, "clone_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
  }
}
