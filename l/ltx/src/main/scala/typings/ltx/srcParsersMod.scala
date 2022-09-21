package typings.ltx

import org.scalablytyped.runtime.Shortcut
import typings.ltx.anon.TypeofParserInstantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParsersMod extends Shortcut {
  
  @JSImport("ltx/src/parsers", JSImport.Default)
  @js.native
  val default: js.Array[TypeofParserInstantiable] = js.native
  
  type _To = js.Array[TypeofParserInstantiable]
  
  /* This means you don't have to write `default`, but can instead just say `srcParsersMod.foo` */
  override def _to: js.Array[TypeofParserInstantiable] = default
}
