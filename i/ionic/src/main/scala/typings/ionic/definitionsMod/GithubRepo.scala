package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GithubRepo extends StObject {
  
  var full_name: String = js.native
  
  var id: Double = js.native
}
object GithubRepo {
  
  @scala.inline
  def apply(full_name: String, id: Double): GithubRepo = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubRepo]
  }
  
  @scala.inline
  implicit class GithubRepoMutableBuilder[Self <: GithubRepo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
