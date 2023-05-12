package typings.jotai

import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.V8IntrinsicIdentifier_
import typings.jotai.anon.Typeoftypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelUtilsMod {
  
  @JSImport("jotai/babel/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAtom(t: Typeoftypes, callee: Expression): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAtom")(t.asInstanceOf[js.Any], callee.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isAtom(t: Typeoftypes, callee: Expression, customAtomNames: js.UndefOr[js.Array[String]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAtom")(t.asInstanceOf[js.Any], callee.asInstanceOf[js.Any], customAtomNames.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isAtom(t: Typeoftypes, callee: V8IntrinsicIdentifier_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAtom")(t.asInstanceOf[js.Any], callee.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isAtom(t: Typeoftypes, callee: V8IntrinsicIdentifier_, customAtomNames: js.UndefOr[js.Array[String]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAtom")(t.asInstanceOf[js.Any], callee.asInstanceOf[js.Any], customAtomNames.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait PluginOptions extends StObject {
    
    var customAtomNames: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomAtomNames(value: js.Array[String]): Self = StObject.set(x, "customAtomNames", value.asInstanceOf[js.Any])
      
      inline def setCustomAtomNamesUndefined: Self = StObject.set(x, "customAtomNames", js.undefined)
      
      inline def setCustomAtomNamesVarargs(value: String*): Self = StObject.set(x, "customAtomNames", js.Array(value*))
    }
  }
}
