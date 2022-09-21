package typings.hastscript

import org.scalablytyped.runtime.StringDictionary
import typings.hastscript.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("hastscript/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def core(schema: Schema, defaultTagName: String): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("core")(schema.asInstanceOf[js.Any], defaultTagName.asInstanceOf[js.Any])).asInstanceOf[FnCall]
  inline def core(schema: Schema, defaultTagName: String, caseSensitive: js.Array[String]): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("core")(schema.asInstanceOf[js.Any], defaultTagName.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[FnCall]
  
  type Child = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.RootContent>[number] */ js.Any
  
  type Element = typings.hast.mod.Element
  
  type HArrayChild = js.Array[Node | HPrimitiveChild]
  
  type HArrayValue = js.Array[String | Double]
  
  type HChild = Node | HPrimitiveChild | (js.Array[Node | HPrimitiveChild])
  
  type HPrimitiveChild = js.UndefOr[String | Double | Null]
  
  type HPrimitiveValue = js.UndefOr[String | Double | Boolean | Null]
  
  type HProperties = StringDictionary[StringDictionary[HStyleValue] | HPropertyValue]
  
  type HPropertyValue = HPrimitiveValue | (js.Array[String | Double])
  
  type HResult = Root | Element
  
  type HStyle = StringDictionary[HStyleValue]
  
  type HStyleValue = String | Double
  
  type Info = typings.propertyInformation.mod.Info
  
  type Node = Child | Root
  
  type Properties = typings.hast.mod.Properties
  
  type Root = typings.hast.mod.Root
  
  type Schema = typings.propertyInformation.mod.Schema
}
