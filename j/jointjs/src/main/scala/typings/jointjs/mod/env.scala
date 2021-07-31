package typings.jointjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object env {
  
  @JSImport("jointjs", "env")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addTest(name: String, fn: js.Function0[Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTest")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def test(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
