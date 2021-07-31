package typings.loremIpsum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeArrayOfStringsMod {
  
  @JSImport("lorem-ipsum/types/src/util/makeArrayOfStrings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(length: Double, makeString: js.Function0[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(length.asInstanceOf[js.Any], makeString.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
