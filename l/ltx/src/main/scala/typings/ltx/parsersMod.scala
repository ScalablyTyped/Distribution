package typings.ltx

import org.scalablytyped.runtime.Shortcut
import typings.ltx.anon.TypeofParserInstantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsersMod extends Shortcut {
  
  @JSImport("ltx/lib/parsers", JSImport.Namespace)
  @js.native
  val ^ : js.Array[TypeofParserInstantiable] = js.native
  
  type _To = js.Array[TypeofParserInstantiable]
  
  /* This means you don't have to write `^`, but can instead just say `parsersMod.foo` */
  override def _to: js.Array[TypeofParserInstantiable] = ^
}
