package typings.hastscript

import org.scalablytyped.runtime.StringDictionary
import typings.hast.mod.Comment
import typings.hast.mod.DocType
import typings.hast.mod.Text
import typings.hastscript.anon.FnCall
import typings.hastscript.anon.Fragment
import typings.hastscript.libCoreMod.HArrayChild
import typings.hastscript.libCoreMod.HArrayValue
import typings.hastscript.libCoreMod.HStyleValue
import typings.hastscript.libCoreMod.Schema
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeMod {
  
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
  
  type Element = typings.hastscript.libCoreMod.Element
  
  type HChild = typings.hastscript.libCoreMod.HChild
  
  type HProperties = typings.hastscript.libCoreMod.HProperties
  
  type HPropertyValue = typings.hastscript.libCoreMod.HPropertyValue
  
  type HResult = typings.hastscript.libCoreMod.HResult
  
  type HStyle = typings.hastscript.libCoreMod.HStyle
  
  type JSXProps = StringDictionary[
    js.UndefOr[
      String | Double | Boolean | typings.hast.mod.Root | typings.hast.mod.Element | DocType | Comment | Text | StringDictionary[HStyleValue] | HArrayValue | HArrayChild | Null
    ]
  ]
  
  type Root = typings.hastscript.libCoreMod.Root
}
