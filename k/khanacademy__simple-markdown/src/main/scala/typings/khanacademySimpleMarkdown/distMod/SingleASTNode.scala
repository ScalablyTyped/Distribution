package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleASTNode
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `type`: String
}
object SingleASTNode {
  
  inline def apply(`type`: String): SingleASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleASTNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleASTNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
