package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMod {
  
  @JSImport("marko/src/compiler/modules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deresolve(targetFilename: String, from: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("deresolve")(targetFilename.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def require(path: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def resolve(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def resolveFrom(from: String, target: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFrom")(from.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
