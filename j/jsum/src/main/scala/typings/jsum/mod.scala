package typings.jsum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def digest(obj: js.Any, hashAlgorithm: String, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(obj.asInstanceOf[js.Any], hashAlgorithm.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def stringify(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
