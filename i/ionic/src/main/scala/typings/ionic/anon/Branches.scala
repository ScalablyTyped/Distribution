package typings.ionic.anon

import typings.ionic.definitionsMod.AssociationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branches extends StObject {
  
  var branches: js.Array[String]
  
  var repoId: Double
  
  var `type`: AssociationType
}
object Branches {
  
  @scala.inline
  def apply(branches: js.Array[String], repoId: Double, `type`: AssociationType): Branches = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], repoId = repoId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branches]
  }
  
  @scala.inline
  implicit class BranchesMutableBuilder[Self <: Branches] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranches(value: js.Array[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value :_*))
    
    @scala.inline
    def setRepoId(value: Double): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AssociationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
