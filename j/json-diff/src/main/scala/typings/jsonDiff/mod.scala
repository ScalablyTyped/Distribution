package typings.jsonDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def diff(obj1: js.Any, obj2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def diffString(obj1: js.Any, obj2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("diffString")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
