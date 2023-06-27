package typings.lezerGenerator

import typings.lezerCommon.mod.NodeType
import typings.lezerCommon.mod.Tree
import typings.lezerGenerator.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestMod {
  
  @JSImport("@lezer/generator/dist/test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileTests(file: String, fileName: String): js.Array[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileTests")(file.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Config]]
  inline def fileTests(file: String, fileName: String, mayIgnore: js.Function1[/* type */ NodeType, Boolean]): js.Array[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileTests")(file.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], mayIgnore.asInstanceOf[js.Any])).asInstanceOf[js.Array[Config]]
  
  inline def testTree(tree: Tree, expect: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testTree")(tree.asInstanceOf[js.Any], expect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def testTree(tree: Tree, expect: String, mayIgnore: js.Function1[/* type */ NodeType, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testTree")(tree.asInstanceOf[js.Any], expect.asInstanceOf[js.Any], mayIgnore.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
