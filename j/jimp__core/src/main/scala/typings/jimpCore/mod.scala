package typings.jimpCore

import org.scalablytyped.runtime.Shortcut
import typings.jimpCore.jimpMod.Jimp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jimp/core", JSImport.Default)
  @js.native
  val default: Jimp = js.native
  
  @JSImport("@jimp/core", "addConstants")
  @js.native
  def addConstants(constants: js.Tuple2[String, String | Double]): Unit = js.native
  @JSImport("@jimp/core", "addConstants")
  @js.native
  def addConstants(constants: js.Tuple2[String, String | Double], jimpInstance: Jimp): Unit = js.native
  
  @JSImport("@jimp/core", "addJimpMethods")
  @js.native
  def addJimpMethods(methods: js.Tuple2[String, js.Function]): Unit = js.native
  @JSImport("@jimp/core", "addJimpMethods")
  @js.native
  def addJimpMethods(methods: js.Tuple2[String, js.Function], jimpInstance: Jimp): Unit = js.native
  
  @JSImport("@jimp/core", "addType")
  @js.native
  def addType(mime: String, extensions: js.Array[String]): Unit = js.native
  
  @JSImport("@jimp/core", "jimpEvChange")
  @js.native
  def jimpEvChange(methodName: String, method: js.Function): Unit = js.native
  
  @JSImport("@jimp/core", "jimpEvMethod")
  @js.native
  def jimpEvMethod(methodName: String, evName: String, method: js.Function): Unit = js.native
  
  type _To = Jimp
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Jimp = default
}
