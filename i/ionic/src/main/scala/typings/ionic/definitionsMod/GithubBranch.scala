package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GithubBranch extends StObject {
  
  var name: String
}
object GithubBranch {
  
  @scala.inline
  def apply(name: String): GithubBranch = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubBranch]
  }
  
  @scala.inline
  implicit class GithubBranchMutableBuilder[Self <: GithubBranch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
