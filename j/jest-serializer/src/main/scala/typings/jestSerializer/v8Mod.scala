package typings.jestSerializer

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v8Mod {
  
  @JSImport("v8", "deserialize")
  @js.native
  def deserialize(value: Buffer): js.Any = js.native
  
  @JSImport("v8", "serialize")
  @js.native
  def serialize(value: js.Any): Buffer = js.native
}
