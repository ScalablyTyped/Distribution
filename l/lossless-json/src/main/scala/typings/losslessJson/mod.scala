package typings.losslessJson

import typings.losslessJson.anon.CircularRefs
import typings.losslessJson.anon.CircularRefsBoolean
import typings.losslessJson.losslessJsonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lossless-json", "LosslessNumber")
  @js.native
  class LosslessNumber protected () extends StObject {
    def this(value: String) = this()
    def this(value: Double) = this()
    
    var isLosslessNumber: `true` = js.native
    
    var `type`: typings.losslessJson.losslessJsonStrings.LosslessNumber = js.native
    
    // value as string
    var value: String = js.native
  }
  
  @JSImport("lossless-json", "config")
  @js.native
  def config(): CircularRefsBoolean = js.native
  @JSImport("lossless-json", "config")
  @js.native
  def config(hasCircularRefs: CircularRefs): CircularRefsBoolean = js.native
  
  @JSImport("lossless-json", "parse")
  @js.native
  def parse(text: String): js.Any = js.native
  @JSImport("lossless-json", "parse")
  @js.native
  def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, _]): js.Any = js.native
  
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any): String = js.native
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[String | Double]): String = js.native
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[String | Double], space: String): String = js.native
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[String | Double], space: Double): String = js.native
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  @JSImport("lossless-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
}
