package typings.jimpCore

import typings.jimpCore.jimpMod.Jimp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("@jimp/core/types/functions", "addConstants")
  @js.native
  def addConstants(constants: js.Tuple2[String, String | Double]): Unit = js.native
  @JSImport("@jimp/core/types/functions", "addConstants")
  @js.native
  def addConstants(constants: js.Tuple2[String, String | Double], jimpInstance: Jimp): Unit = js.native
  
  @JSImport("@jimp/core/types/functions", "addJimpMethods")
  @js.native
  def addJimpMethods(methods: js.Tuple2[String, js.Function]): Unit = js.native
  @JSImport("@jimp/core/types/functions", "addJimpMethods")
  @js.native
  def addJimpMethods(methods: js.Tuple2[String, js.Function], jimpInstance: Jimp): Unit = js.native
  
  @JSImport("@jimp/core/types/functions", "addType")
  @js.native
  def addType(mime: String, extensions: js.Array[String]): Unit = js.native
  
  @JSImport("@jimp/core/types/functions", "jimpEvChange")
  @js.native
  def jimpEvChange(methodName: String, method: js.Function): Unit = js.native
  
  @JSImport("@jimp/core/types/functions", "jimpEvMethod")
  @js.native
  def jimpEvMethod(methodName: String, evName: String, method: js.Function): Unit = js.native
}
