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
  
  inline def apply(branches: js.Array[String], repoId: Double, `type`: AssociationType): Branches = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], repoId = repoId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Branches] (val x: Self) extends AnyVal {
    
    inline def setBranches(value: js.Array[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value*))
    
    inline def setRepoId(value: Double): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    inline def setType(value: AssociationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
