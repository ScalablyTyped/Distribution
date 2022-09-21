package typings.hastscript

import org.scalablytyped.runtime.StringDictionary
import typings.hast.mod.Comment
import typings.hast.mod.DocType
import typings.hast.mod.Text
import typings.hastscript.anon.FnCall
import typings.hastscript.anon.Fragment
import typings.hastscript.coreMod.HArrayChild
import typings.hastscript.coreMod.HArrayValue
import typings.hastscript.coreMod.HStyleValue
import typings.hastscript.coreMod.Schema
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  @JSImport("hastscript/lib/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runtime(f: ReturnType[Core]): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("runtime")(f.asInstanceOf[js.Any]).asInstanceOf[Fragment]
  
  type Core = js.Function3[
    /* schema */ Schema, 
    /* defaultTagName */ String, 
    /* caseSensitive */ js.UndefOr[js.Array[String]], 
    FnCall
  ]
  
  type Element = typings.hastscript.coreMod.Element
  
  type HChild = typings.hastscript.coreMod.HChild
  
  type HProperties = typings.hastscript.coreMod.HProperties
  
  type HPropertyValue = typings.hastscript.coreMod.HPropertyValue
  
  type HResult = typings.hastscript.coreMod.HResult
  
  type HStyle = typings.hastscript.coreMod.HStyle
  
  type JSXProps = StringDictionary[
    js.UndefOr[
      String | Double | Boolean | typings.hast.mod.Root | typings.hast.mod.Element | DocType | Comment | Text | StringDictionary[HStyleValue] | HArrayValue | HArrayChild | Null
    ]
  ]
  
  type Root = typings.hastscript.coreMod.Root
}
