package typings.jssip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grammarMod {
  
  @JSImport("jssip/lib/Grammar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(input: String): Grammar = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Grammar]
  inline def parse(input: String, startRule: String): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], startRule.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  
  inline def toSource(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toSource")().asInstanceOf[Any]
  
  type Grammar = Any
}
