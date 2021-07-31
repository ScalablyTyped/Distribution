package typings.jestSerializer

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v8Mod {
  
  @JSImport("v8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserialize(value: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def serialize(value: js.Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
