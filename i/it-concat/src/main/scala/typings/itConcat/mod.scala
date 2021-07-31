package typings.itConcat

import typings.itConcat.anon.Type
import typings.itConcat.anon.`0`
import typings.node.Buffer
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(source: AsyncIterable[Buffer | String | typings.bl.mod.^]): js.Promise[typings.bl.mod.^] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.bl.mod.^]]
  @scala.inline
  def apply(source: AsyncIterable[Buffer | String | typings.bl.mod.^], options: Type): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(source: AsyncIterable[Buffer | typings.bl.mod.^], options: `0`): js.Promise[typings.bl.mod.^] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.bl.mod.^]]
  
  @JSImport("it-concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
