package typings.japaneseCharacters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("japanese-characters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("japanese-characters", "hiragana")
  @js.native
  val hiragana: js.Array[String] = js.native
  
  @JSImport("japanese-characters", "katakana")
  @js.native
  val katakana: js.Array[String] = js.native
  
  inline def presentIn[T](input: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? boolean : false */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("presentIn")(input.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? boolean : false */ js.Any]
}
