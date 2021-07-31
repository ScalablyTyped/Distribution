package typings.jmespath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jmespath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def search(jsonDoc: js.Any, query: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(jsonDoc.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
